package cn.seits.modules.business.cm.web.controller.overtimeTimeController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTime;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTimeExample;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTimeKey;
import cn.seits.modules.business.cm.model.overtimeTime.bo.OvertimeTimeQueryBo;
import cn.seits.modules.business.cm.service.OvertimeTimeService.IOvertimeTimeService;
import cn.seits.modules.sys.controller.AbstractController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/overtimeTime")
public class OvertimeTimeAsynController extends AbstractController{

    @Autowired
    private IOvertimeTimeService overtimeTimeService;
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:functionType:add")
    public R insertDifficultLevel(OvertimeTime overtimeTime) {
        int dataCode = overtimeTimeService.insert(overtimeTime);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateDifficultLevel(OvertimeTime record, OvertimeTimeKey key) {
        BeanUtils.copyProperties(key, record);
        overtimeTimeService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteDifficultLevel(OvertimeTimeKey key) {
        overtimeTimeService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/overtimeTimePageInfo")
    public R getPageInfo(OvertimeTimeQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        OvertimeTimeExample example = new OvertimeTimeExample();
        OvertimeTimeExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getOvertimetimeName())){
            criteria.andOvertimetimeNameLike("%"+queryBo.getOvertimetimeName()+"%");
        }
        List<OvertimeTime> list = this.overtimeTimeService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<OvertimeTime>(list);
        return R.ok().put("page",pageInfo);
    }

}
