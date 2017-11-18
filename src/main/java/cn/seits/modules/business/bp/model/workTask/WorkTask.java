package cn.seits.modules.business.bp.model.workTask;

import java.util.Date;

public class WorkTask extends WorkTaskKey {
    /**
     * 项目工作任务名称
     */
    private String workName;

    /**
     * 任务指定人
     */
    private String employeeId;

    /**
     * 项目工作计划id
     */
    private String workPlanId;

    /**
     * 关联项目Id
     */
    private String projectId;

    /**
     * 模块Id
     */
    private String moduleId;

    /**
     * 页面Id
     */
    private String pageId;

    /**
     * 功能点Id
     */
    private String functionId;

    /**
     * 任务制定时间
     */
    private Date workEnactTime;

    /**
     * 计划开始时间
     */
    private Date workStartTime;

    /**
     * 工作内容
     */
    private String workContent;

    /**
     * 任务计划完成时间
     */
    private Date workCompleteTime;

    /**
     * 任务进度（未开始/提交确认/确认中/已确认）
     */
    private String projectProgress;

    /**
     * 风险评估（无风险/有风险/失控）
     */
    private String riskEvalId;

    /**
     * 是否逾期
     */
    private String isOverdue;

    /**
     * 逾期原因
     */
    private String overdueReason;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取项目工作任务名称
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * 设置项目工作任务名称
     */
    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    /**
     * 获取任务指定人
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置任务指定人
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 获取项目工作计划id
     */
    public String getWorkPlanId() {
        return workPlanId;
    }

    /**
     * 设置项目工作计划id
     */
    public void setWorkPlanId(String workPlanId) {
        this.workPlanId = workPlanId == null ? null : workPlanId.trim();
    }

    /**
     * 获取关联项目Id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置关联项目Id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 获取模块Id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * 设置模块Id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    /**
     * 获取页面Id
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * 设置页面Id
     */
    public void setPageId(String pageId) {
        this.pageId = pageId == null ? null : pageId.trim();
    }

    /**
     * 获取功能点Id
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * 设置功能点Id
     */
    public void setFunctionId(String functionId) {
        this.functionId = functionId == null ? null : functionId.trim();
    }

    /**
     * 获取任务制定时间
     */
    public Date getWorkEnactTime() {
        return workEnactTime;
    }

    /**
     * 设置任务制定时间
     */
    public void setWorkEnactTime(Date workEnactTime) {
        this.workEnactTime = workEnactTime;
    }

    /**
     * 获取计划开始时间
     */
    public Date getWorkStartTime() {
        return workStartTime;
    }

    /**
     * 设置计划开始时间
     */
    public void setWorkStartTime(Date workStartTime) {
        this.workStartTime = workStartTime;
    }

    /**
     * 获取工作内容
     */
    public String getWorkContent() {
        return workContent;
    }

    /**
     * 设置工作内容
     */
    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    /**
     * 获取任务计划完成时间
     */
    public Date getWorkCompleteTime() {
        return workCompleteTime;
    }

    /**
     * 设置任务计划完成时间
     */
    public void setWorkCompleteTime(Date workCompleteTime) {
        this.workCompleteTime = workCompleteTime;
    }

    /**
     * 获取任务进度（未开始/提交确认/确认中/已确认）
     */
    public String getProjectProgress() {
        return projectProgress;
    }

    /**
     * 设置任务进度（未开始/提交确认/确认中/已确认）
     */
    public void setProjectProgress(String projectProgress) {
        this.projectProgress = projectProgress == null ? null : projectProgress.trim();
    }

    /**
     * 获取风险评估（无风险/有风险/失控）
     */
    public String getRiskEvalId() {
        return riskEvalId;
    }

    /**
     * 设置风险评估（无风险/有风险/失控）
     */
    public void setRiskEvalId(String riskEvalId) {
        this.riskEvalId = riskEvalId == null ? null : riskEvalId.trim();
    }

    /**
     * 获取是否逾期
     */
    public String getIsOverdue() {
        return isOverdue;
    }

    /**
     * 设置是否逾期
     */
    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue == null ? null : isOverdue.trim();
    }

    /**
     * 获取逾期原因
     */
    public String getOverdueReason() {
        return overdueReason;
    }

    /**
     * 设置逾期原因
     */
    public void setOverdueReason(String overdueReason) {
        this.overdueReason = overdueReason == null ? null : overdueReason.trim();
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