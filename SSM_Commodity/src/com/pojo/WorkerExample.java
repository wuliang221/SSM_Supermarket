package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerExample() {
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

        public Criteria andWorkernoIsNull() {
            addCriterion("workerNo is null");
            return (Criteria) this;
        }

        public Criteria andWorkernoIsNotNull() {
            addCriterion("workerNo is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernoEqualTo(Integer value) {
            addCriterion("workerNo =", value, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoNotEqualTo(Integer value) {
            addCriterion("workerNo <>", value, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoGreaterThan(Integer value) {
            addCriterion("workerNo >", value, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("workerNo >=", value, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoLessThan(Integer value) {
            addCriterion("workerNo <", value, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoLessThanOrEqualTo(Integer value) {
            addCriterion("workerNo <=", value, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoIn(List<Integer> values) {
            addCriterion("workerNo in", values, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoNotIn(List<Integer> values) {
            addCriterion("workerNo not in", values, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoBetween(Integer value1, Integer value2) {
            addCriterion("workerNo between", value1, value2, "workerno");
            return (Criteria) this;
        }

        public Criteria andWorkernoNotBetween(Integer value1, Integer value2) {
            addCriterion("workerNo not between", value1, value2, "workerno");
            return (Criteria) this;
        }

        public Criteria andAdminnoIsNull() {
            addCriterion("adminNo is null");
            return (Criteria) this;
        }

        public Criteria andAdminnoIsNotNull() {
            addCriterion("adminNo is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnoEqualTo(Integer value) {
            addCriterion("adminNo =", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoNotEqualTo(Integer value) {
            addCriterion("adminNo <>", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoGreaterThan(Integer value) {
            addCriterion("adminNo >", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminNo >=", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoLessThan(Integer value) {
            addCriterion("adminNo <", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoLessThanOrEqualTo(Integer value) {
            addCriterion("adminNo <=", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoIn(List<Integer> values) {
            addCriterion("adminNo in", values, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoNotIn(List<Integer> values) {
            addCriterion("adminNo not in", values, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoBetween(Integer value1, Integer value2) {
            addCriterion("adminNo between", value1, value2, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoNotBetween(Integer value1, Integer value2) {
            addCriterion("adminNo not between", value1, value2, "adminno");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNull() {
            addCriterion("workerName is null");
            return (Criteria) this;
        }

        public Criteria andWorkernameIsNotNull() {
            addCriterion("workerName is not null");
            return (Criteria) this;
        }

        public Criteria andWorkernameEqualTo(String value) {
            addCriterion("workerName =", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotEqualTo(String value) {
            addCriterion("workerName <>", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThan(String value) {
            addCriterion("workerName >", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameGreaterThanOrEqualTo(String value) {
            addCriterion("workerName >=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThan(String value) {
            addCriterion("workerName <", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLessThanOrEqualTo(String value) {
            addCriterion("workerName <=", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameLike(String value) {
            addCriterion("workerName like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotLike(String value) {
            addCriterion("workerName not like", value, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameIn(List<String> values) {
            addCriterion("workerName in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotIn(List<String> values) {
            addCriterion("workerName not in", values, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameBetween(String value1, String value2) {
            addCriterion("workerName between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkernameNotBetween(String value1, String value2) {
            addCriterion("workerName not between", value1, value2, "workername");
            return (Criteria) this;
        }

        public Criteria andWorkersexIsNull() {
            addCriterion("workerSex is null");
            return (Criteria) this;
        }

        public Criteria andWorkersexIsNotNull() {
            addCriterion("workerSex is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersexEqualTo(String value) {
            addCriterion("workerSex =", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotEqualTo(String value) {
            addCriterion("workerSex <>", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexGreaterThan(String value) {
            addCriterion("workerSex >", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexGreaterThanOrEqualTo(String value) {
            addCriterion("workerSex >=", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexLessThan(String value) {
            addCriterion("workerSex <", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexLessThanOrEqualTo(String value) {
            addCriterion("workerSex <=", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexLike(String value) {
            addCriterion("workerSex like", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotLike(String value) {
            addCriterion("workerSex not like", value, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexIn(List<String> values) {
            addCriterion("workerSex in", values, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotIn(List<String> values) {
            addCriterion("workerSex not in", values, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexBetween(String value1, String value2) {
            addCriterion("workerSex between", value1, value2, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkersexNotBetween(String value1, String value2) {
            addCriterion("workerSex not between", value1, value2, "workersex");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneIsNull() {
            addCriterion("workerPhone is null");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneIsNotNull() {
            addCriterion("workerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneEqualTo(String value) {
            addCriterion("workerPhone =", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotEqualTo(String value) {
            addCriterion("workerPhone <>", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneGreaterThan(String value) {
            addCriterion("workerPhone >", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("workerPhone >=", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneLessThan(String value) {
            addCriterion("workerPhone <", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneLessThanOrEqualTo(String value) {
            addCriterion("workerPhone <=", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneLike(String value) {
            addCriterion("workerPhone like", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotLike(String value) {
            addCriterion("workerPhone not like", value, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneIn(List<String> values) {
            addCriterion("workerPhone in", values, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotIn(List<String> values) {
            addCriterion("workerPhone not in", values, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneBetween(String value1, String value2) {
            addCriterion("workerPhone between", value1, value2, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkerphoneNotBetween(String value1, String value2) {
            addCriterion("workerPhone not between", value1, value2, "workerphone");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryIsNull() {
            addCriterion("workerSalary is null");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryIsNotNull() {
            addCriterion("workerSalary is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryEqualTo(Integer value) {
            addCriterion("workerSalary =", value, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryNotEqualTo(Integer value) {
            addCriterion("workerSalary <>", value, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryGreaterThan(Integer value) {
            addCriterion("workerSalary >", value, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("workerSalary >=", value, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryLessThan(Integer value) {
            addCriterion("workerSalary <", value, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryLessThanOrEqualTo(Integer value) {
            addCriterion("workerSalary <=", value, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryIn(List<Integer> values) {
            addCriterion("workerSalary in", values, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryNotIn(List<Integer> values) {
            addCriterion("workerSalary not in", values, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryBetween(Integer value1, Integer value2) {
            addCriterion("workerSalary between", value1, value2, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkersalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("workerSalary not between", value1, value2, "workersalary");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdIsNull() {
            addCriterion("workerPwd is null");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdIsNotNull() {
            addCriterion("workerPwd is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdEqualTo(String value) {
            addCriterion("workerPwd =", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotEqualTo(String value) {
            addCriterion("workerPwd <>", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdGreaterThan(String value) {
            addCriterion("workerPwd >", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdGreaterThanOrEqualTo(String value) {
            addCriterion("workerPwd >=", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdLessThan(String value) {
            addCriterion("workerPwd <", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdLessThanOrEqualTo(String value) {
            addCriterion("workerPwd <=", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdLike(String value) {
            addCriterion("workerPwd like", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotLike(String value) {
            addCriterion("workerPwd not like", value, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdIn(List<String> values) {
            addCriterion("workerPwd in", values, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotIn(List<String> values) {
            addCriterion("workerPwd not in", values, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdBetween(String value1, String value2) {
            addCriterion("workerPwd between", value1, value2, "workerpwd");
            return (Criteria) this;
        }

        public Criteria andWorkerpwdNotBetween(String value1, String value2) {
            addCriterion("workerPwd not between", value1, value2, "workerpwd");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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