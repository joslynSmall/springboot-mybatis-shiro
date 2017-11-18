package cn.seits.modules.business.bp.service.workPlanService;

import cn.seits.common.services.IBaseService;
import cn.seits.modules.business.bp.model.workPlan.bo.WorkPlanDvol;

import java.util.List;

public interface IWorkPlanService<WorkPlanKey, WorkPlan, WorkPlanExample> extends IBaseService<WorkPlanKey, WorkPlan, WorkPlanExample>{
    int insertOrtherTest(WorkPlan record);

    List<WorkPlanDvol> selectWorkPlanList(WorkPlanExample example);
}
