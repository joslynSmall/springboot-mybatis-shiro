package cn.seits.modules.business.cm.model.bugLevel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmBugLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmBugLevelExample() {
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
     * PMS_CM_BUGLEVEL 2017-10-16
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

        public Criteria andBugLevelNameIsNull() {
            addCriterion("BUG_LEVEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameIsNotNull() {
            addCriterion("BUG_LEVEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameEqualTo(String value) {
            addCriterion("BUG_LEVEL_NAME =", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameNotEqualTo(String value) {
            addCriterion("BUG_LEVEL_NAME <>", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameGreaterThan(String value) {
            addCriterion("BUG_LEVEL_NAME >", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_LEVEL_NAME >=", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameLessThan(String value) {
            addCriterion("BUG_LEVEL_NAME <", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameLessThanOrEqualTo(String value) {
            addCriterion("BUG_LEVEL_NAME <=", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameLike(String value) {
            addCriterion("BUG_LEVEL_NAME like", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameNotLike(String value) {
            addCriterion("BUG_LEVEL_NAME not like", value, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameIn(List<String> values) {
            addCriterion("BUG_LEVEL_NAME in", values, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameNotIn(List<String> values) {
            addCriterion("BUG_LEVEL_NAME not in", values, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameBetween(String value1, String value2) {
            addCriterion("BUG_LEVEL_NAME between", value1, value2, "bugLevelName");
            return (Criteria) this;
        }

        public Criteria andBugLevelNameNotBetween(String value1, String value2) {
            addCriterion("BUG_LEVEL_NAME not between", value1, value2, "bugLevelName");
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
     * 描述:PMS_CM_BUGLEVEL表的实体类
     * @version
     * @author:  jolsyn
     * @创建时间: 2017-10-16
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PMS_CM_BUGLEVEL 2017-10-16
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