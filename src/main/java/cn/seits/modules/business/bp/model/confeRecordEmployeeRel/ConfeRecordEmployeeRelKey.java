package cn.seits.modules.business.bp.model.confeRecordEmployeeRel;

public class ConfeRecordEmployeeRelKey {
    /**
     * 会议记录id
     */
    private String conferenceRecordId;

    /**
     * 员工Id
     */
    private String employeeId;

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

    /**
     * 获取员工Id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置员工Id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }
}