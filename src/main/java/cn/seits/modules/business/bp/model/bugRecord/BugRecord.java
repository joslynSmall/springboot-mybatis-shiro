package cn.seits.modules.business.bp.model.bugRecord;

import java.util.Date;

public class BugRecord extends BugRecordKey
{
    /**
     * 项目工作任务Id
     */
    private String workId;

    /**
     * 项目任务确认Id
     */
    private String taskConfirmId;

    /**
     * Bug等级Id
     */
    private String bugLevelId;

    /**
     * Bug记录时间
     */
    private Date bugRecordTime;

    /**
     * Bug记录人Id
     */
    private String bugRecordEmployeeId;

    /**
     * Bug描述
     */
    private String bugDesc;

    /**
     * Bug的状态
     */
    private String bugStateId;

    /**
     * 处理结果表
     */
    private String bugDealResult;

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
     * 获取项目任务确认Id
     */
    public String getTaskConfirmId() {
        return taskConfirmId;
    }

    /**
     * 设置项目任务确认Id
     */
    public void setTaskConfirmId(String taskConfirmId) {
        this.taskConfirmId = taskConfirmId == null ? null : taskConfirmId.trim();
    }

    /**
     * 获取Bug等级Id
     */
    public String getBugLevelId() {
        return bugLevelId;
    }

    /**
     * 设置Bug等级Id
     */
    public void setBugLevelId(String bugLevelId) {
        this.bugLevelId = bugLevelId == null ? null : bugLevelId.trim();
    }

    /**
     * 获取Bug记录时间
     */
    public Date getBugRecordTime() {
        return bugRecordTime;
    }

    /**
     * 设置Bug记录时间
     */
    public void setBugRecordTime(Date bugRecordTime) {
        this.bugRecordTime = bugRecordTime;
    }

    /**
     * 获取Bug记录人Id
     */
    public String getBugRecordEmployeeId() {
        return bugRecordEmployeeId;
    }

    /**
     * 设置Bug记录人Id
     */
    public void setBugRecordEmployeeId(String bugRecordEmployeeId) {
        this.bugRecordEmployeeId = bugRecordEmployeeId == null ? null : bugRecordEmployeeId.trim();
    }

    /**
     * 获取Bug描述
     */
    public String getBugDesc() {
        return bugDesc;
    }

    /**
     * 设置Bug描述
     */
    public void setBugDesc(String bugDesc) {
        this.bugDesc = bugDesc == null ? null : bugDesc.trim();
    }

    /**
     * 获取Bug的状态
     */
    public String getBugStateId() {
        return bugStateId;
    }

    /**
     * 设置Bug的状态
     */
    public void setBugStateId(String bugStateId) {
        this.bugStateId = bugStateId == null ? null : bugStateId.trim();
    }

    /**
     * 获取处理结果表
     */
    public String getBugDealResult() {
        return bugDealResult;
    }

    /**
     * 设置处理结果表
     */
    public void setBugDealResult(String bugDealResult) {
        this.bugDealResult = bugDealResult == null ? null : bugDealResult.trim();
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