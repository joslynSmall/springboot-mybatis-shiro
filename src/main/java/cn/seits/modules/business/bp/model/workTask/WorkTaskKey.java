package cn.seits.modules.business.bp.model.workTask;

public class WorkTaskKey {
    /**
     * 项目工作任务Id
     */
    private String workId;

    /**
     * 获取项目工作任务Id
     */
    public String getWorkId() {
        return workId;
    }

    /**
     * 设置项目工作任务Id
     */
    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }
}