package cn.seits.modules.business.cm.model.groupEmployeeRel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupEmployeeRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupEmployeeRelExample() {
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
     * PMS_CM_GROUPEMPLOYEE_REL 2017-11-09
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

        public Criteria andIsGroupleaderIsNull() {
            addCriterion("IS_GROUPLEADER is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderIsNotNull() {
            addCriterion("IS_GROUPLEADER is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderEqualTo(String value) {
            addCriterion("IS_GROUPLEADER =", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderNotEqualTo(String value) {
            addCriterion("IS_GROUPLEADER <>", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderGreaterThan(String value) {
            addCriterion("IS_GROUPLEADER >", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GROUPLEADER >=", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderLessThan(String value) {
            addCriterion("IS_GROUPLEADER <", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderLessThanOrEqualTo(String value) {
            addCriterion("IS_GROUPLEADER <=", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderLike(String value) {
            addCriterion("IS_GROUPLEADER like", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderNotLike(String value) {
            addCriterion("IS_GROUPLEADER not like", value, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderIn(List<String> values) {
            addCriterion("IS_GROUPLEADER in", values, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderNotIn(List<String> values) {
            addCriterion("IS_GROUPLEADER not in", values, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderBetween(String value1, String value2) {
            addCriterion("IS_GROUPLEADER between", value1, value2, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsGroupleaderNotBetween(String value1, String value2) {
            addCriterion("IS_GROUPLEADER not between", value1, value2, "isGroupleader");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperIsNull() {
            addCriterion("IS_DEVELOPER is null");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperIsNotNull() {
            addCriterion("IS_DEVELOPER is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperEqualTo(String value) {
            addCriterion("IS_DEVELOPER =", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperNotEqualTo(String value) {
            addCriterion("IS_DEVELOPER <>", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperGreaterThan(String value) {
            addCriterion("IS_DEVELOPER >", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEVELOPER >=", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperLessThan(String value) {
            addCriterion("IS_DEVELOPER <", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperLessThanOrEqualTo(String value) {
            addCriterion("IS_DEVELOPER <=", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperLike(String value) {
            addCriterion("IS_DEVELOPER like", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperNotLike(String value) {
            addCriterion("IS_DEVELOPER not like", value, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperIn(List<String> values) {
            addCriterion("IS_DEVELOPER in", values, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperNotIn(List<String> values) {
            addCriterion("IS_DEVELOPER not in", values, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperBetween(String value1, String value2) {
            addCriterion("IS_DEVELOPER between", value1, value2, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsDeveloperNotBetween(String value1, String value2) {
            addCriterion("IS_DEVELOPER not between", value1, value2, "isDeveloper");
            return (Criteria) this;
        }

        public Criteria andIsTesterIsNull() {
            addCriterion("IS_TESTER is null");
            return (Criteria) this;
        }

        public Criteria andIsTesterIsNotNull() {
            addCriterion("IS_TESTER is not null");
            return (Criteria) this;
        }

        public Criteria andIsTesterEqualTo(String value) {
            addCriterion("IS_TESTER =", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterNotEqualTo(String value) {
            addCriterion("IS_TESTER <>", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterGreaterThan(String value) {
            addCriterion("IS_TESTER >", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TESTER >=", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterLessThan(String value) {
            addCriterion("IS_TESTER <", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterLessThanOrEqualTo(String value) {
            addCriterion("IS_TESTER <=", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterLike(String value) {
            addCriterion("IS_TESTER like", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterNotLike(String value) {
            addCriterion("IS_TESTER not like", value, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterIn(List<String> values) {
            addCriterion("IS_TESTER in", values, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterNotIn(List<String> values) {
            addCriterion("IS_TESTER not in", values, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterBetween(String value1, String value2) {
            addCriterion("IS_TESTER between", value1, value2, "isTester");
            return (Criteria) this;
        }

        public Criteria andIsTesterNotBetween(String value1, String value2) {
            addCriterion("IS_TESTER not between", value1, value2, "isTester");
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
     * 描述:PMS_CM_GROUPEMPLOYEE_REL表的实体类
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
     * PMS_CM_GROUPEMPLOYEE_REL 2017-11-09
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