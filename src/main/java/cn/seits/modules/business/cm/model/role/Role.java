package cn.seits.modules.business.cm.model.role;

import java.util.Date;

public class Role extends RoleKey {
    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取角色类型
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    /**
     * 获取创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}