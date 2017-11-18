package cn.seits.modules.business.cm.web.controller.dutyController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.duty.Duty;
import cn.seits.modules.business.cm.model.duty.DutyExample;
import cn.seits.modules.business.cm.model.duty.DutyKey;
import cn.seits.modules.business.cm.model.duty.bo.CmDutyQueryBo;
import cn.seits.modules.business.cm.service.dutyService.IDutyService;
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

@RestController
@RequestMapping("/duty")
public class DutyAsyncController extends AbstractController {
    @Autowired
    private IDutyService dutyService;

    @RequestMapping("/insert")
    @RequiresPermissions("basic:duty:add")
    public R insertDuty(Duty duty) {
        int dataCode = dutyService.insert(duty);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateDuty(Duty record, DutyKey key) {
        BeanUtils.copyProperties(key, record);
        dutyService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteDuty(DutyKey key) {
        dutyService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/dutyPageInfo")
    public R getPageInfo(CmDutyQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);
        DutyExample example = new DutyExample();
        DutyExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getDutyName())) {
            criteria.andDutyNameLike("%"+queryBo.getDutyName()+"%");
        }
        List<Duty> list = this.dutyService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<Duty>(list);
        return R.ok().put("page", pageInfo);
    }

}
