package cn.seits.modules.business.cm.model.bugLevel;

import java.util.Date;

public class CmBugLevel extends CmBugLevelKey {
    /**
     * Bug等级名称
     */
    private String bugLevelName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取Bug等级名称
     */
    public String getBugLevelName() {
        return bugLevelName;
    }

    /**
     * 设置Bug等级名称
     */
    public void setBugLevelName(String bugLevelName) {
        this.bugLevelName = bugLevelName == null ? null : bugLevelName.trim();
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