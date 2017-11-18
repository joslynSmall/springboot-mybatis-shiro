package cn.seits.modules.business.cm.model.duty;

public class DutyKey {
    /**
     * 职位Id
     */
    private String dutyId;

    /**
     * 获取职位Id
     */
    public String getDutyId() {
        return dutyId;
    }

    /**
     * 设置职位Id
     */
    public void setDutyId(String dutyId) {
        this.dutyId = dutyId == null ? null : dutyId.trim();
    }
}