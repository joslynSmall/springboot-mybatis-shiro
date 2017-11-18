package cn.seits.modules.business.bp.model.conferenceRecord;

public class ConferenceRecordKey {
    /**
     * 会议记录id
     */
    private String conferenceRecordId;

    /**
     * 获取会议记录id
     */
    public String getConferenceRecordId() {
        return conferenceRecordId;
    }

    /**
     * 设置会议记录id
     */
    public void setConferenceRecordId(String conferenceRecordId) {
        this.conferenceRecordId = conferenceRecordId == null ? null : conferenceRecordId.trim();
    }
}