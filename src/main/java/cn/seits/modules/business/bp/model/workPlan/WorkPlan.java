package cn.seits.modules.business.bp.model.workPlan;

import java.util.Date;

public class WorkPlan extends WorkPlanKey {
    /**
     * 项目工作计划名称
     */
    private String workPlanName;

    /**
     * 项目工作计划内容
     */
    private String workPlanContent;

    /**
     * 计划制定人
     */
    private String employeeId;

    /**
     * 计划制定时间
     */
    private Date planEnactTime;

    /**
     * 计划完成小组
     */
    private String groupId;

    /**
     * 计划开始时间
     */
    private Date planStartTime;

    /**
     * 计划完成时间
     */
    private Date planCompleteTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取项目工作计划名称
     */
    public String getWorkPlanName() {
        return workPlanName;
    }

    /**
     * 设置项目工作计划名称
     */
    public void setWorkPlanName(String workPlanName) {
        this.workPlanName = workPlanName == null ? null : workPlanName.trim();
    }

    /**
     * 获取项目工作计划内容
     */
    public String getWorkPlanContent() {
        return workPlanContent;
    }

    /**
     * 设置项目工作计划内容
     */
    public void setWorkPlanContent(String workPlanContent) {
        this.workPlanContent = workPlanContent == null ? null : workPlanContent.trim();
    }

    /**
     * 获取计划制定人
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置计划制定人
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 获取计划制定时间
     */
    public Date getPlanEnactTime() {
        return planEnactTime;
    }

    /**
     * 设置计划制定时间
     */
    public void setPlanEnactTime(Date planEnactTime) {
        this.planEnactTime = planEnactTime;
    }

    /**
     * 获取计划完成小组
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置计划完成小组
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * 获取计划开始时间
     */
    public Date getPlanStartTime() {
        return planStartTime;
    }

    /**
     * 设置计划开始时间
     */
    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    /**
     * 获取计划完成时间
     */
    public Date getPlanCompleteTime() {
        return planCompleteTime;
    }

    /**
     * 设置计划完成时间
     */
    public void setPlanCompleteTime(Date planCompleteTime) {
        this.planCompleteTime = planCompleteTime;
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