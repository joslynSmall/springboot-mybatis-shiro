package cn.seits.modules.business.bp.model.dailyWorkPlan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyWorkPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyWorkPlanExample() {
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
     * PMS_CM_DAILYWORKPLAN 2017-11-13
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

        public Criteria andDailyWorkPlanIdIsNull() {
            addCriterion("DAILY_WORK_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdIsNotNull() {
            addCriterion("DAILY_WORK_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_ID =", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdNotEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_ID <>", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdGreaterThan(String value) {
            addCriterion("DAILY_WORK_PLAN_ID >", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_ID >=", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdLessThan(String value) {
            addCriterion("DAILY_WORK_PLAN_ID <", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdLessThanOrEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_ID <=", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdLike(String value) {
            addCriterion("DAILY_WORK_PLAN_ID like", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdNotLike(String value) {
            addCriterion("DAILY_WORK_PLAN_ID not like", value, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdIn(List<String> values) {
            addCriterion("DAILY_WORK_PLAN_ID in", values, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdNotIn(List<String> values) {
            addCriterion("DAILY_WORK_PLAN_ID not in", values, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdBetween(String value1, String value2) {
            addCriterion("DAILY_WORK_PLAN_ID between", value1, value2, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanIdNotBetween(String value1, String value2) {
            addCriterion("DAILY_WORK_PLAN_ID not between", value1, value2, "dailyWorkPlanId");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameIsNull() {
            addCriterion("DAILY_WORK_PLAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameIsNotNull() {
            addCriterion("DAILY_WORK_PLAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME =", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameNotEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME <>", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameGreaterThan(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME >", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME >=", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameLessThan(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME <", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameLessThanOrEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME <=", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameLike(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME like", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameNotLike(String value) {
            addCriterion("DAILY_WORK_PLAN_NAME not like", value, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameIn(List<String> values) {
            addCriterion("DAILY_WORK_PLAN_NAME in", values, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameNotIn(List<String> values) {
            addCriterion("DAILY_WORK_PLAN_NAME not in", values, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameBetween(String value1, String value2) {
            addCriterion("DAILY_WORK_PLAN_NAME between", value1, value2, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanNameNotBetween(String value1, String value2) {
            addCriterion("DAILY_WORK_PLAN_NAME not between", value1, value2, "dailyWorkPlanName");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentIsNull() {
            addCriterion("DAILY_WORK_PLAN_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentIsNotNull() {
            addCriterion("DAILY_WORK_PLAN_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT =", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentNotEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT <>", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentGreaterThan(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT >", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentGreaterThanOrEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT >=", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentLessThan(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT <", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentLessThanOrEqualTo(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT <=", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentLike(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT like", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentNotLike(String value) {
            addCriterion("DAILY_WORK_PLAN_CONTENT not like", value, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentIn(List<String> values) {
            addCriterion("DAILY_WORK_PLAN_CONTENT in", values, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentNotIn(List<String> values) {
            addCriterion("DAILY_WORK_PLAN_CONTENT not in", values, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentBetween(String value1, String value2) {
            addCriterion("DAILY_WORK_PLAN_CONTENT between", value1, value2, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andDailyWorkPlanContentNotBetween(String value1, String value2) {
            addCriterion("DAILY_WORK_PLAN_CONTENT not between", value1, value2, "dailyWorkPlanContent");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdIsNull() {
            addCriterion("ENACT_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdIsNotNull() {
            addCriterion("ENACT_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdEqualTo(String value) {
            addCriterion("ENACT_EMPLOYEE_ID =", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdNotEqualTo(String value) {
            addCriterion("ENACT_EMPLOYEE_ID <>", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdGreaterThan(String value) {
            addCriterion("ENACT_EMPLOYEE_ID >", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENACT_EMPLOYEE_ID >=", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdLessThan(String value) {
            addCriterion("ENACT_EMPLOYEE_ID <", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("ENACT_EMPLOYEE_ID <=", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdLike(String value) {
            addCriterion("ENACT_EMPLOYEE_ID like", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdNotLike(String value) {
            addCriterion("ENACT_EMPLOYEE_ID not like", value, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdIn(List<String> values) {
            addCriterion("ENACT_EMPLOYEE_ID in", values, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdNotIn(List<String> values) {
            addCriterion("ENACT_EMPLOYEE_ID not in", values, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdBetween(String value1, String value2) {
            addCriterion("ENACT_EMPLOYEE_ID between", value1, value2, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andEnactEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("ENACT_EMPLOYEE_ID not between", value1, value2, "enactEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdIsNull() {
            addCriterion("FINISH_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdIsNotNull() {
            addCriterion("FINISH_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdEqualTo(String value) {
            addCriterion("FINISH_EMPLOYEE_ID =", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdNotEqualTo(String value) {
            addCriterion("FINISH_EMPLOYEE_ID <>", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdGreaterThan(String value) {
            addCriterion("FINISH_EMPLOYEE_ID >", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FINISH_EMPLOYEE_ID >=", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdLessThan(String value) {
            addCriterion("FINISH_EMPLOYEE_ID <", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("FINISH_EMPLOYEE_ID <=", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdLike(String value) {
            addCriterion("FINISH_EMPLOYEE_ID like", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdNotLike(String value) {
            addCriterion("FINISH_EMPLOYEE_ID not like", value, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdIn(List<String> values) {
            addCriterion("FINISH_EMPLOYEE_ID in", values, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdNotIn(List<String> values) {
            addCriterion("FINISH_EMPLOYEE_ID not in", values, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdBetween(String value1, String value2) {
            addCriterion("FINISH_EMPLOYEE_ID between", value1, value2, "finishEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFinishEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("FINISH_EMPLOYEE_ID not between", value1, value2, "finishEmployeeId");
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
     * 描述:PMS_CM_DAILYWORKPLAN表的实体类
     * @version
     * @author:  Lenovo
     * @创建时间: 2017-11-13
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PMS_CM_DAILYWORKPLAN 2017-11-13
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