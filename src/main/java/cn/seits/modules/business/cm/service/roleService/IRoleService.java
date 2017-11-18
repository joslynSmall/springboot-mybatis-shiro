package cn.seits.modules.business.cm.service.roleService;

import cn.seits.common.services.IBaseService;

public interface IRoleService<RoleKey, Role, RoleExample> extends IBaseService<RoleKey, Role, RoleExample> {
    int insertOrtherTest(Role record);
}
