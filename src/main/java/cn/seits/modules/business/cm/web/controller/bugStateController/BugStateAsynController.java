package cn.seits.modules.business.cm.web.controller.bugStateController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.bugState.BugState;
import cn.seits.modules.business.cm.model.bugState.BugStateExample;
import cn.seits.modules.business.cm.model.bugState.BugStateKey;
import cn.seits.modules.business.cm.model.bugState.bo.BugStateQueryBo;
import cn.seits.modules.business.cm.service.bugStateService.IBugStateService;
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
@RequestMapping("/bugState")
public class BugStateAsynController  extends AbstractController{
    @Autowired
    private IBugStateService bugStateService;
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:functionType:add")
    public R insertBugState(BugState bugState) {
        int dataCode =bugStateService.insert(bugState);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateBugState(BugState record, BugStateKey key) {
        BeanUtils.copyProperties(key, record);
        bugStateService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteBugState(BugStateKey key) {
        bugStateService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/bugStatePageInfo")
    public R getPageInfo(BugStateQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        BugStateExample example = new BugStateExample();
        BugStateExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getBugStateName())){
            criteria.andBugStateNameLike("%"+queryBo.getBugStateName()+"%");
        }
        List<BugState> list = this.bugStateService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<BugState>(list);
        return R.ok().put("page",pageInfo);
    }

}
