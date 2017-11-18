package cn.seits.modules.business.bp.service.dailyWorkPlanService.impl;

import cn.seits.modules.business.bp.dao.crud.dailyWorkPlanMapper.DailyWorkPlanMapper;
import cn.seits.modules.business.bp.model.dailyWorkPlan.DailyWorkPlan;
import cn.seits.modules.business.bp.model.dailyWorkPlan.DailyWorkPlanExample;
import cn.seits.modules.business.bp.model.dailyWorkPlan.DailyWorkPlanKey;
import cn.seits.modules.business.bp.model.dailyWorkPlan.bo.CmDailyWorkPlanQueryBo;
import cn.seits.modules.business.bp.service.dailyWorkPlanService.IDailyWorkPlanService;
import cn.seits.modules.business.cm.dao.crud.employeeMapper.EmployeeMapper;
import cn.seits.modules.business.cm.model.employee.Employee;
import cn.seits.modules.business.cm.model.employee.EmployeeExample;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DailyWorkPlanService implements IDailyWorkPlanService<DailyWorkPlanKey, DailyWorkPlan, DailyWorkPlanExample> {
    @Autowired
    private DailyWorkPlanMapper dailyWorkPlanMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int countByExample(DailyWorkPlanExample example) {
        return dailyWorkPlanMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DailyWorkPlanExample example) {
        return dailyWorkPlanMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(DailyWorkPlanKey key) {
        return dailyWorkPlanMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(DailyWorkPlan record) {
        return dailyWorkPlanMapper.insert(record);
    }

    @Override
    public int insertSelective(DailyWorkPlan record) {
        return dailyWorkPlanMapper.insertSelective(record);
    }

    @Override
    public List<DailyWorkPlan> selectByExample(DailyWorkPlanExample example) {
        return dailyWorkPlanMapper.selectByExample(example);
    }

    @Override
    public DailyWorkPlan selectByPrimaryKey(DailyWorkPlanKey key) {
        return dailyWorkPlanMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(DailyWorkPlan record, DailyWorkPlanExample example) {
        return dailyWorkPlanMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DailyWorkPlan record, DailyWorkPlanExample example) {
        return dailyWorkPlanMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(DailyWorkPlan record) {
        return dailyWorkPlanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DailyWorkPlan record) {
        return dailyWorkPlanMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(DailyWorkPlan record) {
        return 0;
    }
    @Override
    public List<DailyWorkPlan> getDailyWorkPlanList(CmDailyWorkPlanQueryBo queryBo) {
        DailyWorkPlanExample example = new DailyWorkPlanExample();
        DailyWorkPlanExample.Criteria criteria = example.createCriteria();
        List<String> listId = new ArrayList<String>();
        Map<String, String> mapId = new HashMap<String, String>();
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria employeeExampleCriteria = employeeExample.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getEnactEmployeeName())) {
            employeeExampleCriteria.andEmployeeNameLike("%"+ queryBo.getEnactEmployeeName() +"%");
        } else {
            employeeExampleCriteria.andEmployeeNameIsNotNull();
        }
        List<Employee> employee = this.employeeMapper.selectByExample(employeeExample);
        for (int i = 0; i < employee.size(); i++) {
            listId.add(employee.get(i).getEmployeeId());
            mapId.put(employee.get(i).getEmployeeId(), employee.get(i).getEmployeeName());
        }
        if (employee.size() == 0) {
            listId.add("-1");
        }
        criteria.andEnactEmployeeIdIn(listId);
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (StringUtils.isNotBlank(queryBo.getEnactTimeStart())) {
            try {
                criteria.andPlanEnactTimeGreaterThanOrEqualTo(sdf.parse(queryBo.getEnactTimeStart()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (StringUtils.isNotBlank(queryBo.getEnactTimeEnd())) {
            try {
                criteria.andPlanEnactTimeLessThanOrEqualTo(sdf.parse(queryBo.getEnactTimeEnd()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<DailyWorkPlan> list = this.selectByExample(example);
        for (int i = 0; i < list.size(); i++) {
            for (String key : mapId.keySet()) {
                if (key.equals(list.get(i).getEnactEmployeeId())) {
                    list.get(i).setEnactEmployeeId(mapId.get(key));
                }
            }
        }
        return list;
    }
}
