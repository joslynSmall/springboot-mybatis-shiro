package cn.seits.modules.business.cm.model.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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
     * PMS_CM_EMPLOYEE 2017-11-09
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andDutyIdIsNull() {
            addCriterion("DUTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDutyIdIsNotNull() {
            addCriterion("DUTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDutyIdEqualTo(String value) {
            addCriterion("DUTY_ID =", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotEqualTo(String value) {
            addCriterion("DUTY_ID <>", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdGreaterThan(String value) {
            addCriterion("DUTY_ID >", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_ID >=", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdLessThan(String value) {
            addCriterion("DUTY_ID <", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdLessThanOrEqualTo(String value) {
            addCriterion("DUTY_ID <=", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdLike(String value) {
            addCriterion("DUTY_ID like", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotLike(String value) {
            addCriterion("DUTY_ID not like", value, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdIn(List<String> values) {
            addCriterion("DUTY_ID in", values, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotIn(List<String> values) {
            addCriterion("DUTY_ID not in", values, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdBetween(String value1, String value2) {
            addCriterion("DUTY_ID between", value1, value2, "dutyId");
            return (Criteria) this;
        }

        public Criteria andDutyIdNotBetween(String value1, String value2) {
            addCriterion("DUTY_ID not between", value1, value2, "dutyId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdIsNull() {
            addCriterion("TECHNOLOGYPREFERENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdIsNotNull() {
            addCriterion("TECHNOLOGYPREFERENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdEqualTo(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID =", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdNotEqualTo(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID <>", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdGreaterThan(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID >", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID >=", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdLessThan(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID <", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdLessThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID <=", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdLike(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID like", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdNotLike(String value) {
            addCriterion("TECHNOLOGYPREFERENCE_ID not like", value, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdIn(List<String> values) {
            addCriterion("TECHNOLOGYPREFERENCE_ID in", values, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdNotIn(List<String> values) {
            addCriterion("TECHNOLOGYPREFERENCE_ID not in", values, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdBetween(String value1, String value2) {
            addCriterion("TECHNOLOGYPREFERENCE_ID between", value1, value2, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andTechnologypreferenceIdNotBetween(String value1, String value2) {
            addCriterion("TECHNOLOGYPREFERENCE_ID not between", value1, value2, "technologypreferenceId");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNull() {
            addCriterion("WORKING_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNotNull() {
            addCriterion("WORKING_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsEqualTo(Integer value) {
            addCriterion("WORKING_YEARS =", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotEqualTo(Integer value) {
            addCriterion("WORKING_YEARS <>", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThan(Integer value) {
            addCriterion("WORKING_YEARS >", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKING_YEARS >=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThan(Integer value) {
            addCriterion("WORKING_YEARS <", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThanOrEqualTo(Integer value) {
            addCriterion("WORKING_YEARS <=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIn(List<Integer> values) {
            addCriterion("WORKING_YEARS in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotIn(List<Integer> values) {
            addCriterion("WORKING_YEARS not in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsBetween(Integer value1, Integer value2) {
            addCriterion("WORKING_YEARS between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKING_YEARS not between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andHireTimeIsNull() {
            addCriterion("HIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHireTimeIsNotNull() {
            addCriterion("HIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHireTimeEqualTo(Date value) {
            addCriterion("HIRE_TIME =", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeNotEqualTo(Date value) {
            addCriterion("HIRE_TIME <>", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeGreaterThan(Date value) {
            addCriterion("HIRE_TIME >", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HIRE_TIME >=", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeLessThan(Date value) {
            addCriterion("HIRE_TIME <", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeLessThanOrEqualTo(Date value) {
            addCriterion("HIRE_TIME <=", value, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeIn(List<Date> values) {
            addCriterion("HIRE_TIME in", values, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeNotIn(List<Date> values) {
            addCriterion("HIRE_TIME not in", values, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeBetween(Date value1, Date value2) {
            addCriterion("HIRE_TIME between", value1, value2, "hireTime");
            return (Criteria) this;
        }

        public Criteria andHireTimeNotBetween(Date value1, Date value2) {
            addCriterion("HIRE_TIME not between", value1, value2, "hireTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andQqnoIsNull() {
            addCriterion("QQNO is null");
            return (Criteria) this;
        }

        public Criteria andQqnoIsNotNull() {
            addCriterion("QQNO is not null");
            return (Criteria) this;
        }

        public Criteria andQqnoEqualTo(String value) {
            addCriterion("QQNO =", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotEqualTo(String value) {
            addCriterion("QQNO <>", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoGreaterThan(String value) {
            addCriterion("QQNO >", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoGreaterThanOrEqualTo(String value) {
            addCriterion("QQNO >=", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoLessThan(String value) {
            addCriterion("QQNO <", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoLessThanOrEqualTo(String value) {
            addCriterion("QQNO <=", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoLike(String value) {
            addCriterion("QQNO like", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotLike(String value) {
            addCriterion("QQNO not like", value, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoIn(List<String> values) {
            addCriterion("QQNO in", values, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotIn(List<String> values) {
            addCriterion("QQNO not in", values, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoBetween(String value1, String value2) {
            addCriterion("QQNO between", value1, value2, "qqno");
            return (Criteria) this;
        }

        public Criteria andQqnoNotBetween(String value1, String value2) {
            addCriterion("QQNO not between", value1, value2, "qqno");
            return (Criteria) this;
        }

        public Criteria andLinknoIsNull() {
            addCriterion("LINKNO is null");
            return (Criteria) this;
        }

        public Criteria andLinknoIsNotNull() {
            addCriterion("LINKNO is not null");
            return (Criteria) this;
        }

        public Criteria andLinknoEqualTo(String value) {
            addCriterion("LINKNO =", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoNotEqualTo(String value) {
            addCriterion("LINKNO <>", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoGreaterThan(String value) {
            addCriterion("LINKNO >", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoGreaterThanOrEqualTo(String value) {
            addCriterion("LINKNO >=", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoLessThan(String value) {
            addCriterion("LINKNO <", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoLessThanOrEqualTo(String value) {
            addCriterion("LINKNO <=", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoLike(String value) {
            addCriterion("LINKNO like", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoNotLike(String value) {
            addCriterion("LINKNO not like", value, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoIn(List<String> values) {
            addCriterion("LINKNO in", values, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoNotIn(List<String> values) {
            addCriterion("LINKNO not in", values, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoBetween(String value1, String value2) {
            addCriterion("LINKNO between", value1, value2, "linkno");
            return (Criteria) this;
        }

        public Criteria andLinknoNotBetween(String value1, String value2) {
            addCriterion("LINKNO not between", value1, value2, "linkno");
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
     * 描述:PMS_CM_EMPLOYEE表的实体类
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
     * PMS_CM_EMPLOYEE 2017-11-09
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