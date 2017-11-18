package cn.seits.modules.business.bp.model.taskConfirm;

public class TaskConfirmKey {
    /**
     * 项目任务确认Id
     */
    private String taskConfirmId;

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
}