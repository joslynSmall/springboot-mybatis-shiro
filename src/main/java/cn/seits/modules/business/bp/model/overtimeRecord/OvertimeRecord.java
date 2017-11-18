package cn.seits.modules.business.bp.model.overtimeRecord;

import java.util.Date;

public class OvertimeRecord extends OvertimeRecordKey {
    /**
     * 项目工作任务Id
     */
    private String workId;

    /**
     * 申请加班人员Id
     */
    private String applyovertimeemployeeId;

    /**
     * 审核加班申请人员id
     */
    private String checkemployeeId;

    /**
     * 加班时段Id
     */
    private String overtimetimeId;

    /**
     * 加班日期
     */
    private Date overtimeTime;

    /**
     * 加班原因
     */
    private String overtimeReason;

    /**
     * 是否是节假日加班
     */
    private String isHoliday;

    /**
     * 情况是否属实
     */
    private String isReality;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取项目工作任务Id
     */
    public String getWorkId() {
        return workId;
    }

    /**
     * 设置项目工作任务Id
     */
    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    /**
     * 获取申请加班人员Id
     */
    public String getApplyovertimeemployeeId() {
        return applyovertimeemployeeId;
    }

    /**
     * 设置申请加班人员Id
     */
    public void setApplyovertimeemployeeId(String applyovertimeemployeeId) {
        this.applyovertimeemployeeId = applyovertimeemployeeId == null ? null : applyovertimeemployeeId.trim();
    }

    /**
     * 获取审核加班申请人员id
     */
    public String getCheckemployeeId() {
        return checkemployeeId;
    }

    /**
     * 设置审核加班申请人员id
     */
    public void setCheckemployeeId(String checkemployeeId) {
        this.checkemployeeId = checkemployeeId == null ? null : checkemployeeId.trim();
    }

    /**
     * 获取加班时段Id
     */
    public String getOvertimetimeId() {
        return overtimetimeId;
    }

    /**
     * 设置加班时段Id
     */
    public void setOvertimetimeId(String overtimetimeId) {
        this.overtimetimeId = overtimetimeId == null ? null : overtimetimeId.trim();
    }

    /**
     * 获取加班日期
     */
    public Date getOvertimeTime() {
        return overtimeTime;
    }

    /**
     * 设置加班日期
     */
    public void setOvertimeTime(Date overtimeTime) {
        this.overtimeTime = overtimeTime;
    }

    /**
     * 获取加班原因
     */
    public String getOvertimeReason() {
        return overtimeReason;
    }

    /**
     * 设置加班原因
     */
    public void setOvertimeReason(String overtimeReason) {
        this.overtimeReason = overtimeReason == null ? null : overtimeReason.trim();
    }

    /**
     * 获取是否是节假日加班
     */
    public String getIsHoliday() {
        return isHoliday;
    }

    /**
     * 设置是否是节假日加班
     */
    public void setIsHoliday(String isHoliday) {
        this.isHoliday = isHoliday == null ? null : isHoliday.trim();
    }

    /**
     * 获取情况是否属实
     */
    public String getIsReality() {
        return isReality;
    }

    /**
     * 设置情况是否属实
     */
    public void setIsReality(String isReality) {
        this.isReality = isReality == null ? null : isReality.trim();
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