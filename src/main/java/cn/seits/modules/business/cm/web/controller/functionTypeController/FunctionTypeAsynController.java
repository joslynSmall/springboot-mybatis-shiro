package cn.seits.modules.business.cm.web.controller.functionTypeController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevel;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelKey;
import cn.seits.modules.business.cm.model.functionType.FunctionType;
import cn.seits.modules.business.cm.model.functionType.FunctionTypeExample;
import cn.seits.modules.business.cm.model.functionType.FunctionTypeKey;
import cn.seits.modules.business.cm.model.functionType.bo.FunctionTypeQueryBo;
import cn.seits.modules.business.cm.service.functionTypeService.IFunctionTypeService;
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
@RequestMapping("/functionType")
public class FunctionTypeAsynController extends AbstractController {

    @Autowired
    private IFunctionTypeService functionTypeService;


    @RequestMapping("/insert")
    //@RequiresPermissions("basic:functionType:add")
    public R insertFunctionType(FunctionType functionType) {
        int dataCode = functionTypeService.insert(functionType);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateFunctionType(FunctionType record, FunctionTypeKey key) {
        BeanUtils.copyProperties(key, record);
        functionTypeService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteFunctionType(FunctionTypeKey key) {
        functionTypeService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/functionTypePageInfo")
    public R getPageInfo(FunctionTypeQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        FunctionTypeExample example = new FunctionTypeExample();
        FunctionTypeExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getFunctionTypeName())){
            criteria.andFunctionTypeNameLike("%"+queryBo.getFunctionTypeName()+"%");
        }
        List<FunctionType> list = this.functionTypeService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<FunctionType>(list);
        return R.ok().put("page",pageInfo);
    }

}
