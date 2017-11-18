package cn.seits.modules.business.cm.model.employee;

import java.util.Date;

public class Employee extends EmployeeKey {
    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 职位Id
     */
    private String dutyId;

    /**
     * 技术偏好id
     */
    private String technologypreferenceId;

    /**
     * 工龄（年）
     */
    private Integer workingYears;

    /**
     * 入职时间
     */
    private Date hireTime;

    /**
     * 邮箱
     */
    private String email;

    /**
     * QQ号码
     */
    private String qqno;

    /**
     * 联系方式
     */
    private String linkno;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取员工姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置员工姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * 获取性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取职位Id
     */
    public String getDutyId() {
        return dutyId;
    }

    /**
     * 设置职位Id
     */
    public void setDutyId(String dutyId) {
        this.dutyId = dutyId == null ? null : dutyId.trim();
    }

    /**
     * 获取技术偏好id
     */
    public String getTechnologypreferenceId() {
        return technologypreferenceId;
    }

    /**
     * 设置技术偏好id
     */
    public void setTechnologypreferenceId(String technologypreferenceId) {
        this.technologypreferenceId = technologypreferenceId == null ? null : technologypreferenceId.trim();
    }

    /**
     * 获取工龄（年）
     */
    public Integer getWorkingYears() {
        return workingYears;
    }

    /**
     * 设置工龄（年）
     */
    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    /**
     * 获取入职时间
     */
    public Date getHireTime() {
        return hireTime;
    }

    /**
     * 设置入职时间
     */
    public void setHireTime(Date hireTime) {
        this.hireTime = hireTime;
    }

    /**
     * 获取邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取QQ号码
     */
    public String getQqno() {
        return qqno;
    }

    /**
     * 设置QQ号码
     */
    public void setQqno(String qqno) {
        this.qqno = qqno == null ? null : qqno.trim();
    }

    /**
     * 获取联系方式
     */
    public String getLinkno() {
        return linkno;
    }

    /**
     * 设置联系方式
     */
    public void setLinkno(String linkno) {
        this.linkno = linkno == null ? null : linkno.trim();
    }

    /**
     * 获取创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}