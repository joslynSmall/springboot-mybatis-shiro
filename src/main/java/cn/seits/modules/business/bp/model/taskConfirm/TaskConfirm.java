package cn.seits.modules.business.bp.model.taskConfirm;

import java.util.Date;

public class TaskConfirm extends TaskConfirmKey {
    /**
     * 项目任务确认名称
     */
    private String taskConfirmName;

    /**
     * 项目工作计划Id
     */
    private String workPlanId;

    /**
     * 项目工作任务Id
     */
    private String workId;

    /**
     * 任务提交时间
     */
    private Date taskSubmitTime;

    /**
     * 任务确认时间
     */
    private Date confirmTime;

    /**
     * 确认人Id
     */
    private String taskConfirmEmployeeId;

    /**
     * 任务确认结果Id
     */
    private String taskConfirmResultId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取项目任务确认名称
     */
    public String getTaskConfirmName() {
        return taskConfirmName;
    }

    /**
     * 设置项目任务确认名称
     */
    public void setTaskConfirmName(String taskConfirmName) {
        this.taskConfirmName = taskConfirmName == null ? null : taskConfirmName.trim();
    }

    /**
     * 获取项目工作计划Id
     */
    public String getWorkPlanId() {
        return workPlanId;
    }

    /**
     * 设置项目工作计划Id
     */
    public void setWorkPlanId(String workPlanId) {
        this.workPlanId = workPlanId == null ? null : workPlanId.trim();
    }

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
     * 获取任务提交时间
     */
    public Date getTaskSubmitTime() {
        return taskSubmitTime;
    }

    /**
     * 设置任务提交时间
     */
    public void setTaskSubmitTime(Date taskSubmitTime) {
        this.taskSubmitTime = taskSubmitTime;
    }

    /**
     * 获取任务确认时间
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置任务确认时间
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取确认人Id
     */
    public String getTaskConfirmEmployeeId() {
        return taskConfirmEmployeeId;
    }

    /**
     * 设置确认人Id
     */
    public void setTaskConfirmEmployeeId(String taskConfirmEmployeeId) {
        this.taskConfirmEmployeeId = taskConfirmEmployeeId == null ? null : taskConfirmEmployeeId.trim();
    }

    /**
     * 获取任务确认结果Id
     */
    public String getTaskConfirmResultId() {
        return taskConfirmResultId;
    }

    /**
     * 设置任务确认结果Id
     */
    public void setTaskConfirmResultId(String taskConfirmResultId) {
        this.taskConfirmResultId = taskConfirmResultId == null ? null : taskConfirmResultId.trim();
    }

    /**
     * 获取备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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