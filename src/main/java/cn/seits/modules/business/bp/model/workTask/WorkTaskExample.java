package cn.seits.modules.business.bp.model.workTask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkTaskExample() {
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
     * PMS_CM_WORKTASK 2017-11-09
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

        public Criteria andWorkIdIsNull() {
            addCriterion("WORK_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("WORK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(String value) {
            addCriterion("WORK_ID =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(String value) {
            addCriterion("WORK_ID <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(String value) {
            addCriterion("WORK_ID >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ID >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(String value) {
            addCriterion("WORK_ID <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(String value) {
            addCriterion("WORK_ID <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLike(String value) {
            addCriterion("WORK_ID like", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotLike(String value) {
            addCriterion("WORK_ID not like", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<String> values) {
            addCriterion("WORK_ID in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<String> values) {
            addCriterion("WORK_ID not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(String value1, String value2) {
            addCriterion("WORK_ID between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(String value1, String value2) {
            addCriterion("WORK_ID not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNull() {
            addCriterion("WORK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("WORK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("WORK_NAME =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("WORK_NAME <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("WORK_NAME >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_NAME >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("WORK_NAME <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("WORK_NAME <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("WORK_NAME like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("WORK_NAME not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("WORK_NAME in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("WORK_NAME not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("WORK_NAME between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("WORK_NAME not between", value1, value2, "workName");
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

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNull() {
            addCriterion("PAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNotNull() {
            addCriterion("PAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPageIdEqualTo(String value) {
            addCriterion("PAGE_ID =", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotEqualTo(String value) {
            addCriterion("PAGE_ID <>", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThan(String value) {
            addCriterion("PAGE_ID >", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAGE_ID >=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThan(String value) {
            addCriterion("PAGE_ID <", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThanOrEqualTo(String value) {
            addCriterion("PAGE_ID <=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLike(String value) {
            addCriterion("PAGE_ID like", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotLike(String value) {
            addCriterion("PAGE_ID not like", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdIn(List<String> values) {
            addCriterion("PAGE_ID in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotIn(List<String> values) {
            addCriterion("PAGE_ID not in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdBetween(String value1, String value2) {
            addCriterion("PAGE_ID between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotBetween(String value1, String value2) {
            addCriterion("PAGE_ID not between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNull() {
            addCriterion("FUNCTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("FUNCTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(String value) {
            addCriterion("FUNCTION_ID =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(String value) {
            addCriterion("FUNCTION_ID <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(String value) {
            addCriterion("FUNCTION_ID >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_ID >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(String value) {
            addCriterion("FUNCTION_ID <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_ID <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLike(String value) {
            addCriterion("FUNCTION_ID like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotLike(String value) {
            addCriterion("FUNCTION_ID not like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<String> values) {
            addCriterion("FUNCTION_ID in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<String> values) {
            addCriterion("FUNCTION_ID not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(String value1, String value2) {
            addCriterion("FUNCTION_ID between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_ID not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeIsNull() {
            addCriterion("WORK_ENACT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeIsNotNull() {
            addCriterion("WORK_ENACT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeEqualTo(Date value) {
            addCriterion("WORK_ENACT_TIME =", value, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeNotEqualTo(Date value) {
            addCriterion("WORK_ENACT_TIME <>", value, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeGreaterThan(Date value) {
            addCriterion("WORK_ENACT_TIME >", value, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_ENACT_TIME >=", value, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeLessThan(Date value) {
            addCriterion("WORK_ENACT_TIME <", value, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeLessThanOrEqualTo(Date value) {
            addCriterion("WORK_ENACT_TIME <=", value, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeIn(List<Date> values) {
            addCriterion("WORK_ENACT_TIME in", values, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeNotIn(List<Date> values) {
            addCriterion("WORK_ENACT_TIME not in", values, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeBetween(Date value1, Date value2) {
            addCriterion("WORK_ENACT_TIME between", value1, value2, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkEnactTimeNotBetween(Date value1, Date value2) {
            addCriterion("WORK_ENACT_TIME not between", value1, value2, "workEnactTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeIsNull() {
            addCriterion("WORK_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeIsNotNull() {
            addCriterion("WORK_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeEqualTo(Date value) {
            addCriterion("WORK_START_TIME =", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotEqualTo(Date value) {
            addCriterion("WORK_START_TIME <>", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeGreaterThan(Date value) {
            addCriterion("WORK_START_TIME >", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_START_TIME >=", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeLessThan(Date value) {
            addCriterion("WORK_START_TIME <", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("WORK_START_TIME <=", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeIn(List<Date> values) {
            addCriterion("WORK_START_TIME in", values, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotIn(List<Date> values) {
            addCriterion("WORK_START_TIME not in", values, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeBetween(Date value1, Date value2) {
            addCriterion("WORK_START_TIME between", value1, value2, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("WORK_START_TIME not between", value1, value2, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkContentIsNull() {
            addCriterion("WORK_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andWorkContentIsNotNull() {
            addCriterion("WORK_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkContentEqualTo(String value) {
            addCriterion("WORK_CONTENT =", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotEqualTo(String value) {
            addCriterion("WORK_CONTENT <>", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentGreaterThan(String value) {
            addCriterion("WORK_CONTENT >", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_CONTENT >=", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentLessThan(String value) {
            addCriterion("WORK_CONTENT <", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentLessThanOrEqualTo(String value) {
            addCriterion("WORK_CONTENT <=", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentLike(String value) {
            addCriterion("WORK_CONTENT like", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotLike(String value) {
            addCriterion("WORK_CONTENT not like", value, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentIn(List<String> values) {
            addCriterion("WORK_CONTENT in", values, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotIn(List<String> values) {
            addCriterion("WORK_CONTENT not in", values, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentBetween(String value1, String value2) {
            addCriterion("WORK_CONTENT between", value1, value2, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkContentNotBetween(String value1, String value2) {
            addCriterion("WORK_CONTENT not between", value1, value2, "workContent");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeIsNull() {
            addCriterion("WORK_COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeIsNotNull() {
            addCriterion("WORK_COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeEqualTo(Date value) {
            addCriterion("WORK_COMPLETE_TIME =", value, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeNotEqualTo(Date value) {
            addCriterion("WORK_COMPLETE_TIME <>", value, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeGreaterThan(Date value) {
            addCriterion("WORK_COMPLETE_TIME >", value, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_COMPLETE_TIME >=", value, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeLessThan(Date value) {
            addCriterion("WORK_COMPLETE_TIME <", value, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("WORK_COMPLETE_TIME <=", value, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeIn(List<Date> values) {
            addCriterion("WORK_COMPLETE_TIME in", values, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeNotIn(List<Date> values) {
            addCriterion("WORK_COMPLETE_TIME not in", values, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("WORK_COMPLETE_TIME between", value1, value2, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andWorkCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("WORK_COMPLETE_TIME not between", value1, value2, "workCompleteTime");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIsNull() {
            addCriterion("PROJECT_PROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIsNotNull() {
            addCriterion("PROJECT_PROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressEqualTo(String value) {
            addCriterion("PROJECT_PROGRESS =", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotEqualTo(String value) {
            addCriterion("PROJECT_PROGRESS <>", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGreaterThan(String value) {
            addCriterion("PROJECT_PROGRESS >", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_PROGRESS >=", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLessThan(String value) {
            addCriterion("PROJECT_PROGRESS <", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_PROGRESS <=", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLike(String value) {
            addCriterion("PROJECT_PROGRESS like", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotLike(String value) {
            addCriterion("PROJECT_PROGRESS not like", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIn(List<String> values) {
            addCriterion("PROJECT_PROGRESS in", values, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotIn(List<String> values) {
            addCriterion("PROJECT_PROGRESS not in", values, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressBetween(String value1, String value2) {
            addCriterion("PROJECT_PROGRESS between", value1, value2, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotBetween(String value1, String value2) {
            addCriterion("PROJECT_PROGRESS not between", value1, value2, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdIsNull() {
            addCriterion("RISK_EVAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdIsNotNull() {
            addCriterion("RISK_EVAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdEqualTo(String value) {
            addCriterion("RISK_EVAL_ID =", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdNotEqualTo(String value) {
            addCriterion("RISK_EVAL_ID <>", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdGreaterThan(String value) {
            addCriterion("RISK_EVAL_ID >", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_EVAL_ID >=", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdLessThan(String value) {
            addCriterion("RISK_EVAL_ID <", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdLessThanOrEqualTo(String value) {
            addCriterion("RISK_EVAL_ID <=", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdLike(String value) {
            addCriterion("RISK_EVAL_ID like", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdNotLike(String value) {
            addCriterion("RISK_EVAL_ID not like", value, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdIn(List<String> values) {
            addCriterion("RISK_EVAL_ID in", values, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdNotIn(List<String> values) {
            addCriterion("RISK_EVAL_ID not in", values, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdBetween(String value1, String value2) {
            addCriterion("RISK_EVAL_ID between", value1, value2, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andRiskEvalIdNotBetween(String value1, String value2) {
            addCriterion("RISK_EVAL_ID not between", value1, value2, "riskEvalId");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNull() {
            addCriterion("IS_OVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNotNull() {
            addCriterion("IS_OVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueEqualTo(String value) {
            addCriterion("IS_OVERDUE =", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotEqualTo(String value) {
            addCriterion("IS_OVERDUE <>", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThan(String value) {
            addCriterion("IS_OVERDUE >", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OVERDUE >=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThan(String value) {
            addCriterion("IS_OVERDUE <", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("IS_OVERDUE <=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLike(String value) {
            addCriterion("IS_OVERDUE like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotLike(String value) {
            addCriterion("IS_OVERDUE not like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIn(List<String> values) {
            addCriterion("IS_OVERDUE in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotIn(List<String> values) {
            addCriterion("IS_OVERDUE not in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueBetween(String value1, String value2) {
            addCriterion("IS_OVERDUE between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotBetween(String value1, String value2) {
            addCriterion("IS_OVERDUE not between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonIsNull() {
            addCriterion("OVERDUE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonIsNotNull() {
            addCriterion("OVERDUE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonEqualTo(String value) {
            addCriterion("OVERDUE_REASON =", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotEqualTo(String value) {
            addCriterion("OVERDUE_REASON <>", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonGreaterThan(String value) {
            addCriterion("OVERDUE_REASON >", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUE_REASON >=", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonLessThan(String value) {
            addCriterion("OVERDUE_REASON <", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonLessThanOrEqualTo(String value) {
            addCriterion("OVERDUE_REASON <=", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonLike(String value) {
            addCriterion("OVERDUE_REASON like", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotLike(String value) {
            addCriterion("OVERDUE_REASON not like", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonIn(List<String> values) {
            addCriterion("OVERDUE_REASON in", values, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotIn(List<String> values) {
            addCriterion("OVERDUE_REASON not in", values, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonBetween(String value1, String value2) {
            addCriterion("OVERDUE_REASON between", value1, value2, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotBetween(String value1, String value2) {
            addCriterion("OVERDUE_REASON not between", value1, value2, "overdueReason");
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
     * 描述:PMS_CM_WORKTASK表的实体类
     * @version
     * @author:  DK_Tyh
     * @创建时间: 2017-11-09
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PMS_CM_WORKTASK 2017-11-09
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