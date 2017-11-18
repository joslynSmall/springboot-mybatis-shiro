package cn.seits.modules.business.bp.model.leaveRecord;

public class LeaveRecordKey {
    /**
     * 请假条id
     */
    private String leaveId;

    /**
     * 获取请假条id
     */
    public String getLeaveId() {
        return leaveId;
    }

    /**
     * 设置请假条id
     */
    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId == null ? null : leaveId.trim();
    }
}