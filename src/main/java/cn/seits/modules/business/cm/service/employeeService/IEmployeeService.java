package cn.seits.modules.business.cm.service.employeeService;

import cn.seits.common.services.IBaseService;
import cn.seits.modules.business.cm.model.employee.Employee;
import cn.seits.modules.business.cm.model.employee.vo.EmployeeDvol;

import java.util.List;

/**
 * Created by 唐乙晧 on 2017/11/10.
 */
public interface IEmployeeService<EmployeeKey, EmployeeWithBLOBs, EmployeeExample> extends IBaseService<EmployeeKey, EmployeeWithBLOBs, EmployeeExample>
{
    List<EmployeeDvol> selectEmployeeList(EmployeeExample employeeExample);
}
