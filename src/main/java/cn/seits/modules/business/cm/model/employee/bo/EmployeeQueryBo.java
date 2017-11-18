package cn.seits.modules.business.cm.model.employee.bo;


import cn.seits.common.bo.BaseQueryBo;

/**
 * @author 唐乙晧
 * @date 2017/11/10
 */
public class EmployeeQueryBo extends BaseQueryBo
{
    /**
     * 员工姓名
     */
    private String employeeName;

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
}
