package com.dp.bigdata.taurus.generated.module;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskAttemptExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public TaskAttemptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
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

        public Criteria andAttemptidIsNull() {
            addCriterion("attemptID is null");
            return (Criteria) this;
        }

        public Criteria andAttemptidIsNotNull() {
            addCriterion("attemptID is not null");
            return (Criteria) this;
        }

        public Criteria andAttemptidEqualTo(String value) {
            addCriterion("attemptID =", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidNotEqualTo(String value) {
            addCriterion("attemptID <>", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidGreaterThan(String value) {
            addCriterion("attemptID >", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidGreaterThanOrEqualTo(String value) {
            addCriterion("attemptID >=", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidLessThan(String value) {
            addCriterion("attemptID <", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidLessThanOrEqualTo(String value) {
            addCriterion("attemptID <=", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidLike(String value) {
            addCriterion("attemptID like", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidNotLike(String value) {
            addCriterion("attemptID not like", value, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidIn(List<String> values) {
            addCriterion("attemptID in", values, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidNotIn(List<String> values) {
            addCriterion("attemptID not in", values, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidBetween(String value1, String value2) {
            addCriterion("attemptID between", value1, value2, "attemptid");
            return (Criteria) this;
        }

        public Criteria andAttemptidNotBetween(String value1, String value2) {
            addCriterion("attemptID not between", value1, value2, "attemptid");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNull() {
            addCriterion("instanceID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNotNull() {
            addCriterion("instanceID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceidEqualTo(String value) {
            addCriterion("instanceID =", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotEqualTo(String value) {
            addCriterion("instanceID <>", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThan(String value) {
            addCriterion("instanceID >", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("instanceID >=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThan(String value) {
            addCriterion("instanceID <", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThanOrEqualTo(String value) {
            addCriterion("instanceID <=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLike(String value) {
            addCriterion("instanceID like", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotLike(String value) {
            addCriterion("instanceID not like", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidIn(List<String> values) {
            addCriterion("instanceID in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotIn(List<String> values) {
            addCriterion("instanceID not in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidBetween(String value1, String value2) {
            addCriterion("instanceID between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotBetween(String value1, String value2) {
            addCriterion("instanceID not between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeIsNull() {
            addCriterion("scheduleTime is null");
            return (Criteria) this;
        }

        public Criteria andScheduletimeIsNotNull() {
            addCriterion("scheduleTime is not null");
            return (Criteria) this;
        }

        public Criteria andScheduletimeEqualTo(Date value) {
            addCriterion("scheduleTime =", value, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeNotEqualTo(Date value) {
            addCriterion("scheduleTime <>", value, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeGreaterThan(Date value) {
            addCriterion("scheduleTime >", value, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scheduleTime >=", value, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeLessThan(Date value) {
            addCriterion("scheduleTime <", value, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeLessThanOrEqualTo(Date value) {
            addCriterion("scheduleTime <=", value, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeIn(List<Date> values) {
            addCriterion("scheduleTime in", values, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeNotIn(List<Date> values) {
            addCriterion("scheduleTime not in", values, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeBetween(Date value1, Date value2) {
            addCriterion("scheduleTime between", value1, value2, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andScheduletimeNotBetween(Date value1, Date value2) {
            addCriterion("scheduleTime not between", value1, value2, "scheduletime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReturnvalueIsNull() {
            addCriterion("returnValue is null");
            return (Criteria) this;
        }

        public Criteria andReturnvalueIsNotNull() {
            addCriterion("returnValue is not null");
            return (Criteria) this;
        }

        public Criteria andReturnvalueEqualTo(Integer value) {
            addCriterion("returnValue =", value, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueNotEqualTo(Integer value) {
            addCriterion("returnValue <>", value, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueGreaterThan(Integer value) {
            addCriterion("returnValue >", value, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnValue >=", value, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueLessThan(Integer value) {
            addCriterion("returnValue <", value, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueLessThanOrEqualTo(Integer value) {
            addCriterion("returnValue <=", value, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueIn(List<Integer> values) {
            addCriterion("returnValue in", values, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueNotIn(List<Integer> values) {
            addCriterion("returnValue not in", values, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueBetween(Integer value1, Integer value2) {
            addCriterion("returnValue between", value1, value2, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andReturnvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("returnValue not between", value1, value2, "returnvalue");
            return (Criteria) this;
        }

        public Criteria andExechostIsNull() {
            addCriterion("execHost is null");
            return (Criteria) this;
        }

        public Criteria andExechostIsNotNull() {
            addCriterion("execHost is not null");
            return (Criteria) this;
        }

        public Criteria andExechostEqualTo(String value) {
            addCriterion("execHost =", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostNotEqualTo(String value) {
            addCriterion("execHost <>", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostGreaterThan(String value) {
            addCriterion("execHost >", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostGreaterThanOrEqualTo(String value) {
            addCriterion("execHost >=", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostLessThan(String value) {
            addCriterion("execHost <", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostLessThanOrEqualTo(String value) {
            addCriterion("execHost <=", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostLike(String value) {
            addCriterion("execHost like", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostNotLike(String value) {
            addCriterion("execHost not like", value, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostIn(List<String> values) {
            addCriterion("execHost in", values, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostNotIn(List<String> values) {
            addCriterion("execHost not in", values, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostBetween(String value1, String value2) {
            addCriterion("execHost between", value1, value2, "exechost");
            return (Criteria) this;
        }

        public Criteria andExechostNotBetween(String value1, String value2) {
            addCriterion("execHost not between", value1, value2, "exechost");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated do_not_delete_during_merge Mon Apr 28 17:09:46 HKT 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TaurusTaskAttempt
     *
     * @mbggenerated Mon Apr 28 17:09:46 HKT 2014
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