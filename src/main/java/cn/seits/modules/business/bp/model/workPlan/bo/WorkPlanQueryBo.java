package cn.seits.modules.business.bp.model.workPlan.bo;

import cn.seits.common.bo.BaseQueryBo;

import java.util.Date;

public class WorkPlanQueryBo extends BaseQueryBo{
    private String workPlanName;
    private Date planEnactTimeStart;
    private Date planEnactTimeEnd;
    private String groupId;


    public String getWorkPlanName() {
        return workPlanName;
    }

    public void setWorkPlanName(String workPlanName) {
        this.workPlanName = workPlanName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getPlanEnactTimeStart() {
        return planEnactTimeStart;
    }

    public void setPlanEnactTimeStart(Date planEnactTimeStart) {
        this.planEnactTimeStart = planEnactTimeStart;
    }

    public Date getPlanEnactTimeEnd() {
        return planEnactTimeEnd;
    }

    public void setPlanEnactTimeEnd(Date planEnactTimeEnd) {
        this.planEnactTimeEnd = planEnactTimeEnd;
    }
}
