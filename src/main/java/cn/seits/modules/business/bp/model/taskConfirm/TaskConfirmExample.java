package cn.seits.modules.business.bp.model.taskConfirm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskConfirmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskConfirmExample() {
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
     * TASK_CONFIRM 2017-11-09
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

        public Criteria andTaskConfirmIdIsNull() {
            addCriterion("TASK_CONFIRM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdIsNotNull() {
            addCriterion("TASK_CONFIRM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdEqualTo(String value) {
            addCriterion("TASK_CONFIRM_ID =", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdNotEqualTo(String value) {
            addCriterion("TASK_CONFIRM_ID <>", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdGreaterThan(String value) {
            addCriterion("TASK_CONFIRM_ID >", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_ID >=", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdLessThan(String value) {
            addCriterion("TASK_CONFIRM_ID <", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_ID <=", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdLike(String value) {
            addCriterion("TASK_CONFIRM_ID like", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdNotLike(String value) {
            addCriterion("TASK_CONFIRM_ID not like", value, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdIn(List<String> values) {
            addCriterion("TASK_CONFIRM_ID in", values, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdNotIn(List<String> values) {
            addCriterion("TASK_CONFIRM_ID not in", values, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_ID between", value1, value2, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmIdNotBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_ID not between", value1, value2, "taskConfirmId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameIsNull() {
            addCriterion("TASK_CONFIRM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameIsNotNull() {
            addCriterion("TASK_CONFIRM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameEqualTo(String value) {
            addCriterion("TASK_CONFIRM_NAME =", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameNotEqualTo(String value) {
            addCriterion("TASK_CONFIRM_NAME <>", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameGreaterThan(String value) {
            addCriterion("TASK_CONFIRM_NAME >", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_NAME >=", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameLessThan(String value) {
            addCriterion("TASK_CONFIRM_NAME <", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_NAME <=", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameLike(String value) {
            addCriterion("TASK_CONFIRM_NAME like", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameNotLike(String value) {
            addCriterion("TASK_CONFIRM_NAME not like", value, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameIn(List<String> values) {
            addCriterion("TASK_CONFIRM_NAME in", values, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameNotIn(List<String> values) {
            addCriterion("TASK_CONFIRM_NAME not in", values, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_NAME between", value1, value2, "taskConfirmName");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmNameNotBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_NAME not between", value1, value2, "taskConfirmName");
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

        public Criteria andTaskSubmitTimeIsNull() {
            addCriterion("TASK_SUBMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeIsNotNull() {
            addCriterion("TASK_SUBMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeEqualTo(Date value) {
            addCriterion("TASK_SUBMIT_TIME =", value, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeNotEqualTo(Date value) {
            addCriterion("TASK_SUBMIT_TIME <>", value, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeGreaterThan(Date value) {
            addCriterion("TASK_SUBMIT_TIME >", value, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_SUBMIT_TIME >=", value, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeLessThan(Date value) {
            addCriterion("TASK_SUBMIT_TIME <", value, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_SUBMIT_TIME <=", value, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeIn(List<Date> values) {
            addCriterion("TASK_SUBMIT_TIME in", values, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeNotIn(List<Date> values) {
            addCriterion("TASK_SUBMIT_TIME not in", values, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_SUBMIT_TIME between", value1, value2, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_SUBMIT_TIME not between", value1, value2, "taskSubmitTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("CONFIRM_TIME =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("CONFIRM_TIME >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("CONFIRM_TIME <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_TIME <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("CONFIRM_TIME in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("CONFIRM_TIME not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_TIME not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdIsNull() {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdIsNotNull() {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdEqualTo(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID =", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdNotEqualTo(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID <>", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdGreaterThan(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID >", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID >=", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdLessThan(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID <", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID <=", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdLike(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID like", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdNotLike(String value) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID not like", value, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdIn(List<String> values) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID in", values, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdNotIn(List<String> values) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID not in", values, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID between", value1, value2, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_EMPLOYEE_ID not between", value1, value2, "taskConfirmEmployeeId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdIsNull() {
            addCriterion("TASK_CONFIRM_RESULT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdIsNotNull() {
            addCriterion("TASK_CONFIRM_RESULT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdEqualTo(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID =", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdNotEqualTo(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID <>", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdGreaterThan(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID >", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID >=", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdLessThan(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID <", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID <=", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdLike(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID like", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdNotLike(String value) {
            addCriterion("TASK_CONFIRM_RESULT_ID not like", value, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdIn(List<String> values) {
            addCriterion("TASK_CONFIRM_RESULT_ID in", values, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdNotIn(List<String> values) {
            addCriterion("TASK_CONFIRM_RESULT_ID not in", values, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_RESULT_ID between", value1, value2, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andTaskConfirmResultIdNotBetween(String value1, String value2) {
            addCriterion("TASK_CONFIRM_RESULT_ID not between", value1, value2, "taskConfirmResultId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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
     * 描述:TASK_CONFIRM表的实体类
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
     * TASK_CONFIRM 2017-11-09
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