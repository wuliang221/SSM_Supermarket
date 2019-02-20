package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andTypenoIsNull() {
            addCriterion("typeNo is null");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNotNull() {
            addCriterion("typeNo is not null");
            return (Criteria) this;
        }

        public Criteria andTypenoEqualTo(Integer value) {
            addCriterion("typeNo =", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotEqualTo(Integer value) {
            addCriterion("typeNo <>", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThan(Integer value) {
            addCriterion("typeNo >", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeNo >=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThan(Integer value) {
            addCriterion("typeNo <", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThanOrEqualTo(Integer value) {
            addCriterion("typeNo <=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoIn(List<Integer> values) {
            addCriterion("typeNo in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotIn(List<Integer> values) {
            addCriterion("typeNo not in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoBetween(Integer value1, Integer value2) {
            addCriterion("typeNo between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotBetween(Integer value1, Integer value2) {
            addCriterion("typeNo not between", value1, value2, "typeno");
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnormIsNull() {
            addCriterion("goodsNorm is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnormIsNotNull() {
            addCriterion("goodsNorm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnormEqualTo(String value) {
            addCriterion("goodsNorm =", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormNotEqualTo(String value) {
            addCriterion("goodsNorm <>", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormGreaterThan(String value) {
            addCriterion("goodsNorm >", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormGreaterThanOrEqualTo(String value) {
            addCriterion("goodsNorm >=", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormLessThan(String value) {
            addCriterion("goodsNorm <", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormLessThanOrEqualTo(String value) {
            addCriterion("goodsNorm <=", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormLike(String value) {
            addCriterion("goodsNorm like", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormNotLike(String value) {
            addCriterion("goodsNorm not like", value, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormIn(List<String> values) {
            addCriterion("goodsNorm in", values, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormNotIn(List<String> values) {
            addCriterion("goodsNorm not in", values, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormBetween(String value1, String value2) {
            addCriterion("goodsNorm between", value1, value2, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsnormNotBetween(String value1, String value2) {
            addCriterion("goodsNorm not between", value1, value2, "goodsnorm");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNull() {
            addCriterion("goodsUnit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIsNotNull() {
            addCriterion("goodsUnit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsunitEqualTo(String value) {
            addCriterion("goodsUnit =", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotEqualTo(String value) {
            addCriterion("goodsUnit <>", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThan(String value) {
            addCriterion("goodsUnit >", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitGreaterThanOrEqualTo(String value) {
            addCriterion("goodsUnit >=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThan(String value) {
            addCriterion("goodsUnit <", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLessThanOrEqualTo(String value) {
            addCriterion("goodsUnit <=", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitLike(String value) {
            addCriterion("goodsUnit like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotLike(String value) {
            addCriterion("goodsUnit not like", value, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitIn(List<String> values) {
            addCriterion("goodsUnit in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotIn(List<String> values) {
            addCriterion("goodsUnit not in", values, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitBetween(String value1, String value2) {
            addCriterion("goodsUnit between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodsunitNotBetween(String value1, String value2) {
            addCriterion("goodsUnit not between", value1, value2, "goodsunit");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNull() {
            addCriterion("goodsCount is null");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNotNull() {
            addCriterion("goodsCount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscountEqualTo(Integer value) {
            addCriterion("goodsCount =", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotEqualTo(Integer value) {
            addCriterion("goodsCount <>", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThan(Integer value) {
            addCriterion("goodsCount >", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsCount >=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThan(Integer value) {
            addCriterion("goodsCount <", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThanOrEqualTo(Integer value) {
            addCriterion("goodsCount <=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountIn(List<Integer> values) {
            addCriterion("goodsCount in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotIn(List<Integer> values) {
            addCriterion("goodsCount not in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountBetween(Integer value1, Integer value2) {
            addCriterion("goodsCount between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsCount not between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseIsNull() {
            addCriterion("goodsOutprise is null");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseIsNotNull() {
            addCriterion("goodsOutprise is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseEqualTo(Double value) {
            addCriterion("goodsOutprise =", value, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseNotEqualTo(Double value) {
            addCriterion("goodsOutprise <>", value, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseGreaterThan(Double value) {
            addCriterion("goodsOutprise >", value, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsOutprise >=", value, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseLessThan(Double value) {
            addCriterion("goodsOutprise <", value, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseLessThanOrEqualTo(Double value) {
            addCriterion("goodsOutprise <=", value, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseIn(List<Double> values) {
            addCriterion("goodsOutprise in", values, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseNotIn(List<Double> values) {
            addCriterion("goodsOutprise not in", values, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseBetween(Double value1, Double value2) {
            addCriterion("goodsOutprise between", value1, value2, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsoutpriseNotBetween(Double value1, Double value2) {
            addCriterion("goodsOutprise not between", value1, value2, "goodsoutprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseIsNull() {
            addCriterion("goodsInprise is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseIsNotNull() {
            addCriterion("goodsInprise is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseEqualTo(Double value) {
            addCriterion("goodsInprise =", value, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseNotEqualTo(Double value) {
            addCriterion("goodsInprise <>", value, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseGreaterThan(Double value) {
            addCriterion("goodsInprise >", value, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsInprise >=", value, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseLessThan(Double value) {
            addCriterion("goodsInprise <", value, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseLessThanOrEqualTo(Double value) {
            addCriterion("goodsInprise <=", value, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseIn(List<Double> values) {
            addCriterion("goodsInprise in", values, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseNotIn(List<Double> values) {
            addCriterion("goodsInprise not in", values, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseBetween(Double value1, Double value2) {
            addCriterion("goodsInprise between", value1, value2, "goodsinprise");
            return (Criteria) this;
        }

        public Criteria andGoodsinpriseNotBetween(Double value1, Double value2) {
            addCriterion("goodsInprise not between", value1, value2, "goodsinprise");
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