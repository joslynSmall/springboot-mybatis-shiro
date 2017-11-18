package cn.seits.modules.business.cm.web.controller.roleController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.role.Role;
import cn.seits.modules.business.cm.model.role.RoleExample;
import cn.seits.modules.business.cm.model.role.RoleKey;
import cn.seits.modules.business.cm.model.role.bo.RoleQueryBo;
import cn.seits.modules.business.cm.service.roleService.IRoleService;
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
@RequestMapping("/role")
public class RoleAsynController extends AbstractController {
    @Autowired
    private IRoleService roleService;
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:functionType:add")
    public R insertRole(Role role) {
        int dataCode = roleService.insert(role);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateRole(Role record, RoleKey key) {
        BeanUtils.copyProperties(key, record);
        roleService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteRole(RoleKey key) {
        roleService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/rolePageInfo")
    public R getPageInfo(RoleQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getRoleName())){
            criteria.andRoleNameLike("%"+queryBo.getRoleName()+"%");
        }
        List<Role> list = this.roleService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<Role>(list);
        return R.ok().put("page",pageInfo);
    }

}
