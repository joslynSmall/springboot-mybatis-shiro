package cn.seits.modules.business.bp.model.overtimeRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OvertimeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OvertimeRecordExample() {
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
     * PMS_CM_OVERTIMERECORD 2017-11-09
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

        public Criteria andOvertimerecordIdIsNull() {
            addCriterion("OVERTIMERECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdIsNotNull() {
            addCriterion("OVERTIMERECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdEqualTo(String value) {
            addCriterion("OVERTIMERECORD_ID =", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdNotEqualTo(String value) {
            addCriterion("OVERTIMERECORD_ID <>", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdGreaterThan(String value) {
            addCriterion("OVERTIMERECORD_ID >", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMERECORD_ID >=", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdLessThan(String value) {
            addCriterion("OVERTIMERECORD_ID <", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMERECORD_ID <=", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdLike(String value) {
            addCriterion("OVERTIMERECORD_ID like", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdNotLike(String value) {
            addCriterion("OVERTIMERECORD_ID not like", value, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdIn(List<String> values) {
            addCriterion("OVERTIMERECORD_ID in", values, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdNotIn(List<String> values) {
            addCriterion("OVERTIMERECORD_ID not in", values, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdBetween(String value1, String value2) {
            addCriterion("OVERTIMERECORD_ID between", value1, value2, "overtimerecordId");
            return (Criteria) this;
        }

        public Criteria andOvertimerecordIdNotBetween(String value1, String value2) {
            addCriterion("OVERTIMERECORD_ID not between", value1, value2, "overtimerecordId");
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

        public Criteria andApplyovertimeemployeeIdIsNull() {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdIsNotNull() {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdEqualTo(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID =", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdNotEqualTo(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID <>", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdGreaterThan(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID >", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID >=", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdLessThan(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID <", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdLessThanOrEqualTo(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID <=", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdLike(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID like", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdNotLike(String value) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID not like", value, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdIn(List<String> values) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID in", values, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdNotIn(List<String> values) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID not in", values, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdBetween(String value1, String value2) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID between", value1, value2, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andApplyovertimeemployeeIdNotBetween(String value1, String value2) {
            addCriterion("APPLYOVERTIMEEMPLOYEE_ID not between", value1, value2, "applyovertimeemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdIsNull() {
            addCriterion("CHECKEMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdIsNotNull() {
            addCriterion("CHECKEMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdEqualTo(String value) {
            addCriterion("CHECKEMPLOYEE_ID =", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdNotEqualTo(String value) {
            addCriterion("CHECKEMPLOYEE_ID <>", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdGreaterThan(String value) {
            addCriterion("CHECKEMPLOYEE_ID >", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKEMPLOYEE_ID >=", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdLessThan(String value) {
            addCriterion("CHECKEMPLOYEE_ID <", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdLessThanOrEqualTo(String value) {
            addCriterion("CHECKEMPLOYEE_ID <=", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdLike(String value) {
            addCriterion("CHECKEMPLOYEE_ID like", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdNotLike(String value) {
            addCriterion("CHECKEMPLOYEE_ID not like", value, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdIn(List<String> values) {
            addCriterion("CHECKEMPLOYEE_ID in", values, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdNotIn(List<String> values) {
            addCriterion("CHECKEMPLOYEE_ID not in", values, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdBetween(String value1, String value2) {
            addCriterion("CHECKEMPLOYEE_ID between", value1, value2, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeIdNotBetween(String value1, String value2) {
            addCriterion("CHECKEMPLOYEE_ID not between", value1, value2, "checkemployeeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdIsNull() {
            addCriterion("OVERTIMETIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdIsNotNull() {
            addCriterion("OVERTIMETIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdEqualTo(String value) {
            addCriterion("OVERTIMETIME_ID =", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdNotEqualTo(String value) {
            addCriterion("OVERTIMETIME_ID <>", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdGreaterThan(String value) {
            addCriterion("OVERTIMETIME_ID >", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMETIME_ID >=", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdLessThan(String value) {
            addCriterion("OVERTIMETIME_ID <", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMETIME_ID <=", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdLike(String value) {
            addCriterion("OVERTIMETIME_ID like", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdNotLike(String value) {
            addCriterion("OVERTIMETIME_ID not like", value, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdIn(List<String> values) {
            addCriterion("OVERTIMETIME_ID in", values, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdNotIn(List<String> values) {
            addCriterion("OVERTIMETIME_ID not in", values, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdBetween(String value1, String value2) {
            addCriterion("OVERTIMETIME_ID between", value1, value2, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeIdNotBetween(String value1, String value2) {
            addCriterion("OVERTIMETIME_ID not between", value1, value2, "overtimetimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeIsNull() {
            addCriterion("OVERTIME_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeIsNotNull() {
            addCriterion("OVERTIME_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeEqualTo(Date value) {
            addCriterion("OVERTIME_TIME =", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeNotEqualTo(Date value) {
            addCriterion("OVERTIME_TIME <>", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeGreaterThan(Date value) {
            addCriterion("OVERTIME_TIME >", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OVERTIME_TIME >=", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeLessThan(Date value) {
            addCriterion("OVERTIME_TIME <", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeLessThanOrEqualTo(Date value) {
            addCriterion("OVERTIME_TIME <=", value, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeIn(List<Date> values) {
            addCriterion("OVERTIME_TIME in", values, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeNotIn(List<Date> values) {
            addCriterion("OVERTIME_TIME not in", values, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeBetween(Date value1, Date value2) {
            addCriterion("OVERTIME_TIME between", value1, value2, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeTimeNotBetween(Date value1, Date value2) {
            addCriterion("OVERTIME_TIME not between", value1, value2, "overtimeTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonIsNull() {
            addCriterion("OVERTIME_REASON is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonIsNotNull() {
            addCriterion("OVERTIME_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonEqualTo(String value) {
            addCriterion("OVERTIME_REASON =", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotEqualTo(String value) {
            addCriterion("OVERTIME_REASON <>", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonGreaterThan(String value) {
            addCriterion("OVERTIME_REASON >", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIME_REASON >=", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonLessThan(String value) {
            addCriterion("OVERTIME_REASON <", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonLessThanOrEqualTo(String value) {
            addCriterion("OVERTIME_REASON <=", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonLike(String value) {
            addCriterion("OVERTIME_REASON like", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotLike(String value) {
            addCriterion("OVERTIME_REASON not like", value, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonIn(List<String> values) {
            addCriterion("OVERTIME_REASON in", values, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotIn(List<String> values) {
            addCriterion("OVERTIME_REASON not in", values, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonBetween(String value1, String value2) {
            addCriterion("OVERTIME_REASON between", value1, value2, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andOvertimeReasonNotBetween(String value1, String value2) {
            addCriterion("OVERTIME_REASON not between", value1, value2, "overtimeReason");
            return (Criteria) this;
        }

        public Criteria andIsHolidayIsNull() {
            addCriterion("IS_HOLIDAY is null");
            return (Criteria) this;
        }

        public Criteria andIsHolidayIsNotNull() {
            addCriterion("IS_HOLIDAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsHolidayEqualTo(String value) {
            addCriterion("IS_HOLIDAY =", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayNotEqualTo(String value) {
            addCriterion("IS_HOLIDAY <>", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayGreaterThan(String value) {
            addCriterion("IS_HOLIDAY >", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_HOLIDAY >=", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayLessThan(String value) {
            addCriterion("IS_HOLIDAY <", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayLessThanOrEqualTo(String value) {
            addCriterion("IS_HOLIDAY <=", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayLike(String value) {
            addCriterion("IS_HOLIDAY like", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayNotLike(String value) {
            addCriterion("IS_HOLIDAY not like", value, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayIn(List<String> values) {
            addCriterion("IS_HOLIDAY in", values, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayNotIn(List<String> values) {
            addCriterion("IS_HOLIDAY not in", values, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayBetween(String value1, String value2) {
            addCriterion("IS_HOLIDAY between", value1, value2, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsHolidayNotBetween(String value1, String value2) {
            addCriterion("IS_HOLIDAY not between", value1, value2, "isHoliday");
            return (Criteria) this;
        }

        public Criteria andIsRealityIsNull() {
            addCriterion("IS_REALITY is null");
            return (Criteria) this;
        }

        public Criteria andIsRealityIsNotNull() {
            addCriterion("IS_REALITY is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealityEqualTo(String value) {
            addCriterion("IS_REALITY =", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityNotEqualTo(String value) {
            addCriterion("IS_REALITY <>", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityGreaterThan(String value) {
            addCriterion("IS_REALITY >", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REALITY >=", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityLessThan(String value) {
            addCriterion("IS_REALITY <", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityLessThanOrEqualTo(String value) {
            addCriterion("IS_REALITY <=", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityLike(String value) {
            addCriterion("IS_REALITY like", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityNotLike(String value) {
            addCriterion("IS_REALITY not like", value, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityIn(List<String> values) {
            addCriterion("IS_REALITY in", values, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityNotIn(List<String> values) {
            addCriterion("IS_REALITY not in", values, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityBetween(String value1, String value2) {
            addCriterion("IS_REALITY between", value1, value2, "isReality");
            return (Criteria) this;
        }

        public Criteria andIsRealityNotBetween(String value1, String value2) {
            addCriterion("IS_REALITY not between", value1, value2, "isReality");
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
     * 描述:PMS_CM_OVERTIMERECORD表的实体类
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
     * PMS_CM_OVERTIMERECORD 2017-11-09
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