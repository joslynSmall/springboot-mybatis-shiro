package cn.seits.modules.business.cm.service.employeeService.impl;

import cn.seits.modules.business.cm.dao.crud.dutyMapper.DutyMapper;
import cn.seits.modules.business.cm.dao.crud.employeeMapper.EmployeeMapper;
import cn.seits.modules.business.cm.model.duty.DutyKey;
import cn.seits.modules.business.cm.model.employee.Employee;
import cn.seits.modules.business.cm.model.employee.EmployeeExample;
import cn.seits.modules.business.cm.model.employee.EmployeeKey;
import cn.seits.modules.business.cm.model.employee.EmployeeWithBLOBs;
import cn.seits.modules.business.cm.model.employee.vo.EmployeeDvol;
import cn.seits.modules.business.cm.service.employeeService.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 唐乙晧 on 2017/11/10.
 */
@Service
public class EmployeeService implements IEmployeeService<EmployeeKey, EmployeeWithBLOBs, EmployeeExample>
{
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DutyMapper dutyMapper;

    @Override
    public List<EmployeeDvol> selectEmployeeList(EmployeeExample employeeExample)
    {
        List<EmployeeDvol> listDvol = new ArrayList<EmployeeDvol>();
        List<Employee> list = this.employeeMapper.selectByExample(employeeExample);
        DutyKey dutyKey = new DutyKey();
        if (list.size() > 0)
        {
            for (Employee employee : list)
            {
                EmployeeDvol employeeDvol = new EmployeeDvol();
                dutyKey.setDutyId(employee.getDutyId());

                if (dutyMapper.selectByPrimaryKey(dutyKey) != null)
                {
                    employeeDvol.setDutyName(dutyMapper.selectByPrimaryKey(dutyKey).getDutyName());
                }
                else
                {
                    employeeDvol.setDutyName(employee.getDutyId());
                }
                BeanUtils.copyProperties(employee, employeeDvol);
                listDvol.add(employeeDvol);
            }
        }
        return listDvol;
    }

    @Override
    public int countByExample(EmployeeExample employeeExample)
    {
        return this.employeeMapper.countByExample(employeeExample);
    }

    @Override
    public int deleteByExample(EmployeeExample employeeExample)
    {
        return this.employeeMapper.deleteByExample(employeeExample);
    }

    @Override
    public int deleteByPrimaryKey(EmployeeKey employeeKey)
    {
        return this.employeeMapper.deleteByPrimaryKey(employeeKey);
    }

    @Override
    public int insert(EmployeeWithBLOBs record)
    {
        return this.employeeMapper.insert(record);
    }

    @Override
    public int insertSelective(EmployeeWithBLOBs record)
    {
        return this.employeeMapper.insertSelective(record);
    }

    @Override
    public List<EmployeeWithBLOBs> selectByExample(EmployeeExample employeeExample)
    {
        return this.employeeMapper.selectByExampleWithBLOBs(employeeExample);
    }

    @Override
    public EmployeeWithBLOBs selectByPrimaryKey(EmployeeKey employeeKey)
    {
        return this.employeeMapper.selectByPrimaryKey(employeeKey);
    }

    @Override
    public int updateByExampleSelective(EmployeeWithBLOBs record, EmployeeExample employeeExample)
    {
        return this.employeeMapper.updateByExampleSelective(record, employeeExample);
    }

    @Override
    public int updateByExample(EmployeeWithBLOBs record, EmployeeExample employeeExample)
    {
        return this.employeeMapper.updateByExample(record, employeeExample);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeeWithBLOBs record)
    {
        return this.employeeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EmployeeWithBLOBs record)
    {
        return this.employeeMapper.updateByPrimaryKey(record);
    }
}
