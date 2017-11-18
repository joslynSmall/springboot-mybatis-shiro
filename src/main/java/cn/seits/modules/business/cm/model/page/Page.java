package cn.seits.modules.business.cm.model.page;

import java.util.Date;

public class Page extends PageKey {
    /**
     * 页面名称
     */
    private String pageName;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 模块id
     */
    private String moduleId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取页面名称
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * 设置页面名称
     */
    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    /**
     * 获取项目id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 获取模块id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * 设置模块id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
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