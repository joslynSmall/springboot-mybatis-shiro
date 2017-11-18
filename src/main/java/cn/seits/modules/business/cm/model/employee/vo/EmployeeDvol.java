package cn.seits.modules.business.cm.model.employee.vo;

import cn.seits.modules.business.cm.model.employee.Employee;

/**
 * @author 唐乙晧
 * @date 2017/11/10
 */
public class EmployeeDvol extends Employee
{
    /**
     * 职位名称
     */
    private String dutyName;

    public String getDutyName()
    {
        return dutyName;
    }

    public void setDutyName(String dutyName)
    {
        this.dutyName = dutyName;
    }
}
