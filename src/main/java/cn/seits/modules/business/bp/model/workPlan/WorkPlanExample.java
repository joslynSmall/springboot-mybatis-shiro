package cn.seits.modules.business.bp.model.workPlan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * PMS_CM_WORKPLAN 2017-11-13
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWorkPlanIdIsNull() {
            addCriterion("WORK_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdIsNotNull() {
            addCriterion("WORK_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdEqualTo(String value) {
            addCriterion("WORK_PLAN_ID =", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdNotEqualTo(String value) {
            addCriterion("WORK_PLAN_ID <>", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdGreaterThan(String value) {
            addCriterion("WORK_PLAN_ID >", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PLAN_ID >=", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdLessThan(String value) {
            addCriterion("WORK_PLAN_ID <", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdLessThanOrEqualTo(String value) {
            addCriterion("WORK_PLAN_ID <=", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdLike(String value) {
            addCriterion("WORK_PLAN_ID like", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdNotLike(String value) {
            addCriterion("WORK_PLAN_ID not like", value, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdIn(List<String> values) {
            addCriterion("WORK_PLAN_ID in", values, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdNotIn(List<String> values) {
            addCriterion("WORK_PLAN_ID not in", values, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdBetween(String value1, String value2) {
            addCriterion("WORK_PLAN_ID between", value1, value2, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanIdNotBetween(String value1, String value2) {
            addCriterion("WORK_PLAN_ID not between", value1, value2, "workPlanId");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameIsNull() {
            addCriterion("WORK_PLAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameIsNotNull() {
            addCriterion("WORK_PLAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameEqualTo(String value) {
            addCriterion("WORK_PLAN_NAME =", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameNotEqualTo(String value) {
            addCriterion("WORK_PLAN_NAME <>", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameGreaterThan(String value) {
            addCriterion("WORK_PLAN_NAME >", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PLAN_NAME >=", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameLessThan(String value) {
            addCriterion("WORK_PLAN_NAME <", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameLessThanOrEqualTo(String value) {
            addCriterion("WORK_PLAN_NAME <=", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameLike(String value) {
            addCriterion("WORK_PLAN_NAME like", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameNotLike(String value) {
            addCriterion("WORK_PLAN_NAME not like", value, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameIn(List<String> values) {
            addCriterion("WORK_PLAN_NAME in", values, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameNotIn(List<String> values) {
            addCriterion("WORK_PLAN_NAME not in", values, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameBetween(String value1, String value2) {
            addCriterion("WORK_PLAN_NAME between", value1, value2, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanNameNotBetween(String value1, String value2) {
            addCriterion("WORK_PLAN_NAME not between", value1, value2, "workPlanName");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentIsNull() {
            addCriterion("WORK_PLAN_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentIsNotNull() {
            addCriterion("WORK_PLAN_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentEqualTo(String value) {
            addCriterion("WORK_PLAN_CONTENT =", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentNotEqualTo(String value) {
            addCriterion("WORK_PLAN_CONTENT <>", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentGreaterThan(String value) {
            addCriterion("WORK_PLAN_CONTENT >", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PLAN_CONTENT >=", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentLessThan(String value) {
            addCriterion("WORK_PLAN_CONTENT <", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentLessThanOrEqualTo(String value) {
            addCriterion("WORK_PLAN_CONTENT <=", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentLike(String value) {
            addCriterion("WORK_PLAN_CONTENT like", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentNotLike(String value) {
            addCriterion("WORK_PLAN_CONTENT not like", value, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentIn(List<String> values) {
            addCriterion("WORK_PLAN_CONTENT in", values, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentNotIn(List<String> values) {
            addCriterion("WORK_PLAN_CONTENT not in", values, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentBetween(String value1, String value2) {
            addCriterion("WORK_PLAN_CONTENT between", value1, value2, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andWorkPlanContentNotBetween(String value1, String value2) {
            addCriterion("WORK_PLAN_CONTENT not between", value1, value2, "workPlanContent");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeIsNull() {
            addCriterion("PLAN_ENACT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeIsNotNull() {
            addCriterion("PLAN_ENACT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeEqualTo(Date value) {
            addCriterion("PLAN_ENACT_TIME =", value, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeNotEqualTo(Date value) {
            addCriterion("PLAN_ENACT_TIME <>", value, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeGreaterThan(Date value) {
            addCriterion("PLAN_ENACT_TIME >", value, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_ENACT_TIME >=", value, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeLessThan(Date value) {
            addCriterion("PLAN_ENACT_TIME <", value, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_ENACT_TIME <=", value, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeIn(List<Date> values) {
            addCriterion("PLAN_ENACT_TIME in", values, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeNotIn(List<Date> values) {
            addCriterion("PLAN_ENACT_TIME not in", values, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_ENACT_TIME between", value1, value2, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andPlanEnactTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_ENACT_TIME not between", value1, value2, "planEnactTime");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNull() {
            addCriterion("PLAN_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNotNull() {
            addCriterion("PLAN_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeEqualTo(Date value) {
            addCriterion("PLAN_START_TIME =", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <>", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThan(Date value) {
            addCriterion("PLAN_START_TIME >", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME >=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThan(Date value) {
            addCriterion("PLAN_START_TIME <", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_START_TIME <=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIn(List<Date> values) {
            addCriterion("PLAN_START_TIME in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotIn(List<Date> values) {
            addCriterion("PLAN_START_TIME not in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_START_TIME not between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeIsNull() {
            addCriterion("PLAN_COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeIsNotNull() {
            addCriterion("PLAN_COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeEqualTo(Date value) {
            addCriterion("PLAN_COMPLETE_TIME =", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeNotEqualTo(Date value) {
            addCriterion("PLAN_COMPLETE_TIME <>", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeGreaterThan(Date value) {
            addCriterion("PLAN_COMPLETE_TIME >", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_COMPLETE_TIME >=", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeLessThan(Date value) {
            addCriterion("PLAN_COMPLETE_TIME <", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_COMPLETE_TIME <=", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeIn(List<Date> values) {
            addCriterion("PLAN_COMPLETE_TIME in", values, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeNotIn(List<Date> values) {
            addCriterion("PLAN_COMPLETE_TIME not in", values, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("PLAN_COMPLETE_TIME between", value1, value2, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_COMPLETE_TIME not between", value1, value2, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 描述:PMS_CM_WORKPLAN表的实体类
     * @version
     * @author:  DK_Tyh
     * @创建时间: 2017-11-13
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PMS_CM_WORKPLAN 2017-11-13
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}