package cn.seits.modules.business.cm.web.controller.employee;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.employee.Employee;
import cn.seits.modules.business.cm.model.employee.EmployeeExample;
import cn.seits.modules.business.cm.model.employee.EmployeeKey;
import cn.seits.modules.business.cm.model.employee.EmployeeWithBLOBs;
import cn.seits.modules.business.cm.model.employee.bo.EmployeeQueryBo;
import cn.seits.modules.business.cm.service.employeeService.IEmployeeService;
import cn.seits.modules.sys.controller.AbstractController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeAsynController extends AbstractController
{
    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/insert")
    @RequiresPermissions("basic:employee:add")
    public R insertEmployee(EmployeeWithBLOBs employee)
    {
        int dataCode = this.employeeService.insert(employee);
        return R.ok();
    }

    @RequestMapping("/update")
    public R updateEmployee(EmployeeWithBLOBs record, EmployeeKey key)
    {
        BeanUtils.copyProperties(key, record);
        this.employeeService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    @RequestMapping("/delete")
    public R deleteEmployee(EmployeeKey key)
    {
        this.employeeService.deleteByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/getEmployeeInfo")
    public R getEmployeeInfo(EmployeeKey key)
    {
        this.employeeService.selectByPrimaryKey(key);
        return R.ok();
    }

    @RequestMapping("/getEmployeeList")
    public R getEmployeeList(EmployeeQueryBo queryBo)
    {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getEmployeeName()))
        {
            criteria.andEmployeeNameLike("%" + queryBo.getEmployeeName() + "%");
        }
        List<Employee> list = this.employeeService.selectEmployeeList(example);
        PageInfo pageInfo = new PageInfo<Employee>(list);
        return R.ok().put("page", pageInfo);
    }
}
