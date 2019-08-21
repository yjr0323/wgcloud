package com.agent.wgcloud.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiskioStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiskioStateExample() {
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

        public Criteria andRsIsNull() {
            addCriterion("RS is null");
            return (Criteria) this;
        }

        public Criteria andRsIsNotNull() {
            addCriterion("RS is not null");
            return (Criteria) this;
        }

        public Criteria andRsEqualTo(String value) {
            addCriterion("RS =", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsNotEqualTo(String value) {
            addCriterion("RS <>", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsGreaterThan(String value) {
            addCriterion("RS >", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsGreaterThanOrEqualTo(String value) {
            addCriterion("RS >=", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsLessThan(String value) {
            addCriterion("RS <", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsLessThanOrEqualTo(String value) {
            addCriterion("RS <=", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsLike(String value) {
            addCriterion("RS like", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsNotLike(String value) {
            addCriterion("RS not like", value, "rs");
            return (Criteria) this;
        }

        public Criteria andRsIn(List<String> values) {
            addCriterion("RS in", values, "rs");
            return (Criteria) this;
        }

        public Criteria andRsNotIn(List<String> values) {
            addCriterion("RS not in", values, "rs");
            return (Criteria) this;
        }

        public Criteria andRsBetween(String value1, String value2) {
            addCriterion("RS between", value1, value2, "rs");
            return (Criteria) this;
        }

        public Criteria andRsNotBetween(String value1, String value2) {
            addCriterion("RS not between", value1, value2, "rs");
            return (Criteria) this;
        }

        public Criteria andWsIsNull() {
            addCriterion("WS is null");
            return (Criteria) this;
        }

        public Criteria andWsIsNotNull() {
            addCriterion("WS is not null");
            return (Criteria) this;
        }

        public Criteria andWsEqualTo(String value) {
            addCriterion("WS =", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotEqualTo(String value) {
            addCriterion("WS <>", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsGreaterThan(String value) {
            addCriterion("WS >", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsGreaterThanOrEqualTo(String value) {
            addCriterion("WS >=", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsLessThan(String value) {
            addCriterion("WS <", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsLessThanOrEqualTo(String value) {
            addCriterion("WS <=", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsLike(String value) {
            addCriterion("WS like", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotLike(String value) {
            addCriterion("WS not like", value, "ws");
            return (Criteria) this;
        }

        public Criteria andWsIn(List<String> values) {
            addCriterion("WS in", values, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotIn(List<String> values) {
            addCriterion("WS not in", values, "ws");
            return (Criteria) this;
        }

        public Criteria andWsBetween(String value1, String value2) {
            addCriterion("WS between", value1, value2, "ws");
            return (Criteria) this;
        }

        public Criteria andWsNotBetween(String value1, String value2) {
            addCriterion("WS not between", value1, value2, "ws");
            return (Criteria) this;
        }

        public Criteria andRkbsIsNull() {
            addCriterion("RKBS is null");
            return (Criteria) this;
        }

        public Criteria andRkbsIsNotNull() {
            addCriterion("RKBS is not null");
            return (Criteria) this;
        }

        public Criteria andRkbsEqualTo(String value) {
            addCriterion("RKBS =", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsNotEqualTo(String value) {
            addCriterion("RKBS <>", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsGreaterThan(String value) {
            addCriterion("RKBS >", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsGreaterThanOrEqualTo(String value) {
            addCriterion("RKBS >=", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsLessThan(String value) {
            addCriterion("RKBS <", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsLessThanOrEqualTo(String value) {
            addCriterion("RKBS <=", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsLike(String value) {
            addCriterion("RKBS like", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsNotLike(String value) {
            addCriterion("RKBS not like", value, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsIn(List<String> values) {
            addCriterion("RKBS in", values, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsNotIn(List<String> values) {
            addCriterion("RKBS not in", values, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsBetween(String value1, String value2) {
            addCriterion("RKBS between", value1, value2, "rkbs");
            return (Criteria) this;
        }

        public Criteria andRkbsNotBetween(String value1, String value2) {
            addCriterion("RKBS not between", value1, value2, "rkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsIsNull() {
            addCriterion("WKBS is null");
            return (Criteria) this;
        }

        public Criteria andWkbsIsNotNull() {
            addCriterion("WKBS is not null");
            return (Criteria) this;
        }

        public Criteria andWkbsEqualTo(String value) {
            addCriterion("WKBS =", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsNotEqualTo(String value) {
            addCriterion("WKBS <>", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsGreaterThan(String value) {
            addCriterion("WKBS >", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsGreaterThanOrEqualTo(String value) {
            addCriterion("WKBS >=", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsLessThan(String value) {
            addCriterion("WKBS <", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsLessThanOrEqualTo(String value) {
            addCriterion("WKBS <=", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsLike(String value) {
            addCriterion("WKBS like", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsNotLike(String value) {
            addCriterion("WKBS not like", value, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsIn(List<String> values) {
            addCriterion("WKBS in", values, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsNotIn(List<String> values) {
            addCriterion("WKBS not in", values, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsBetween(String value1, String value2) {
            addCriterion("WKBS between", value1, value2, "wkbs");
            return (Criteria) this;
        }

        public Criteria andWkbsNotBetween(String value1, String value2) {
            addCriterion("WKBS not between", value1, value2, "wkbs");
            return (Criteria) this;
        }

        public Criteria andAwaitIsNull() {
            addCriterion("AWAIT is null");
            return (Criteria) this;
        }

        public Criteria andAwaitIsNotNull() {
            addCriterion("AWAIT is not null");
            return (Criteria) this;
        }

        public Criteria andAwaitEqualTo(String value) {
            addCriterion("AWAIT =", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotEqualTo(String value) {
            addCriterion("AWAIT <>", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitGreaterThan(String value) {
            addCriterion("AWAIT >", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitGreaterThanOrEqualTo(String value) {
            addCriterion("AWAIT >=", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitLessThan(String value) {
            addCriterion("AWAIT <", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitLessThanOrEqualTo(String value) {
            addCriterion("AWAIT <=", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitLike(String value) {
            addCriterion("AWAIT like", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotLike(String value) {
            addCriterion("AWAIT not like", value, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitIn(List<String> values) {
            addCriterion("AWAIT in", values, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotIn(List<String> values) {
            addCriterion("AWAIT not in", values, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitBetween(String value1, String value2) {
            addCriterion("AWAIT between", value1, value2, "await");
            return (Criteria) this;
        }

        public Criteria andAwaitNotBetween(String value1, String value2) {
            addCriterion("AWAIT not between", value1, value2, "await");
            return (Criteria) this;
        }

        public Criteria andAvgquszIsNull() {
            addCriterion("AVGQUSZ is null");
            return (Criteria) this;
        }

        public Criteria andAvgquszIsNotNull() {
            addCriterion("AVGQUSZ is not null");
            return (Criteria) this;
        }

        public Criteria andAvgquszEqualTo(String value) {
            addCriterion("AVGQUSZ =", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszNotEqualTo(String value) {
            addCriterion("AVGQUSZ <>", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszGreaterThan(String value) {
            addCriterion("AVGQUSZ >", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszGreaterThanOrEqualTo(String value) {
            addCriterion("AVGQUSZ >=", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszLessThan(String value) {
            addCriterion("AVGQUSZ <", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszLessThanOrEqualTo(String value) {
            addCriterion("AVGQUSZ <=", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszLike(String value) {
            addCriterion("AVGQUSZ like", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszNotLike(String value) {
            addCriterion("AVGQUSZ not like", value, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszIn(List<String> values) {
            addCriterion("AVGQUSZ in", values, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszNotIn(List<String> values) {
            addCriterion("AVGQUSZ not in", values, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszBetween(String value1, String value2) {
            addCriterion("AVGQUSZ between", value1, value2, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andAvgquszNotBetween(String value1, String value2) {
            addCriterion("AVGQUSZ not between", value1, value2, "avgqusz");
            return (Criteria) this;
        }

        public Criteria andUtilIsNull() {
            addCriterion("UTIL is null");
            return (Criteria) this;
        }

        public Criteria andUtilIsNotNull() {
            addCriterion("UTIL is not null");
            return (Criteria) this;
        }

        public Criteria andUtilEqualTo(String value) {
            addCriterion("UTIL =", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilNotEqualTo(String value) {
            addCriterion("UTIL <>", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilGreaterThan(String value) {
            addCriterion("UTIL >", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilGreaterThanOrEqualTo(String value) {
            addCriterion("UTIL >=", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilLessThan(String value) {
            addCriterion("UTIL <", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilLessThanOrEqualTo(String value) {
            addCriterion("UTIL <=", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilLike(String value) {
            addCriterion("UTIL like", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilNotLike(String value) {
            addCriterion("UTIL not like", value, "util");
            return (Criteria) this;
        }

        public Criteria andUtilIn(List<String> values) {
            addCriterion("UTIL in", values, "util");
            return (Criteria) this;
        }

        public Criteria andUtilNotIn(List<String> values) {
            addCriterion("UTIL not in", values, "util");
            return (Criteria) this;
        }

        public Criteria andUtilBetween(String value1, String value2) {
            addCriterion("UTIL between", value1, value2, "util");
            return (Criteria) this;
        }

        public Criteria andUtilNotBetween(String value1, String value2) {
            addCriterion("UTIL not between", value1, value2, "util");
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