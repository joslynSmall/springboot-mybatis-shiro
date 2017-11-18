package cn.seits.modules.business.cm.model.technologyPreference;

public class TechnologyPreferenceKey {
    /**
     * 技术偏好Id
     */
    private String technologypreferenceId;

    /**
     * 获取技术偏好Id
     */
    public String getTechnologypreferenceId() {
        return technologypreferenceId;
    }

    /**
     * 设置技术偏好Id
     */
    public void setTechnologypreferenceId(String technologypreferenceId) {
        this.technologypreferenceId = technologypreferenceId == null ? null : technologypreferenceId.trim();
    }
}