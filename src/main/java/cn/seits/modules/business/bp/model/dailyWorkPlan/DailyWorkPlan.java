package cn.seits.modules.business.bp.model.dailyWorkPlan;

import java.util.Date;

public class DailyWorkPlan extends DailyWorkPlanKey {
    /**
     * 日常工作计划名称
     */
    private String dailyWorkPlanName;

    /**
     * 日常工作计划内容
     */
    private String dailyWorkPlanContent;

    /**
     * 计划制定人
     */
    private String enactEmployeeId;

    /**
     * 计划完成人
     */
    private String finishEmployeeId;

    /**
     * 计划制定时间
     */
    private Date planEnactTime;

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
     * 获取日常工作计划名称
     */
    public String getDailyWorkPlanName() {
        return dailyWorkPlanName;
    }

    /**
     * 设置日常工作计划名称
     */
    public void setDailyWorkPlanName(String dailyWorkPlanName) {
        this.dailyWorkPlanName = dailyWorkPlanName == null ? null : dailyWorkPlanName.trim();
    }

    /**
     * 获取日常工作计划内容
     */
    public String getDailyWorkPlanContent() {
        return dailyWorkPlanContent;
    }

    /**
     * 设置日常工作计划内容
     */
    public void setDailyWorkPlanContent(String dailyWorkPlanContent) {
        this.dailyWorkPlanContent = dailyWorkPlanContent == null ? null : dailyWorkPlanContent.trim();
    }

    /**
     * 获取计划制定人
     */
    public String getEnactEmployeeId() {
        return enactEmployeeId;
    }

    /**
     * 设置计划制定人
     */
    public void setEnactEmployeeId(String enactEmployeeId) {
        this.enactEmployeeId = enactEmployeeId == null ? null : enactEmployeeId.trim();
    }

    /**
     * 获取计划完成人
     */
    public String getFinishEmployeeId() {
        return finishEmployeeId;
    }

    /**
     * 设置计划完成人
     */
    public void setFinishEmployeeId(String finishEmployeeId) {
        this.finishEmployeeId = finishEmployeeId == null ? null : finishEmployeeId.trim();
    }

    public Date getPlanEnactTime() {
        return planEnactTime;
    }

    public void setPlanEnactTime(Date planEnactTime) {
        this.planEnactTime = planEnactTime;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanCompleteTime() {
        return planCompleteTime;
    }

    public void setPlanCompleteTime(Date planCompleteTime) {
        this.planCompleteTime = planCompleteTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}