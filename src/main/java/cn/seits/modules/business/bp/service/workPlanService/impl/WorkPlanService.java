package cn.seits.modules.business.bp.service.workPlanService.impl;


import cn.seits.modules.business.bp.dao.crud.workPlanMapper.WorkPlanMapper;
import cn.seits.modules.business.bp.model.workPlan.WorkPlan;
import cn.seits.modules.business.bp.model.workPlan.WorkPlanExample;
import cn.seits.modules.business.bp.model.workPlan.WorkPlanKey;
import cn.seits.modules.business.bp.model.workPlan.bo.WorkPlanDvol;
import cn.seits.modules.business.bp.service.workPlanService.IWorkPlanService;
import cn.seits.modules.business.cm.dao.crud.employeeMapper.EmployeeMapper;
import cn.seits.modules.business.cm.dao.crud.groupMapper.GroupMapper;
import cn.seits.modules.business.cm.model.employee.EmployeeKey;
import cn.seits.modules.business.cm.model.group.GroupKey;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkPlanService implements IWorkPlanService<WorkPlanKey, WorkPlan, WorkPlanExample> {
    @Autowired
    private WorkPlanMapper workPlanMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private GroupMapper groupMapper;

    @Override
    public int countByExample(WorkPlanExample example) {
        return workPlanMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WorkPlanExample example) {
        return workPlanMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(WorkPlanKey key) {
        return workPlanMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(WorkPlan record) {
        return workPlanMapper.insert(record);
    }

    @Override
    public int insertSelective(WorkPlan record) {
        return workPlanMapper.insertSelective(record);
    }

    @Override
    public List<WorkPlan> selectByExample(WorkPlanExample example) {
        return workPlanMapper.selectByExample(example);
    }

    @Override
    public WorkPlan selectByPrimaryKey(WorkPlanKey key) {
        return workPlanMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(WorkPlan record, WorkPlanExample example) {
        return workPlanMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(WorkPlan record, WorkPlanExample example) {
        return workPlanMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(WorkPlan record) {
        return workPlanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WorkPlan record) {
        return workPlanMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(WorkPlan record) {
        return 0;
    }

    @Override
    public List<WorkPlanDvol> selectWorkPlanList(WorkPlanExample example) {
        List<WorkPlanDvol> listDvol=new ArrayList<WorkPlanDvol>();
        List<WorkPlan> list=workPlanMapper.selectByExample(example);
        GroupKey groupKey=new GroupKey();
        EmployeeKey employeeKey=new EmployeeKey();
        if(list.size()>0){
            for (WorkPlan workPlan: list){
                WorkPlanDvol workPlanDvol=new WorkPlanDvol();
                groupKey.setGroupId(workPlan.getGroupId());
                employeeKey.setEmployeeId(workPlan.getEmployeeId());
                if(employeeMapper.selectByPrimaryKey(employeeKey)!=null){
                    workPlanDvol.setEmployeeName(employeeMapper.selectByPrimaryKey(employeeKey).getEmployeeName());
                }else {
                    workPlanDvol.setEmployeeName(workPlan.getEmployeeId());
                }
                if(groupMapper.selectByPrimaryKey(groupKey)!=null){
                    workPlanDvol.setGroupName(groupMapper.selectByPrimaryKey(groupKey).getGroupName());
                }else{
                    workPlanDvol.setGroupName(workPlan.getGroupId());
                }
                BeanUtils.copyProperties(workPlan,workPlanDvol);
                listDvol.add(workPlanDvol);
            }
        }
        return listDvol;
    }
}
