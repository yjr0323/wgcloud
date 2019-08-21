package com.agent.wgcloud.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetioStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetioStateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("ACCOUNT_ID like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("ACCOUNT_ID not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNull() {
            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("HOST_NAME not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andRxpckIsNull() {
            addCriterion("RXPCK is null");
            return (Criteria) this;
        }

        public Criteria andRxpckIsNotNull() {
            addCriterion("RXPCK is not null");
            return (Criteria) this;
        }

        public Criteria andRxpckEqualTo(String value) {
            addCriterion("RXPCK =", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckNotEqualTo(String value) {
            addCriterion("RXPCK <>", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckGreaterThan(String value) {
            addCriterion("RXPCK >", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckGreaterThanOrEqualTo(String value) {
            addCriterion("RXPCK >=", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckLessThan(String value) {
            addCriterion("RXPCK <", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckLessThanOrEqualTo(String value) {
            addCriterion("RXPCK <=", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckLike(String value) {
            addCriterion("RXPCK like", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckNotLike(String value) {
            addCriterion("RXPCK not like", value, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckIn(List<String> values) {
            addCriterion("RXPCK in", values, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckNotIn(List<String> values) {
            addCriterion("RXPCK not in", values, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckBetween(String value1, String value2) {
            addCriterion("RXPCK between", value1, value2, "rxpck");
            return (Criteria) this;
        }

        public Criteria andRxpckNotBetween(String value1, String value2) {
            addCriterion("RXPCK not between", value1, value2, "rxpck");
            return (Criteria) this;
        }

        public Criteria andTxpckIsNull() {
            addCriterion("TXPCK is null");
            return (Criteria) this;
        }

        public Criteria andTxpckIsNotNull() {
            addCriterion("TXPCK is not null");
            return (Criteria) this;
        }

        public Criteria andTxpckEqualTo(String value) {
            addCriterion("TXPCK =", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckNotEqualTo(String value) {
            addCriterion("TXPCK <>", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckGreaterThan(String value) {
            addCriterion("TXPCK >", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckGreaterThanOrEqualTo(String value) {
            addCriterion("TXPCK >=", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckLessThan(String value) {
            addCriterion("TXPCK <", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckLessThanOrEqualTo(String value) {
            addCriterion("TXPCK <=", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckLike(String value) {
            addCriterion("TXPCK like", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckNotLike(String value) {
            addCriterion("TXPCK not like", value, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckIn(List<String> values) {
            addCriterion("TXPCK in", values, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckNotIn(List<String> values) {
            addCriterion("TXPCK not in", values, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckBetween(String value1, String value2) {
            addCriterion("TXPCK between", value1, value2, "txpck");
            return (Criteria) this;
        }

        public Criteria andTxpckNotBetween(String value1, String value2) {
            addCriterion("TXPCK not between", value1, value2, "txpck");
            return (Criteria) this;
        }

        public Criteria andRxbytIsNull() {
            addCriterion("RXBYT is null");
            return (Criteria) this;
        }

        public Criteria andRxbytIsNotNull() {
            addCriterion("RXBYT is not null");
            return (Criteria) this;
        }

        public Criteria andRxbytEqualTo(String value) {
            addCriterion("RXBYT =", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytNotEqualTo(String value) {
            addCriterion("RXBYT <>", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytGreaterThan(String value) {
            addCriterion("RXBYT >", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytGreaterThanOrEqualTo(String value) {
            addCriterion("RXBYT >=", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytLessThan(String value) {
            addCriterion("RXBYT <", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytLessThanOrEqualTo(String value) {
            addCriterion("RXBYT <=", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytLike(String value) {
            addCriterion("RXBYT like", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytNotLike(String value) {
            addCriterion("RXBYT not like", value, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytIn(List<String> values) {
            addCriterion("RXBYT in", values, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytNotIn(List<String> values) {
            addCriterion("RXBYT not in", values, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytBetween(String value1, String value2) {
            addCriterion("RXBYT between", value1, value2, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andRxbytNotBetween(String value1, String value2) {
            addCriterion("RXBYT not between", value1, value2, "rxbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytIsNull() {
            addCriterion("TXBYT is null");
            return (Criteria) this;
        }

        public Criteria andTxbytIsNotNull() {
            addCriterion("TXBYT is not null");
            return (Criteria) this;
        }

        public Criteria andTxbytEqualTo(String value) {
            addCriterion("TXBYT =", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytNotEqualTo(String value) {
            addCriterion("TXBYT <>", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytGreaterThan(String value) {
            addCriterion("TXBYT >", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytGreaterThanOrEqualTo(String value) {
            addCriterion("TXBYT >=", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytLessThan(String value) {
            addCriterion("TXBYT <", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytLessThanOrEqualTo(String value) {
            addCriterion("TXBYT <=", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytLike(String value) {
            addCriterion("TXBYT like", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytNotLike(String value) {
            addCriterion("TXBYT not like", value, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytIn(List<String> values) {
            addCriterion("TXBYT in", values, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytNotIn(List<String> values) {
            addCriterion("TXBYT not in", values, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytBetween(String value1, String value2) {
            addCriterion("TXBYT between", value1, value2, "txbyt");
            return (Criteria) this;
        }

        public Criteria andTxbytNotBetween(String value1, String value2) {
            addCriterion("TXBYT not between", value1, value2, "txbyt");
            return (Criteria) this;
        }

        public Criteria andRxcmpIsNull() {
            addCriterion("RXCMP is null");
            return (Criteria) this;
        }

        public Criteria andRxcmpIsNotNull() {
            addCriterion("RXCMP is not null");
            return (Criteria) this;
        }

        public Criteria andRxcmpEqualTo(String value) {
            addCriterion("RXCMP =", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpNotEqualTo(String value) {
            addCriterion("RXCMP <>", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpGreaterThan(String value) {
            addCriterion("RXCMP >", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpGreaterThanOrEqualTo(String value) {
            addCriterion("RXCMP >=", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpLessThan(String value) {
            addCriterion("RXCMP <", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpLessThanOrEqualTo(String value) {
            addCriterion("RXCMP <=", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpLike(String value) {
            addCriterion("RXCMP like", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpNotLike(String value) {
            addCriterion("RXCMP not like", value, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpIn(List<String> values) {
            addCriterion("RXCMP in", values, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpNotIn(List<String> values) {
            addCriterion("RXCMP not in", values, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpBetween(String value1, String value2) {
            addCriterion("RXCMP between", value1, value2, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andRxcmpNotBetween(String value1, String value2) {
            addCriterion("RXCMP not between", value1, value2, "rxcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpIsNull() {
            addCriterion("TXCMP is null");
            return (Criteria) this;
        }

        public Criteria andTxcmpIsNotNull() {
            addCriterion("TXCMP is not null");
            return (Criteria) this;
        }

        public Criteria andTxcmpEqualTo(String value) {
            addCriterion("TXCMP =", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpNotEqualTo(String value) {
            addCriterion("TXCMP <>", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpGreaterThan(String value) {
            addCriterion("TXCMP >", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpGreaterThanOrEqualTo(String value) {
            addCriterion("TXCMP >=", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpLessThan(String value) {
            addCriterion("TXCMP <", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpLessThanOrEqualTo(String value) {
            addCriterion("TXCMP <=", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpLike(String value) {
            addCriterion("TXCMP like", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpNotLike(String value) {
            addCriterion("TXCMP not like", value, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpIn(List<String> values) {
            addCriterion("TXCMP in", values, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpNotIn(List<String> values) {
            addCriterion("TXCMP not in", values, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpBetween(String value1, String value2) {
            addCriterion("TXCMP between", value1, value2, "txcmp");
            return (Criteria) this;
        }

        public Criteria andTxcmpNotBetween(String value1, String value2) {
            addCriterion("TXCMP not between", value1, value2, "txcmp");
            return (Criteria) this;
        }

        public Criteria andRxmcstIsNull() {
            addCriterion("RXMCST is null");
            return (Criteria) this;
        }

        public Criteria andRxmcstIsNotNull() {
            addCriterion("RXMCST is not null");
            return (Criteria) this;
        }

        public Criteria andRxmcstEqualTo(String value) {
            addCriterion("RXMCST =", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstNotEqualTo(String value) {
            addCriterion("RXMCST <>", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstGreaterThan(String value) {
            addCriterion("RXMCST >", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstGreaterThanOrEqualTo(String value) {
            addCriterion("RXMCST >=", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstLessThan(String value) {
            addCriterion("RXMCST <", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstLessThanOrEqualTo(String value) {
            addCriterion("RXMCST <=", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstLike(String value) {
            addCriterion("RXMCST like", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstNotLike(String value) {
            addCriterion("RXMCST not like", value, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstIn(List<String> values) {
            addCriterion("RXMCST in", values, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstNotIn(List<String> values) {
            addCriterion("RXMCST not in", values, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstBetween(String value1, String value2) {
            addCriterion("RXMCST between", value1, value2, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andRxmcstNotBetween(String value1, String value2) {
            addCriterion("RXMCST not between", value1, value2, "rxmcst");
            return (Criteria) this;
        }

        public Criteria andDateStrIsNull() {
            addCriterion("DATE_STR is null");
            return (Criteria) this;
        }

        public Criteria andDateStrIsNotNull() {
            addCriterion("DATE_STR is not null");
            return (Criteria) this;
        }

        public Criteria andDateStrEqualTo(String value) {
            addCriterion("DATE_STR =", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrNotEqualTo(String value) {
            addCriterion("DATE_STR <>", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrGreaterThan(String value) {
            addCriterion("DATE_STR >", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_STR >=", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrLessThan(String value) {
            addCriterion("DATE_STR <", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrLessThanOrEqualTo(String value) {
            addCriterion("DATE_STR <=", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrLike(String value) {
            addCriterion("DATE_STR like", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrNotLike(String value) {
            addCriterion("DATE_STR not like", value, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrIn(List<String> values) {
            addCriterion("DATE_STR in", values, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrNotIn(List<String> values) {
            addCriterion("DATE_STR not in", values, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrBetween(String value1, String value2) {
            addCriterion("DATE_STR between", value1, value2, "dateStr");
            return (Criteria) this;
        }

        public Criteria andDateStrNotBetween(String value1, String value2) {
            addCriterion("DATE_STR not between", value1, value2, "dateStr");
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