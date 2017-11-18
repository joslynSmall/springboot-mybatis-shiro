package cn.seits.modules.business.cm.web.controller.bugLevelController;

import cn.seits.modules.business.cm.service.bugLevelService.IBugLevelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevel;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelExample;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelKey;
import cn.seits.modules.sys.controller.AbstractController;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.seits.modules.business.cm.model.bugLevel.bo.CmBugLevelQueryBo;

import java.util.List;

/**
 * Created by joslyn on 2017/9/12.
 */
@RestController
//@CrossOrigin
@RequestMapping("/bugLevel")
public class BugLevelAsynController extends AbstractController {

    @Autowired
    private IBugLevelService bugLevelService;

    @RequestMapping("/insert")
    @RequiresPermissions("basic:bugLevel:add")
    public R insertBugLevel(CmBugLevel cmBugLevel) {
        int dataCode = bugLevelService.insert(cmBugLevel);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateBugLevel(CmBugLevel record, CmBugLevelKey key) {
        BeanUtils.copyProperties(key, record);
        bugLevelService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteBugLevel(CmBugLevelKey key) {
        bugLevelService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/bugLevelPageInfo")
    public R getPageInfo(CmBugLevelQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        CmBugLevelExample example = new CmBugLevelExample();
        CmBugLevelExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getBugLevelName())) {
            criteria.andBugLevelNameEqualTo(queryBo.getBugLevelName());
        }
        List<CmBugLevel> list = this.bugLevelService.selectByExample(example);
        PageInfo pageInfo = new PageInfo<CmBugLevel>(list);
        return R.ok().put("page", pageInfo);
    }
}
