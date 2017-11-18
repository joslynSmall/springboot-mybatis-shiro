package cn.seits.modules.business.bp.model.conferenceRecord;

import java.util.Date;

public class ConferenceRecord extends ConferenceRecordKey {
    /**
     * 项目Id
     */
    private String projectId;

    /**
     * 会议主题
     */
    private String conferenceTheme;

    /**
     * 会议内容
     */
    private String conferenceContent;

    /**
     * 会议开始时间
     */
    private Date conferenceStartTime;

    /**
     * 会议结束时间
     */
    private Date conferenceEndTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取项目Id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目Id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 获取会议主题
     */
    public String getConferenceTheme() {
        return conferenceTheme;
    }

    /**
     * 设置会议主题
     */
    public void setConferenceTheme(String conferenceTheme) {
        this.conferenceTheme = conferenceTheme == null ? null : conferenceTheme.trim();
    }

    /**
     * 获取会议内容
     */
    public String getConferenceContent() {
        return conferenceContent;
    }

    /**
     * 设置会议内容
     */
    public void setConferenceContent(String conferenceContent) {
        this.conferenceContent = conferenceContent == null ? null : conferenceContent.trim();
    }

    /**
     * 获取会议开始时间
     */
    public Date getConferenceStartTime() {
        return conferenceStartTime;
    }

    /**
     * 设置会议开始时间
     */
    public void setConferenceStartTime(Date conferenceStartTime) {
        this.conferenceStartTime = conferenceStartTime;
    }

    /**
     * 获取会议结束时间
     */
    public Date getConferenceEndTime() {
        return conferenceEndTime;
    }

    /**
     * 设置会议结束时间
     */
    public void setConferenceEndTime(Date conferenceEndTime) {
        this.conferenceEndTime = conferenceEndTime;
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