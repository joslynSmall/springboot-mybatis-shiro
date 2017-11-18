package cn.seits.modules.business.cm.model.groupEmployeeRel;

public class GroupEmployeeRelKey {
    /**
     * 项目组Id
     */
    private String groupId;

    /**
     * 员工Id
     */
    private String employeeId;

    /**
     * 获取项目组Id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置项目组Id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
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