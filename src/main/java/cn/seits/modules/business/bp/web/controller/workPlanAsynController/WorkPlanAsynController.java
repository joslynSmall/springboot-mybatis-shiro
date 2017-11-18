package cn.seits.modules.business.bp.web.controller.workPlanAsynController;

import cn.seits.common.utils.DateUtils;
import cn.seits.common.utils.R;
import cn.seits.modules.business.bp.model.workPlan.WorkPlan;
import cn.seits.modules.business.bp.model.workPlan.WorkPlanExample;
import cn.seits.modules.business.bp.model.workPlan.WorkPlanKey;
import cn.seits.modules.business.bp.model.workPlan.bo.WorkPlanDvol;
import cn.seits.modules.business.bp.model.workPlan.bo.WorkPlanQueryBo;
import cn.seits.modules.business.bp.service.workPlanService.IWorkPlanService;
import cn.seits.modules.sys.controller.AbstractController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guanwangwei on 2017/10/12.
 */
@RestController
@RequestMapping("/workPlan")
public class WorkPlanAsynController extends AbstractController {
    @Autowired
    private IWorkPlanService workPlanService;

    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:workPlan:add")
    public R insertWorkPlan(WorkPlan record) {
        int dataCode = workPlanService.insert(record);
        return R.ok();
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @RequestMapping("/update")
    public R updateWorkPlan(WorkPlan record,WorkPlanKey key) {
        BeanUtils.copyProperties(key, record);
        workPlanService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @RequestMapping("/delete")
    public R deleteWorkPlan(WorkPlanKey key) {
        workPlanService.deleteByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 查看单个实体
     * @param key
     * @return
     */
    @RequestMapping("/getWorkPlanInfo")
    public R getWorkPlanInfo( WorkPlanKey key) {
        workPlanService.selectByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 分页查询
     * @param queryBo
     * @return
     */
    @RequestMapping("/workPlanPageInfo")
    public R getWorkPlanInfoList(WorkPlanQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        WorkPlanExample example = new WorkPlanExample();
        WorkPlanExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getWorkPlanName())){
            criteria.andWorkPlanNameLike("%"+queryBo.getWorkPlanName()+"%");
        }
        if (StringUtils.isNotBlank(queryBo.getGroupId())){
            criteria.andGroupIdEqualTo(queryBo.getGroupId());
        }
//        if (StringUtils.isNotBlank(DateUtils.format(queryBo.getPlanEnactTimeStart(),"yyyy-MM-dd HH:mm:ss")) &&
//                StringUtils.isNotEmpty(DateUtils.format(queryBo.getPlanEnactTimeEnd(),"yyyy-MM-dd HH:mm:ss"))){
//            criteria.andPlanEnactTimeBetween(queryBo.getPlanEnactTimeStart(),
//                    queryBo.getPlanEnactTimeEnd());
//        }

        List<WorkPlanDvol> list = this.workPlanService.selectWorkPlanList(example);
        PageInfo pageInfo =  new PageInfo<WorkPlanDvol>(list);
        return R.ok().put("page",pageInfo);
    }

}
