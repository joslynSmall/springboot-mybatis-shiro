package cn.seits.modules.business.cm.model.functionType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FunctionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctionTypeExample() {
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
     * PMS_CM_FUNCTIONTYPE 2017-11-09
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

        public Criteria andFunctionTypeIdIsNull() {
            addCriterion("FUNCTION_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdIsNotNull() {
            addCriterion("FUNCTION_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_ID =", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdNotEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_ID <>", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdGreaterThan(String value) {
            addCriterion("FUNCTION_TYPE_ID >", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_ID >=", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdLessThan(String value) {
            addCriterion("FUNCTION_TYPE_ID <", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_ID <=", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdLike(String value) {
            addCriterion("FUNCTION_TYPE_ID like", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdNotLike(String value) {
            addCriterion("FUNCTION_TYPE_ID not like", value, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdIn(List<String> values) {
            addCriterion("FUNCTION_TYPE_ID in", values, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdNotIn(List<String> values) {
            addCriterion("FUNCTION_TYPE_ID not in", values, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdBetween(String value1, String value2) {
            addCriterion("FUNCTION_TYPE_ID between", value1, value2, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeIdNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_TYPE_ID not between", value1, value2, "functionTypeId");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameIsNull() {
            addCriterion("FUNCTION_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameIsNotNull() {
            addCriterion("FUNCTION_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_NAME =", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameNotEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_NAME <>", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameGreaterThan(String value) {
            addCriterion("FUNCTION_TYPE_NAME >", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_NAME >=", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameLessThan(String value) {
            addCriterion("FUNCTION_TYPE_NAME <", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_TYPE_NAME <=", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameLike(String value) {
            addCriterion("FUNCTION_TYPE_NAME like", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameNotLike(String value) {
            addCriterion("FUNCTION_TYPE_NAME not like", value, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameIn(List<String> values) {
            addCriterion("FUNCTION_TYPE_NAME in", values, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameNotIn(List<String> values) {
            addCriterion("FUNCTION_TYPE_NAME not in", values, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameBetween(String value1, String value2) {
            addCriterion("FUNCTION_TYPE_NAME between", value1, value2, "functionTypeName");
            return (Criteria) this;
        }

        public Criteria andFunctionTypeNameNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_TYPE_NAME not between", value1, value2, "functionTypeName");
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
     * 描述:PMS_CM_FUNCTIONTYPE表的实体类
     * @version
     * @author:  韩昊月
     * @创建时间: 2017-11-09
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PMS_CM_FUNCTIONTYPE 2017-11-09
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