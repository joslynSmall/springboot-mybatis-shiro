package cn.seits.modules.business.cm.model.overtimeTime;

public class OvertimeTimeKey {
    /**
     * 时段Id
     */
    private String overtimetimeId;

    /**
     * 获取时段Id
     */
    public String getOvertimetimeId() {
        return overtimetimeId;
    }

    /**
     * 设置时段Id
     */
    public void setOvertimetimeId(String overtimetimeId) {
        this.overtimetimeId = overtimetimeId == null ? null : overtimetimeId.trim();
    }
}