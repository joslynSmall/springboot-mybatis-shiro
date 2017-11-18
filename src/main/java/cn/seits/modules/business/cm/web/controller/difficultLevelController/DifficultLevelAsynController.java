package cn.seits.modules.business.cm.web.controller.difficultLevelController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.difficultLevel.DifficultLevel;
import cn.seits.modules.business.cm.model.difficultLevel.DifficultLevelExample;
import cn.seits.modules.business.cm.model.difficultLevel.DifficultLevelKey;
import cn.seits.modules.business.cm.model.difficultLevel.bo.DifficultLevelQueryBo;
import cn.seits.modules.business.cm.service.difficultLevelService.IDifficultLevelService;
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
@RequestMapping("/difficultLevel")
public class DifficultLevelAsynController extends AbstractController{

    @Autowired
    private IDifficultLevelService difficultLevelService;
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:functionType:add")
    public R insertDifficultLevel(DifficultLevel difficultLevel) {
        int dataCode = difficultLevelService.insert(difficultLevel);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateDifficultLevel(DifficultLevel record, DifficultLevelKey key) {
        BeanUtils.copyProperties(key, record);
        difficultLevelService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteDifficultLevel(DifficultLevelKey key) {
        difficultLevelService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/difficultLevelPageInfo")
    public R getPageInfo(DifficultLevelQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        DifficultLevelExample example = new DifficultLevelExample();
        DifficultLevelExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getDifficultyLevelName())){
            criteria.andDifficultyLevelNameLike("%"+queryBo.getDifficultyLevelName()+"%");
        }
        List<DifficultLevel> list = this.difficultLevelService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<DifficultLevel>(list);
        return R.ok().put("page",pageInfo);
    }

}
