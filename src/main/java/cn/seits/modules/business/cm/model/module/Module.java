package cn.seits.modules.business.cm.model.module;

import java.util.Date;

public class Module extends ModuleKey {
    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 项目Id
     */
    private String projectId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取模块名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 设置模块名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * 获取项目Id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目Id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
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