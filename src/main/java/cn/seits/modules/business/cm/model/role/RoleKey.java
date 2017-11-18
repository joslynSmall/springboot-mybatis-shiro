package cn.seits.modules.business.cm.model.role;

public class RoleKey {
    /**
     * 角色id
     */
    private String roleId;

    /**
     * 获取角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}