package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStocknoIsNull() {
            addCriterion("stockNo is null");
            return (Criteria) this;
        }

        public Criteria andStocknoIsNotNull() {
            addCriterion("stockNo is not null");
            return (Criteria) this;
        }

        public Criteria andStocknoEqualTo(Integer value) {
            addCriterion("stockNo =", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotEqualTo(Integer value) {
            addCriterion("stockNo <>", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoGreaterThan(Integer value) {
            addCriterion("stockNo >", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockNo >=", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoLessThan(Integer value) {
            addCriterion("stockNo <", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoLessThanOrEqualTo(Integer value) {
            addCriterion("stockNo <=", value, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoIn(List<Integer> values) {
            addCriterion("stockNo in", values, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotIn(List<Integer> values) {
            addCriterion("stockNo not in", values, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoBetween(Integer value1, Integer value2) {
            addCriterion("stockNo between", value1, value2, "stockno");
            return (Criteria) this;
        }

        public Criteria andStocknoNotBetween(Integer value1, Integer value2) {
            addCriterion("stockNo not between", value1, value2, "stockno");
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

        public Criteria andSuppliernoIsNull() {
            addCriterion("supplierNo is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernoIsNotNull() {
            addCriterion("supplierNo is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernoEqualTo(Integer value) {
            addCriterion("supplierNo =", value, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoNotEqualTo(Integer value) {
            addCriterion("supplierNo <>", value, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoGreaterThan(Integer value) {
            addCriterion("supplierNo >", value, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplierNo >=", value, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoLessThan(Integer value) {
            addCriterion("supplierNo <", value, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoLessThanOrEqualTo(Integer value) {
            addCriterion("supplierNo <=", value, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoIn(List<Integer> values) {
            addCriterion("supplierNo in", values, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoNotIn(List<Integer> values) {
            addCriterion("supplierNo not in", values, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoBetween(Integer value1, Integer value2) {
            addCriterion("supplierNo between", value1, value2, "supplierno");
            return (Criteria) this;
        }

        public Criteria andSuppliernoNotBetween(Integer value1, Integer value2) {
            addCriterion("supplierNo not between", value1, value2, "supplierno");
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

        public Criteria andStockcountIsNull() {
            addCriterion("stockCount is null");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNotNull() {
            addCriterion("stockCount is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountEqualTo(Integer value) {
            addCriterion("stockCount =", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotEqualTo(Integer value) {
            addCriterion("stockCount <>", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThan(Integer value) {
            addCriterion("stockCount >", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockCount >=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThan(Integer value) {
            addCriterion("stockCount <", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThanOrEqualTo(Integer value) {
            addCriterion("stockCount <=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountIn(List<Integer> values) {
            addCriterion("stockCount in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotIn(List<Integer> values) {
            addCriterion("stockCount not in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountBetween(Integer value1, Integer value2) {
            addCriterion("stockCount between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotBetween(Integer value1, Integer value2) {
            addCriterion("stockCount not between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseIsNull() {
            addCriterion("stockLastinprise is null");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseIsNotNull() {
            addCriterion("stockLastinprise is not null");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseEqualTo(Integer value) {
            addCriterion("stockLastinprise =", value, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseNotEqualTo(Integer value) {
            addCriterion("stockLastinprise <>", value, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseGreaterThan(Integer value) {
            addCriterion("stockLastinprise >", value, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockLastinprise >=", value, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseLessThan(Integer value) {
            addCriterion("stockLastinprise <", value, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseLessThanOrEqualTo(Integer value) {
            addCriterion("stockLastinprise <=", value, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseIn(List<Integer> values) {
            addCriterion("stockLastinprise in", values, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseNotIn(List<Integer> values) {
            addCriterion("stockLastinprise not in", values, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseBetween(Integer value1, Integer value2) {
            addCriterion("stockLastinprise between", value1, value2, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStocklastinpriseNotBetween(Integer value1, Integer value2) {
            addCriterion("stockLastinprise not between", value1, value2, "stocklastinprise");
            return (Criteria) this;
        }

        public Criteria andStockdateIsNull() {
            addCriterion("stockDate is null");
            return (Criteria) this;
        }

        public Criteria andStockdateIsNotNull() {
            addCriterion("stockDate is not null");
            return (Criteria) this;
        }

        public Criteria andStockdateEqualTo(Date value) {
            addCriterionForJDBCDate("stockDate =", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("stockDate <>", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateGreaterThan(Date value) {
            addCriterionForJDBCDate("stockDate >", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stockDate >=", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateLessThan(Date value) {
            addCriterionForJDBCDate("stockDate <", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stockDate <=", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateIn(List<Date> values) {
            addCriterionForJDBCDate("stockDate in", values, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("stockDate not in", values, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stockDate between", value1, value2, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stockDate not between", value1, value2, "stockdate");
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