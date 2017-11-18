package cn.seits.modules.business.cm.web.controller.technologyPreferenceController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreference;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreferenceExample;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreferenceKey;
import cn.seits.modules.business.cm.model.technologyPreference.bo.TechnologyPreferenceQueryBo;
import cn.seits.modules.business.cm.service.technologyPreferenceService.ITechnologyPreferenceService;
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
@RequestMapping("/technologyPreference")
public class TechnologyPreferenceAsynController extends AbstractController{
    @Autowired
    private ITechnologyPreferenceService technologyPreferenceService;
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:functionType:add")
    public R insertTechnologyPreference(TechnologyPreference technologyPreference) {
        int dataCode = technologyPreferenceService.insert(technologyPreference);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateTechnologyPreference(TechnologyPreference record, TechnologyPreferenceKey key) {
        BeanUtils.copyProperties(key, record);
        technologyPreferenceService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteTechnologyPreference(TechnologyPreferenceKey key) {
        technologyPreferenceService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/technologyPreferencePageInfo")
    public R getPageInfo(TechnologyPreferenceQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        TechnologyPreferenceExample example = new TechnologyPreferenceExample();
        TechnologyPreferenceExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getTechnologyPreferenceName())){
            criteria.andTechnologypreferenceNameLike("%"+queryBo.getTechnologyPreferenceName()+"%");
        }
        List<TechnologyPreference> list = this.technologyPreferenceService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<TechnologyPreference>(list);
        return R.ok().put("page",pageInfo);
    }

}
