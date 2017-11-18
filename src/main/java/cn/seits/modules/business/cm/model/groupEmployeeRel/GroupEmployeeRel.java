package cn.seits.modules.business.cm.model.groupEmployeeRel;

import java.util.Date;

public class GroupEmployeeRel extends GroupEmployeeRelKey {
    /**
     * 是否是组长
     */
    private String isGroupleader;

    /**
     * 是否是开发人员
     */
    private String isDeveloper;

    /**
     * 是否是测试人员
     */
    private String isTester;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取是否是组长
     */
    public String getIsGroupleader() {
        return isGroupleader;
    }

    /**
     * 设置是否是组长
     */
    public void setIsGroupleader(String isGroupleader) {
        this.isGroupleader = isGroupleader == null ? null : isGroupleader.trim();
    }

    /**
     * 获取是否是开发人员
     */
    public String getIsDeveloper() {
        return isDeveloper;
    }

    /**
     * 设置是否是开发人员
     */
    public void setIsDeveloper(String isDeveloper) {
        this.isDeveloper = isDeveloper == null ? null : isDeveloper.trim();
    }

    /**
     * 获取是否是测试人员
     */
    public String getIsTester() {
        return isTester;
    }

    /**
     * 设置是否是测试人员
     */
    public void setIsTester(String isTester) {
        this.isTester = isTester == null ? null : isTester.trim();
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