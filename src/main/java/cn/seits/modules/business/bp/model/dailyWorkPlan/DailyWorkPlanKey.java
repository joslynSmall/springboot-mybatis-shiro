package cn.seits.modules.business.bp.model.dailyWorkPlan;

public class DailyWorkPlanKey {
    /**
     * 日常工作计划Id
     */
    private String dailyWorkPlanId;

    /**
     * 获取日常工作计划Id
     */
    public String getDailyWorkPlanId() {
        return dailyWorkPlanId;
    }

    /**
     * 设置日常工作计划Id
     */
    public void setDailyWorkPlanId(String dailyWorkPlanId) {
        this.dailyWorkPlanId = dailyWorkPlanId == null ? null : dailyWorkPlanId.trim();
    }
}