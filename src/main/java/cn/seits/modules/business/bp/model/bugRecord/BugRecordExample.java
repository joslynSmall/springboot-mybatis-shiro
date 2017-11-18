package cn.seits.modules.business.bp.model.bugRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BugRecordExample
{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BugRecordExample() {
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
     * PMS_CM_BUGRECORD 2017-11-09
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

        public Criteria andBugIdIsNull() {
            addCriterion("BUG_ID is null");
            return (Criteria) this;
        }

        public Criteria andBugIdIsNotNull() {
            addCriterion("BUG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBugIdEqualTo(String value) {
            addCriterion("BUG_ID =", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotEqualTo(String value) {
            addCriterion("BUG_ID <>", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdGreaterThan(String value) {
            addCriterion("BUG_ID >", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_ID >=", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdLessThan(String value) {
            addCriterion("BUG_ID <", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdLessThanOrEqualTo(String value) {
            addCriterion("BUG_ID <=", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdLike(String value) {
            addCriterion("BUG_ID like", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotLike(String value) {
            addCriterion("BUG_ID not like", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdIn(List<String> values) {
            addCriterion("BUG_ID in", values, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotIn(List<String> values) {
            addCriterion("BUG_ID not in", values, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdBetween(String value1, String value2) {
            addCriterion("BUG_ID between", value1, value2, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotBetween(String value1, String value2) {
            addCriterion("BUG_ID not between", value1, value2, "bugId");
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

        public Criteria andBugLevelIdIsNull() {
            addCriterion("BUG_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdIsNotNull() {
            addCriterion("BUG_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdEqualTo(String value) {
            addCriterion("BUG_LEVEL_ID =", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdNotEqualTo(String value) {
            addCriterion("BUG_LEVEL_ID <>", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdGreaterThan(String value) {
            addCriterion("BUG_LEVEL_ID >", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_LEVEL_ID >=", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdLessThan(String value) {
            addCriterion("BUG_LEVEL_ID <", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdLessThanOrEqualTo(String value) {
            addCriterion("BUG_LEVEL_ID <=", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdLike(String value) {
            addCriterion("BUG_LEVEL_ID like", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdNotLike(String value) {
            addCriterion("BUG_LEVEL_ID not like", value, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdIn(List<String> values) {
            addCriterion("BUG_LEVEL_ID in", values, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdNotIn(List<String> values) {
            addCriterion("BUG_LEVEL_ID not in", values, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdBetween(String value1, String value2) {
            addCriterion("BUG_LEVEL_ID between", value1, value2, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugLevelIdNotBetween(String value1, String value2) {
            addCriterion("BUG_LEVEL_ID not between", value1, value2, "bugLevelId");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeIsNull() {
            addCriterion("BUG_RECORD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeIsNotNull() {
            addCriterion("BUG_RECORD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeEqualTo(Date value) {
            addCriterion("BUG_RECORD_TIME =", value, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeNotEqualTo(Date value) {
            addCriterion("BUG_RECORD_TIME <>", value, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeGreaterThan(Date value) {
            addCriterion("BUG_RECORD_TIME >", value, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BUG_RECORD_TIME >=", value, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeLessThan(Date value) {
            addCriterion("BUG_RECORD_TIME <", value, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("BUG_RECORD_TIME <=", value, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeIn(List<Date> values) {
            addCriterion("BUG_RECORD_TIME in", values, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeNotIn(List<Date> values) {
            addCriterion("BUG_RECORD_TIME not in", values, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeBetween(Date value1, Date value2) {
            addCriterion("BUG_RECORD_TIME between", value1, value2, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("BUG_RECORD_TIME not between", value1, value2, "bugRecordTime");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdIsNull() {
            addCriterion("BUG_RECORD_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdIsNotNull() {
            addCriterion("BUG_RECORD_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdEqualTo(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID =", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdNotEqualTo(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID <>", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdGreaterThan(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID >", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID >=", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdLessThan(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID <", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID <=", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdLike(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID like", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdNotLike(String value) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID not like", value, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdIn(List<String> values) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID in", values, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdNotIn(List<String> values) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID not in", values, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdBetween(String value1, String value2) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID between", value1, value2, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugRecordEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("BUG_RECORD_EMPLOYEE_ID not between", value1, value2, "bugRecordEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBugDescIsNull() {
            addCriterion("BUG_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBugDescIsNotNull() {
            addCriterion("BUG_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBugDescEqualTo(String value) {
            addCriterion("BUG_DESC =", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotEqualTo(String value) {
            addCriterion("BUG_DESC <>", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescGreaterThan(String value) {
            addCriterion("BUG_DESC >", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_DESC >=", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescLessThan(String value) {
            addCriterion("BUG_DESC <", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescLessThanOrEqualTo(String value) {
            addCriterion("BUG_DESC <=", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescLike(String value) {
            addCriterion("BUG_DESC like", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotLike(String value) {
            addCriterion("BUG_DESC not like", value, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescIn(List<String> values) {
            addCriterion("BUG_DESC in", values, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotIn(List<String> values) {
            addCriterion("BUG_DESC not in", values, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescBetween(String value1, String value2) {
            addCriterion("BUG_DESC between", value1, value2, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugDescNotBetween(String value1, String value2) {
            addCriterion("BUG_DESC not between", value1, value2, "bugDesc");
            return (Criteria) this;
        }

        public Criteria andBugStateIdIsNull() {
            addCriterion("BUG_STATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBugStateIdIsNotNull() {
            addCriterion("BUG_STATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBugStateIdEqualTo(String value) {
            addCriterion("BUG_STATE_ID =", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdNotEqualTo(String value) {
            addCriterion("BUG_STATE_ID <>", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdGreaterThan(String value) {
            addCriterion("BUG_STATE_ID >", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_STATE_ID >=", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdLessThan(String value) {
            addCriterion("BUG_STATE_ID <", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdLessThanOrEqualTo(String value) {
            addCriterion("BUG_STATE_ID <=", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdLike(String value) {
            addCriterion("BUG_STATE_ID like", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdNotLike(String value) {
            addCriterion("BUG_STATE_ID not like", value, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdIn(List<String> values) {
            addCriterion("BUG_STATE_ID in", values, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdNotIn(List<String> values) {
            addCriterion("BUG_STATE_ID not in", values, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdBetween(String value1, String value2) {
            addCriterion("BUG_STATE_ID between", value1, value2, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugStateIdNotBetween(String value1, String value2) {
            addCriterion("BUG_STATE_ID not between", value1, value2, "bugStateId");
            return (Criteria) this;
        }

        public Criteria andBugDealResultIsNull() {
            addCriterion("BUG_DEAL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andBugDealResultIsNotNull() {
            addCriterion("BUG_DEAL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andBugDealResultEqualTo(String value) {
            addCriterion("BUG_DEAL_RESULT =", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultNotEqualTo(String value) {
            addCriterion("BUG_DEAL_RESULT <>", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultGreaterThan(String value) {
            addCriterion("BUG_DEAL_RESULT >", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_DEAL_RESULT >=", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultLessThan(String value) {
            addCriterion("BUG_DEAL_RESULT <", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultLessThanOrEqualTo(String value) {
            addCriterion("BUG_DEAL_RESULT <=", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultLike(String value) {
            addCriterion("BUG_DEAL_RESULT like", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultNotLike(String value) {
            addCriterion("BUG_DEAL_RESULT not like", value, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultIn(List<String> values) {
            addCriterion("BUG_DEAL_RESULT in", values, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultNotIn(List<String> values) {
            addCriterion("BUG_DEAL_RESULT not in", values, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultBetween(String value1, String value2) {
            addCriterion("BUG_DEAL_RESULT between", value1, value2, "bugDealResult");
            return (Criteria) this;
        }

        public Criteria andBugDealResultNotBetween(String value1, String value2) {
            addCriterion("BUG_DEAL_RESULT not between", value1, value2, "bugDealResult");
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
     * 描述:PMS_CM_BUGRECORD表的实体类
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
     * PMS_CM_BUGRECORD 2017-11-09
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