package cn.seits.modules.business.bp.model.workPlan;

public class WorkPlanKey {
    /**
     * 项目工作计划Id
     */
    private String workPlanId;

    /**
     * 获取项目工作计划Id
     */
    public String getWorkPlanId() {
        return workPlanId;
    }

    /**
     * 设置项目工作计划Id
     */
    public void setWorkPlanId(String workPlanId) {
        this.workPlanId = workPlanId == null ? null : workPlanId.trim();
    }
}