package cn.seits.modules.business.bp.model.conferenceRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConferenceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConferenceRecordExample() {
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
     * PMS_CM_CONFERENCERECORD 2017-11-09
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

        public Criteria andConferenceRecordIdIsNull() {
            addCriterion("CONFERENCE_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdIsNotNull() {
            addCriterion("CONFERENCE_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdEqualTo(String value) {
            addCriterion("CONFERENCE_RECORD_ID =", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdNotEqualTo(String value) {
            addCriterion("CONFERENCE_RECORD_ID <>", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdGreaterThan(String value) {
            addCriterion("CONFERENCE_RECORD_ID >", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_RECORD_ID >=", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdLessThan(String value) {
            addCriterion("CONFERENCE_RECORD_ID <", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdLessThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_RECORD_ID <=", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdLike(String value) {
            addCriterion("CONFERENCE_RECORD_ID like", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdNotLike(String value) {
            addCriterion("CONFERENCE_RECORD_ID not like", value, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdIn(List<String> values) {
            addCriterion("CONFERENCE_RECORD_ID in", values, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdNotIn(List<String> values) {
            addCriterion("CONFERENCE_RECORD_ID not in", values, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdBetween(String value1, String value2) {
            addCriterion("CONFERENCE_RECORD_ID between", value1, value2, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andConferenceRecordIdNotBetween(String value1, String value2) {
            addCriterion("CONFERENCE_RECORD_ID not between", value1, value2, "conferenceRecordId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeIsNull() {
            addCriterion("CONFERENCE_THEME is null");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeIsNotNull() {
            addCriterion("CONFERENCE_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeEqualTo(String value) {
            addCriterion("CONFERENCE_THEME =", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeNotEqualTo(String value) {
            addCriterion("CONFERENCE_THEME <>", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeGreaterThan(String value) {
            addCriterion("CONFERENCE_THEME >", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_THEME >=", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeLessThan(String value) {
            addCriterion("CONFERENCE_THEME <", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeLessThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_THEME <=", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeLike(String value) {
            addCriterion("CONFERENCE_THEME like", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeNotLike(String value) {
            addCriterion("CONFERENCE_THEME not like", value, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeIn(List<String> values) {
            addCriterion("CONFERENCE_THEME in", values, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeNotIn(List<String> values) {
            addCriterion("CONFERENCE_THEME not in", values, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeBetween(String value1, String value2) {
            addCriterion("CONFERENCE_THEME between", value1, value2, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceThemeNotBetween(String value1, String value2) {
            addCriterion("CONFERENCE_THEME not between", value1, value2, "conferenceTheme");
            return (Criteria) this;
        }

        public Criteria andConferenceContentIsNull() {
            addCriterion("CONFERENCE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andConferenceContentIsNotNull() {
            addCriterion("CONFERENCE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceContentEqualTo(String value) {
            addCriterion("CONFERENCE_CONTENT =", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentNotEqualTo(String value) {
            addCriterion("CONFERENCE_CONTENT <>", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentGreaterThan(String value) {
            addCriterion("CONFERENCE_CONTENT >", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_CONTENT >=", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentLessThan(String value) {
            addCriterion("CONFERENCE_CONTENT <", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentLessThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_CONTENT <=", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentLike(String value) {
            addCriterion("CONFERENCE_CONTENT like", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentNotLike(String value) {
            addCriterion("CONFERENCE_CONTENT not like", value, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentIn(List<String> values) {
            addCriterion("CONFERENCE_CONTENT in", values, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentNotIn(List<String> values) {
            addCriterion("CONFERENCE_CONTENT not in", values, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentBetween(String value1, String value2) {
            addCriterion("CONFERENCE_CONTENT between", value1, value2, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceContentNotBetween(String value1, String value2) {
            addCriterion("CONFERENCE_CONTENT not between", value1, value2, "conferenceContent");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeIsNull() {
            addCriterion("CONFERENCE_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeIsNotNull() {
            addCriterion("CONFERENCE_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeEqualTo(Date value) {
            addCriterion("CONFERENCE_STARTTIME =", value, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeNotEqualTo(Date value) {
            addCriterion("CONFERENCE_STARTTIME <>", value, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeGreaterThan(Date value) {
            addCriterion("CONFERENCE_STARTTIME >", value, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFERENCE_STARTTIME >=", value, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeLessThan(Date value) {
            addCriterion("CONFERENCE_STARTTIME <", value, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFERENCE_STARTTIME <=", value, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeIn(List<Date> values) {
            addCriterion("CONFERENCE_STARTTIME in", values, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeNotIn(List<Date> values) {
            addCriterion("CONFERENCE_STARTTIME not in", values, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeBetween(Date value1, Date value2) {
            addCriterion("CONFERENCE_STARTTIME between", value1, value2, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFERENCE_STARTTIME not between", value1, value2, "conferenceStartTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeIsNull() {
            addCriterion("CONFERENCE_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeIsNotNull() {
            addCriterion("CONFERENCE_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeEqualTo(Date value) {
            addCriterion("CONFERENCE_ENDTIME =", value, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeNotEqualTo(Date value) {
            addCriterion("CONFERENCE_ENDTIME <>", value, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeGreaterThan(Date value) {
            addCriterion("CONFERENCE_ENDTIME >", value, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFERENCE_ENDTIME >=", value, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeLessThan(Date value) {
            addCriterion("CONFERENCE_ENDTIME <", value, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONFERENCE_ENDTIME <=", value, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeIn(List<Date> values) {
            addCriterion("CONFERENCE_ENDTIME in", values, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeNotIn(List<Date> values) {
            addCriterion("CONFERENCE_ENDTIME not in", values, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeBetween(Date value1, Date value2) {
            addCriterion("CONFERENCE_ENDTIME between", value1, value2, "conferenceEndTime");
            return (Criteria) this;
        }

        public Criteria andConferenceEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONFERENCE_ENDTIME not between", value1, value2, "conferenceEndTime");
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
     * 描述:PMS_CM_CONFERENCERECORD表的实体类
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
     * PMS_CM_CONFERENCERECORD 2017-11-09
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