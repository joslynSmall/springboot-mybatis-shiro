package cn.seits.modules.business.bp.model.leaveRecord;

import java.util.Date;

public class LeaveRecord extends LeaveRecordKey {
    /**
     * 请假人姓名
     */
    private String employeeId;

    /**
     * 请假事由
     */
    private String leaveReasons;

    /**
     * 请假日期
     */
    private Date leaveTime;

    /**
     * 请假类型
     */
    private String leaveType;

    /**
     * 请假时间段
     */
    private String leaveTimeQuantum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取请假人姓名
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置请假人姓名
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 获取请假事由
     */
    public String getLeaveReasons() {
        return leaveReasons;
    }

    /**
     * 设置请假事由
     */
    public void setLeaveReasons(String leaveReasons) {
        this.leaveReasons = leaveReasons == null ? null : leaveReasons.trim();
    }

    /**
     * 获取请假日期
     */
    public Date getLeaveTime() {
        return leaveTime;
    }

    /**
     * 设置请假日期
     */
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * 获取请假类型
     */
    public String getLeaveType() {
        return leaveType;
    }

    /**
     * 设置请假类型
     */
    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType == null ? null : leaveType.trim();
    }

    /**
     * 获取请假时间段
     */
    public String getLeaveTimeQuantum() {
        return leaveTimeQuantum;
    }

    /**
     * 设置请假时间段
     */
    public void setLeaveTimeQuantum(String leaveTimeQuantum) {
        this.leaveTimeQuantum = leaveTimeQuantum == null ? null : leaveTimeQuantum.trim();
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