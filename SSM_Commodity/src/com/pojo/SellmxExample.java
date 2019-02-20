package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellmxExample() {
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

        public Criteria andSellmxnoIsNull() {
            addCriterion("sellmxNo is null");
            return (Criteria) this;
        }

        public Criteria andSellmxnoIsNotNull() {
            addCriterion("sellmxNo is not null");
            return (Criteria) this;
        }

        public Criteria andSellmxnoEqualTo(Integer value) {
            addCriterion("sellmxNo =", value, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoNotEqualTo(Integer value) {
            addCriterion("sellmxNo <>", value, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoGreaterThan(Integer value) {
            addCriterion("sellmxNo >", value, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellmxNo >=", value, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoLessThan(Integer value) {
            addCriterion("sellmxNo <", value, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoLessThanOrEqualTo(Integer value) {
            addCriterion("sellmxNo <=", value, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoIn(List<Integer> values) {
            addCriterion("sellmxNo in", values, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoNotIn(List<Integer> values) {
            addCriterion("sellmxNo not in", values, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoBetween(Integer value1, Integer value2) {
            addCriterion("sellmxNo between", value1, value2, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andSellmxnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sellmxNo not between", value1, value2, "sellmxno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNull() {
            addCriterion("goodsNo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNotNull() {
            addCriterion("goodsNo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoEqualTo(Integer value) {
            addCriterion("goodsNo =", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotEqualTo(Integer value) {
            addCriterion("goodsNo <>", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThan(Integer value) {
            addCriterion("goodsNo >", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsNo >=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThan(Integer value) {
            addCriterion("goodsNo <", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThanOrEqualTo(Integer value) {
            addCriterion("goodsNo <=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIn(List<Integer> values) {
            addCriterion("goodsNo in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotIn(List<Integer> values) {
            addCriterion("goodsNo not in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoBetween(Integer value1, Integer value2) {
            addCriterion("goodsNo between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsNo not between", value1, value2, "goodsno");
            return (Criteria) this;
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

        public Criteria andSellnoIsNull() {
            addCriterion("sellNo is null");
            return (Criteria) this;
        }

        public Criteria andSellnoIsNotNull() {
            addCriterion("sellNo is not null");
            return (Criteria) this;
        }

        public Criteria andSellnoEqualTo(Integer value) {
            addCriterion("sellNo =", value, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoNotEqualTo(Integer value) {
            addCriterion("sellNo <>", value, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoGreaterThan(Integer value) {
            addCriterion("sellNo >", value, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellNo >=", value, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoLessThan(Integer value) {
            addCriterion("sellNo <", value, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoLessThanOrEqualTo(Integer value) {
            addCriterion("sellNo <=", value, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoIn(List<Integer> values) {
            addCriterion("sellNo in", values, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoNotIn(List<Integer> values) {
            addCriterion("sellNo not in", values, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoBetween(Integer value1, Integer value2) {
            addCriterion("sellNo between", value1, value2, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sellNo not between", value1, value2, "sellno");
            return (Criteria) this;
        }

        public Criteria andSellmxcountIsNull() {
            addCriterion("sellmxCount is null");
            return (Criteria) this;
        }

        public Criteria andSellmxcountIsNotNull() {
            addCriterion("sellmxCount is not null");
            return (Criteria) this;
        }

        public Criteria andSellmxcountEqualTo(Integer value) {
            addCriterion("sellmxCount =", value, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountNotEqualTo(Integer value) {
            addCriterion("sellmxCount <>", value, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountGreaterThan(Integer value) {
            addCriterion("sellmxCount >", value, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellmxCount >=", value, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountLessThan(Integer value) {
            addCriterion("sellmxCount <", value, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountLessThanOrEqualTo(Integer value) {
            addCriterion("sellmxCount <=", value, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountIn(List<Integer> values) {
            addCriterion("sellmxCount in", values, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountNotIn(List<Integer> values) {
            addCriterion("sellmxCount not in", values, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountBetween(Integer value1, Integer value2) {
            addCriterion("sellmxCount between", value1, value2, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxcountNotBetween(Integer value1, Integer value2) {
            addCriterion("sellmxCount not between", value1, value2, "sellmxcount");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseIsNull() {
            addCriterion("sellmxZprise is null");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseIsNotNull() {
            addCriterion("sellmxZprise is not null");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseEqualTo(Integer value) {
            addCriterion("sellmxZprise =", value, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseNotEqualTo(Integer value) {
            addCriterion("sellmxZprise <>", value, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseGreaterThan(Integer value) {
            addCriterion("sellmxZprise >", value, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellmxZprise >=", value, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseLessThan(Integer value) {
            addCriterion("sellmxZprise <", value, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseLessThanOrEqualTo(Integer value) {
            addCriterion("sellmxZprise <=", value, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseIn(List<Integer> values) {
            addCriterion("sellmxZprise in", values, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseNotIn(List<Integer> values) {
            addCriterion("sellmxZprise not in", values, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseBetween(Integer value1, Integer value2) {
            addCriterion("sellmxZprise between", value1, value2, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxzpriseNotBetween(Integer value1, Integer value2) {
            addCriterion("sellmxZprise not between", value1, value2, "sellmxzprise");
            return (Criteria) this;
        }

        public Criteria andSellmxdateIsNull() {
            addCriterion("sellmxDate is null");
            return (Criteria) this;
        }

        public Criteria andSellmxdateIsNotNull() {
            addCriterion("sellmxDate is not null");
            return (Criteria) this;
        }

        public Criteria andSellmxdateEqualTo(Date value) {
            addCriterion("sellmxDate =", value, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateNotEqualTo(Date value) {
            addCriterion("sellmxDate <>", value, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateGreaterThan(Date value) {
            addCriterion("sellmxDate >", value, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sellmxDate >=", value, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateLessThan(Date value) {
            addCriterion("sellmxDate <", value, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateLessThanOrEqualTo(Date value) {
            addCriterion("sellmxDate <=", value, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateIn(List<Date> values) {
            addCriterion("sellmxDate in", values, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateNotIn(List<Date> values) {
            addCriterion("sellmxDate not in", values, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateBetween(Date value1, Date value2) {
            addCriterion("sellmxDate between", value1, value2, "sellmxdate");
            return (Criteria) this;
        }

        public Criteria andSellmxdateNotBetween(Date value1, Date value2) {
            addCriterion("sellmxDate not between", value1, value2, "sellmxdate");
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