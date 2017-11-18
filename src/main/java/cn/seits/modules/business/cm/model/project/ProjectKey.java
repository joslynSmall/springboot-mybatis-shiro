package cn.seits.modules.business.cm.model.project;

public class ProjectKey {
    /**
     * 项目Id
     */
    private String projectId;

    /**
     * 获取项目Id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目Id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }
}