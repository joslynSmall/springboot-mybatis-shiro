package cn.seits.modules.business.cm.model.difficultLevel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DifficultLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DifficultLevelExample() {
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
     * PMS_CM_DIFFICULTLEVEL 2017-11-09
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

        public Criteria andDifficultyLevelIdIsNull() {
            addCriterion("DIFFICULTY_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdIsNotNull() {
            addCriterion("DIFFICULTY_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID =", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdNotEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID <>", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdGreaterThan(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID >", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID >=", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdLessThan(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID <", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdLessThanOrEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID <=", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdLike(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID like", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdNotLike(String value) {
            addCriterion("DIFFICULTY_LEVEL_ID not like", value, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdIn(List<String> values) {
            addCriterion("DIFFICULTY_LEVEL_ID in", values, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdNotIn(List<String> values) {
            addCriterion("DIFFICULTY_LEVEL_ID not in", values, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdBetween(String value1, String value2) {
            addCriterion("DIFFICULTY_LEVEL_ID between", value1, value2, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelIdNotBetween(String value1, String value2) {
            addCriterion("DIFFICULTY_LEVEL_ID not between", value1, value2, "difficultyLevelId");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameIsNull() {
            addCriterion("DIFFICULTY_LEVEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameIsNotNull() {
            addCriterion("DIFFICULTY_LEVEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME =", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameNotEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME <>", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameGreaterThan(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME >", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME >=", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameLessThan(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME <", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameLessThanOrEqualTo(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME <=", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameLike(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME like", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameNotLike(String value) {
            addCriterion("DIFFICULTY_LEVEL_NAME not like", value, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameIn(List<String> values) {
            addCriterion("DIFFICULTY_LEVEL_NAME in", values, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameNotIn(List<String> values) {
            addCriterion("DIFFICULTY_LEVEL_NAME not in", values, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameBetween(String value1, String value2) {
            addCriterion("DIFFICULTY_LEVEL_NAME between", value1, value2, "difficultyLevelName");
            return (Criteria) this;
        }

        public Criteria andDifficultyLevelNameNotBetween(String value1, String value2) {
            addCriterion("DIFFICULTY_LEVEL_NAME not between", value1, value2, "difficultyLevelName");
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
     * 描述:PMS_CM_DIFFICULTLEVEL表的实体类
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
     * PMS_CM_DIFFICULTLEVEL 2017-11-09
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