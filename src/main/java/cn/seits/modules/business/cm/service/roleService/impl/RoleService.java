package cn.seits.modules.business.cm.service.roleService.impl;



import cn.seits.modules.business.cm.dao.crud.roleMapper.RoleMapper;
import cn.seits.modules.business.cm.model.role.Role;
import cn.seits.modules.business.cm.model.role.RoleExample;
import cn.seits.modules.business.cm.model.role.RoleKey;
import cn.seits.modules.business.cm.service.roleService.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService<RoleKey, Role, RoleExample> {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int insertOrtherTest(Role record) {
        return 0;
    }

    @Override
    public int countByExample(RoleExample example) {
        return roleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RoleExample example) {
        return roleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(RoleKey key) {
        return roleMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public List<Role> selectByExample(RoleExample example) {
        return roleMapper.selectByExample(example);
    }

    @Override
    public Role selectByPrimaryKey(RoleKey key) {
        return roleMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Role record, RoleExample example) {
        return roleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Role record, RoleExample example) {
        return roleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }
}
