package cn.seits.modules.business.cm.model.techPreEmployeeRel;

public class TechPreEmployeeRelKey {
    /**
     * 技术偏好Id
     */
    private String technologypreferenceId;

    /**
     * 员工Id
     */
    private String employeeId;

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

    /**
     * 获取员工Id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置员工Id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }
}