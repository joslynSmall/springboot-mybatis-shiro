package cn.seits.modules.business.cm.model.overtimeTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OvertimeTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OvertimeTimeExample() {
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
     * PMS_CM_OVERTIMETIME 2017-11-09
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

        public Criteria andOvertimetimeNameIsNull() {
            addCriterion("OVERTIMETIME_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameIsNotNull() {
            addCriterion("OVERTIMETIME_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameEqualTo(String value) {
            addCriterion("OVERTIMETIME_NAME =", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameNotEqualTo(String value) {
            addCriterion("OVERTIMETIME_NAME <>", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameGreaterThan(String value) {
            addCriterion("OVERTIMETIME_NAME >", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMETIME_NAME >=", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameLessThan(String value) {
            addCriterion("OVERTIMETIME_NAME <", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMETIME_NAME <=", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameLike(String value) {
            addCriterion("OVERTIMETIME_NAME like", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameNotLike(String value) {
            addCriterion("OVERTIMETIME_NAME not like", value, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameIn(List<String> values) {
            addCriterion("OVERTIMETIME_NAME in", values, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameNotIn(List<String> values) {
            addCriterion("OVERTIMETIME_NAME not in", values, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameBetween(String value1, String value2) {
            addCriterion("OVERTIMETIME_NAME between", value1, value2, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeNameNotBetween(String value1, String value2) {
            addCriterion("OVERTIMETIME_NAME not between", value1, value2, "overtimetimeName");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeIsNull() {
            addCriterion("OVERTIMETIME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeIsNotNull() {
            addCriterion("OVERTIMETIME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeEqualTo(String value) {
            addCriterion("OVERTIMETIME_TYPE =", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeNotEqualTo(String value) {
            addCriterion("OVERTIMETIME_TYPE <>", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeGreaterThan(String value) {
            addCriterion("OVERTIMETIME_TYPE >", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMETIME_TYPE >=", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeLessThan(String value) {
            addCriterion("OVERTIMETIME_TYPE <", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMETIME_TYPE <=", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeLike(String value) {
            addCriterion("OVERTIMETIME_TYPE like", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeNotLike(String value) {
            addCriterion("OVERTIMETIME_TYPE not like", value, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeIn(List<String> values) {
            addCriterion("OVERTIMETIME_TYPE in", values, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeNotIn(List<String> values) {
            addCriterion("OVERTIMETIME_TYPE not in", values, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeBetween(String value1, String value2) {
            addCriterion("OVERTIMETIME_TYPE between", value1, value2, "overtimetimeType");
            return (Criteria) this;
        }

        public Criteria andOvertimetimeTypeNotBetween(String value1, String value2) {
            addCriterion("OVERTIMETIME_TYPE not between", value1, value2, "overtimetimeType");
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
     * 描述:PMS_CM_OVERTIMETIME表的实体类
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
     * PMS_CM_OVERTIMETIME 2017-11-09
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