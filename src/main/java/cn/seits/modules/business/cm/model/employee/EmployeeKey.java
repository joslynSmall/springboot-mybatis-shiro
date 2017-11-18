package cn.seits.modules.business.cm.model.employee;

public class EmployeeKey {
    /**
     * 员工Id
     */
    private String employeeId;

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