package cn.seits.modules.business.cm.model.bugState;

import java.util.Date;

public class BugState extends BugStateKey {
    /**
     * Bug状态名称
     */
    private String bugStateName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取Bug状态名称
     */
    public String getBugStateName() {
        return bugStateName;
    }

    /**
     * 设置Bug状态名称
     */
    public void setBugStateName(String bugStateName) {
        this.bugStateName = bugStateName == null ? null : bugStateName.trim();
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