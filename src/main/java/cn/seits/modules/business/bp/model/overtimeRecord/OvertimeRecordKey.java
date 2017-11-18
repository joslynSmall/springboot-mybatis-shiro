package cn.seits.modules.business.bp.model.overtimeRecord;

public class OvertimeRecordKey {
    /**
     * 加班记录表Id
     */
    private String overtimerecordId;

    /**
     * 获取加班记录表Id
     */
    public String getOvertimerecordId() {
        return overtimerecordId;
    }

    /**
     * 设置加班记录表Id
     */
    public void setOvertimerecordId(String overtimerecordId) {
        this.overtimerecordId = overtimerecordId == null ? null : overtimerecordId.trim();
    }
}