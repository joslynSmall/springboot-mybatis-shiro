package cn.seits.modules.business.cm.model.overtimeTime;

import java.util.Date;

public class OvertimeTime extends OvertimeTimeKey {
    /**
     * 时段名称
     */
    private String overtimetimeName;

    /**
     * 时段类型
     */
    private String overtimetimeType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取时段名称
     */
    public String getOvertimetimeName() {
        return overtimetimeName;
    }

    /**
     * 设置时段名称
     */
    public void setOvertimetimeName(String overtimetimeName) {
        this.overtimetimeName = overtimetimeName == null ? null : overtimetimeName.trim();
    }

    /**
     * 获取时段类型
     */
    public String getOvertimetimeType() {
        return overtimetimeType;
    }

    /**
     * 设置时段类型
     */
    public void setOvertimetimeType(String overtimetimeType) {
        this.overtimetimeType = overtimetimeType == null ? null : overtimetimeType.trim();
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