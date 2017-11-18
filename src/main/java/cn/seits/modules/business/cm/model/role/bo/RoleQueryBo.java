package cn.seits.modules.business.cm.model.role.bo;

import cn.seits.common.bo.BaseQueryBo;

public class RoleQueryBo extends BaseQueryBo {

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
