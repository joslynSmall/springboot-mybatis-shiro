package cn.seits.modules.business.cm.dao.crud.roleMapper;

import cn.seits.modules.business.cm.model.role.Role;
import cn.seits.modules.business.cm.model.role.RoleExample;
import cn.seits.modules.business.cm.model.role.RoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(RoleKey key);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(RoleKey key);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}