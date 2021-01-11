package com.yunhe.common.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
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
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameIsNull() {
            addCriterion("SCENIC_SPOT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameIsNotNull() {
            addCriterion("SCENIC_SPOT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameEqualTo(String value) {
            addCriterion("SCENIC_SPOT_NAME =", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotEqualTo(String value) {
            addCriterion("SCENIC_SPOT_NAME <>", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameGreaterThan(String value) {
            addCriterion("SCENIC_SPOT_NAME >", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_SPOT_NAME >=", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameLessThan(String value) {
            addCriterion("SCENIC_SPOT_NAME <", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_SPOT_NAME <=", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameLike(String value) {
            addCriterion("SCENIC_SPOT_NAME like", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotLike(String value) {
            addCriterion("SCENIC_SPOT_NAME not like", value, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameIn(List<String> values) {
            addCriterion("SCENIC_SPOT_NAME in", values, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotIn(List<String> values) {
            addCriterion("SCENIC_SPOT_NAME not in", values, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameBetween(String value1, String value2) {
            addCriterion("SCENIC_SPOT_NAME between", value1, value2, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNameNotBetween(String value1, String value2) {
            addCriterion("SCENIC_SPOT_NAME not between", value1, value2, "scenicSpotName");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontIsNull() {
            addCriterion("ADULT_TICKETS_ACCONT is null");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontIsNotNull() {
            addCriterion("ADULT_TICKETS_ACCONT is not null");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontEqualTo(Integer value) {
            addCriterion("ADULT_TICKETS_ACCONT =", value, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontNotEqualTo(Integer value) {
            addCriterion("ADULT_TICKETS_ACCONT <>", value, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontGreaterThan(Integer value) {
            addCriterion("ADULT_TICKETS_ACCONT >", value, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADULT_TICKETS_ACCONT >=", value, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontLessThan(Integer value) {
            addCriterion("ADULT_TICKETS_ACCONT <", value, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontLessThanOrEqualTo(Integer value) {
            addCriterion("ADULT_TICKETS_ACCONT <=", value, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontIn(List<Integer> values) {
            addCriterion("ADULT_TICKETS_ACCONT in", values, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontNotIn(List<Integer> values) {
            addCriterion("ADULT_TICKETS_ACCONT not in", values, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontBetween(Integer value1, Integer value2) {
            addCriterion("ADULT_TICKETS_ACCONT between", value1, value2, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andAdultTicketsAccontNotBetween(Integer value1, Integer value2) {
            addCriterion("ADULT_TICKETS_ACCONT not between", value1, value2, "adultTicketsAccont");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountIsNull() {
            addCriterion("CHILD_TICKETS_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountIsNotNull() {
            addCriterion("CHILD_TICKETS_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountEqualTo(Integer value) {
            addCriterion("CHILD_TICKETS_ACCOUNT =", value, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountNotEqualTo(Integer value) {
            addCriterion("CHILD_TICKETS_ACCOUNT <>", value, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountGreaterThan(Integer value) {
            addCriterion("CHILD_TICKETS_ACCOUNT >", value, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHILD_TICKETS_ACCOUNT >=", value, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountLessThan(Integer value) {
            addCriterion("CHILD_TICKETS_ACCOUNT <", value, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountLessThanOrEqualTo(Integer value) {
            addCriterion("CHILD_TICKETS_ACCOUNT <=", value, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountIn(List<Integer> values) {
            addCriterion("CHILD_TICKETS_ACCOUNT in", values, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountNotIn(List<Integer> values) {
            addCriterion("CHILD_TICKETS_ACCOUNT not in", values, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountBetween(Integer value1, Integer value2) {
            addCriterion("CHILD_TICKETS_ACCOUNT between", value1, value2, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andChildTicketsAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("CHILD_TICKETS_ACCOUNT not between", value1, value2, "childTicketsAccount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNull() {
            addCriterion("ORDER_TOTAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNotNull() {
            addCriterion("ORDER_TOTAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceEqualTo(Double value) {
            addCriterion("ORDER_TOTAL_PRICE =", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotEqualTo(Double value) {
            addCriterion("ORDER_TOTAL_PRICE <>", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThan(Double value) {
            addCriterion("ORDER_TOTAL_PRICE >", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ORDER_TOTAL_PRICE >=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThan(Double value) {
            addCriterion("ORDER_TOTAL_PRICE <", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("ORDER_TOTAL_PRICE <=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIn(List<Double> values) {
            addCriterion("ORDER_TOTAL_PRICE in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotIn(List<Double> values) {
            addCriterion("ORDER_TOTAL_PRICE not in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceBetween(Double value1, Double value2) {
            addCriterion("ORDER_TOTAL_PRICE between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("ORDER_TOTAL_PRICE not between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodIsNull() {
            addCriterion("ORDER_PAYMENT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodIsNotNull() {
            addCriterion("ORDER_PAYMENT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodEqualTo(String value) {
            addCriterion("ORDER_PAYMENT_METHOD =", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodNotEqualTo(String value) {
            addCriterion("ORDER_PAYMENT_METHOD <>", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodGreaterThan(String value) {
            addCriterion("ORDER_PAYMENT_METHOD >", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PAYMENT_METHOD >=", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodLessThan(String value) {
            addCriterion("ORDER_PAYMENT_METHOD <", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PAYMENT_METHOD <=", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodLike(String value) {
            addCriterion("ORDER_PAYMENT_METHOD like", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodNotLike(String value) {
            addCriterion("ORDER_PAYMENT_METHOD not like", value, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodIn(List<String> values) {
            addCriterion("ORDER_PAYMENT_METHOD in", values, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodNotIn(List<String> values) {
            addCriterion("ORDER_PAYMENT_METHOD not in", values, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodBetween(String value1, String value2) {
            addCriterion("ORDER_PAYMENT_METHOD between", value1, value2, "orderPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("ORDER_PAYMENT_METHOD not between", value1, value2, "orderPaymentMethod");
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

        public Criteria andOrderStateIsNull() {
            addCriterion("ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("ORDER_STATE =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("ORDER_STATE <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("ORDER_STATE >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATE >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("ORDER_STATE <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATE <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("ORDER_STATE in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("ORDER_STATE not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATE between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATE not between", value1, value2, "orderState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated do_not_delete_during_merge Mon Jan 11 12:58:19 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
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