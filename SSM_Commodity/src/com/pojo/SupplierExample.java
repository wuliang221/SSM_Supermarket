package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSuppliernameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("supplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("supplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("supplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("supplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("supplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("supplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSupplieradressIsNull() {
            addCriterion("supplierAdress is null");
            return (Criteria) this;
        }

        public Criteria andSupplieradressIsNotNull() {
            addCriterion("supplierAdress is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieradressEqualTo(String value) {
            addCriterion("supplierAdress =", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressNotEqualTo(String value) {
            addCriterion("supplierAdress <>", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressGreaterThan(String value) {
            addCriterion("supplierAdress >", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressGreaterThanOrEqualTo(String value) {
            addCriterion("supplierAdress >=", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressLessThan(String value) {
            addCriterion("supplierAdress <", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressLessThanOrEqualTo(String value) {
            addCriterion("supplierAdress <=", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressLike(String value) {
            addCriterion("supplierAdress like", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressNotLike(String value) {
            addCriterion("supplierAdress not like", value, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressIn(List<String> values) {
            addCriterion("supplierAdress in", values, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressNotIn(List<String> values) {
            addCriterion("supplierAdress not in", values, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressBetween(String value1, String value2) {
            addCriterion("supplierAdress between", value1, value2, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplieradressNotBetween(String value1, String value2) {
            addCriterion("supplierAdress not between", value1, value2, "supplieradress");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameIsNull() {
            addCriterion("supplierPeopleName is null");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameIsNotNull() {
            addCriterion("supplierPeopleName is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameEqualTo(String value) {
            addCriterion("supplierPeopleName =", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameNotEqualTo(String value) {
            addCriterion("supplierPeopleName <>", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameGreaterThan(String value) {
            addCriterion("supplierPeopleName >", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierPeopleName >=", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameLessThan(String value) {
            addCriterion("supplierPeopleName <", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameLessThanOrEqualTo(String value) {
            addCriterion("supplierPeopleName <=", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameLike(String value) {
            addCriterion("supplierPeopleName like", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameNotLike(String value) {
            addCriterion("supplierPeopleName not like", value, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameIn(List<String> values) {
            addCriterion("supplierPeopleName in", values, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameNotIn(List<String> values) {
            addCriterion("supplierPeopleName not in", values, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameBetween(String value1, String value2) {
            addCriterion("supplierPeopleName between", value1, value2, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierpeoplenameNotBetween(String value1, String value2) {
            addCriterion("supplierPeopleName not between", value1, value2, "supplierpeoplename");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNull() {
            addCriterion("supplierPhone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNotNull() {
            addCriterion("supplierPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneEqualTo(String value) {
            addCriterion("supplierPhone =", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotEqualTo(String value) {
            addCriterion("supplierPhone <>", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThan(String value) {
            addCriterion("supplierPhone >", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplierPhone >=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThan(String value) {
            addCriterion("supplierPhone <", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThanOrEqualTo(String value) {
            addCriterion("supplierPhone <=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLike(String value) {
            addCriterion("supplierPhone like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotLike(String value) {
            addCriterion("supplierPhone not like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIn(List<String> values) {
            addCriterion("supplierPhone in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotIn(List<String> values) {
            addCriterion("supplierPhone not in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneBetween(String value1, String value2) {
            addCriterion("supplierPhone between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotBetween(String value1, String value2) {
            addCriterion("supplierPhone not between", value1, value2, "supplierphone");
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