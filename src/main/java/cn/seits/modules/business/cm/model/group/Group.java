package cn.seits.modules.business.cm.model.group;

import java.util.Date;

public class Group extends GroupKey {
    /**
     * 项目组名称
     */
    private String groupName;

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
     * 获取项目组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置项目组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
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