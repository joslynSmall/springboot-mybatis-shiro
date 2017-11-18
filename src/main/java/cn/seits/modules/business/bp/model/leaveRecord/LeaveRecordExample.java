package cn.seits.modules.business.bp.model.leaveRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveRecordExample() {
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
     * PMS_CM_LEAVERECORD 2017-11-09
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

        public Criteria andLeaveIdIsNull() {
            addCriterion("LEAVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("LEAVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(String value) {
            addCriterion("LEAVE_ID =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(String value) {
            addCriterion("LEAVE_ID <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(String value) {
            addCriterion("LEAVE_ID >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_ID >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(String value) {
            addCriterion("LEAVE_ID <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_ID <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLike(String value) {
            addCriterion("LEAVE_ID like", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotLike(String value) {
            addCriterion("LEAVE_ID not like", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<String> values) {
            addCriterion("LEAVE_ID in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<String> values) {
            addCriterion("LEAVE_ID not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(String value1, String value2) {
            addCriterion("LEAVE_ID between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(String value1, String value2) {
            addCriterion("LEAVE_ID not between", value1, value2, "leaveId");
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

        public Criteria andLeaveReasonsIsNull() {
            addCriterion("LEAVE_REASONS is null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsIsNotNull() {
            addCriterion("LEAVE_REASONS is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsEqualTo(String value) {
            addCriterion("LEAVE_REASONS =", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsNotEqualTo(String value) {
            addCriterion("LEAVE_REASONS <>", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsGreaterThan(String value) {
            addCriterion("LEAVE_REASONS >", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_REASONS >=", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsLessThan(String value) {
            addCriterion("LEAVE_REASONS <", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_REASONS <=", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsLike(String value) {
            addCriterion("LEAVE_REASONS like", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsNotLike(String value) {
            addCriterion("LEAVE_REASONS not like", value, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsIn(List<String> values) {
            addCriterion("LEAVE_REASONS in", values, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsNotIn(List<String> values) {
            addCriterion("LEAVE_REASONS not in", values, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsBetween(String value1, String value2) {
            addCriterion("LEAVE_REASONS between", value1, value2, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveReasonsNotBetween(String value1, String value2) {
            addCriterion("LEAVE_REASONS not between", value1, value2, "leaveReasons");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LEAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LEAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("LEAVE_TIME =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("LEAVE_TIME <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("LEAVE_TIME >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("LEAVE_TIME <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("LEAVE_TIME <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("LEAVE_TIME in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("LEAVE_TIME not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("LEAVE_TIME not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNull() {
            addCriterion("LEAVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNotNull() {
            addCriterion("LEAVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeEqualTo(String value) {
            addCriterion("LEAVE_TYPE =", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotEqualTo(String value) {
            addCriterion("LEAVE_TYPE <>", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThan(String value) {
            addCriterion("LEAVE_TYPE >", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_TYPE >=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThan(String value) {
            addCriterion("LEAVE_TYPE <", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_TYPE <=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLike(String value) {
            addCriterion("LEAVE_TYPE like", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotLike(String value) {
            addCriterion("LEAVE_TYPE not like", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIn(List<String> values) {
            addCriterion("LEAVE_TYPE in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotIn(List<String> values) {
            addCriterion("LEAVE_TYPE not in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeBetween(String value1, String value2) {
            addCriterion("LEAVE_TYPE between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotBetween(String value1, String value2) {
            addCriterion("LEAVE_TYPE not between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumIsNull() {
            addCriterion("LEAVE_TIME_QUANTUM is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumIsNotNull() {
            addCriterion("LEAVE_TIME_QUANTUM is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumEqualTo(String value) {
            addCriterion("LEAVE_TIME_QUANTUM =", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumNotEqualTo(String value) {
            addCriterion("LEAVE_TIME_QUANTUM <>", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumGreaterThan(String value) {
            addCriterion("LEAVE_TIME_QUANTUM >", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME_QUANTUM >=", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumLessThan(String value) {
            addCriterion("LEAVE_TIME_QUANTUM <", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_TIME_QUANTUM <=", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumLike(String value) {
            addCriterion("LEAVE_TIME_QUANTUM like", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumNotLike(String value) {
            addCriterion("LEAVE_TIME_QUANTUM not like", value, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumIn(List<String> values) {
            addCriterion("LEAVE_TIME_QUANTUM in", values, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumNotIn(List<String> values) {
            addCriterion("LEAVE_TIME_QUANTUM not in", values, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME_QUANTUM between", value1, value2, "leaveTimeQuantum");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeQuantumNotBetween(String value1, String value2) {
            addCriterion("LEAVE_TIME_QUANTUM not between", value1, value2, "leaveTimeQuantum");
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
     * 描述:PMS_CM_LEAVERECORD表的实体类
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
     * PMS_CM_LEAVERECORD 2017-11-09
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