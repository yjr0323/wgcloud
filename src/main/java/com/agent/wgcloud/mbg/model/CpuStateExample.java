package com.agent.wgcloud.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpuStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpuStateExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("USER =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("USER <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("USER >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("USER <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("USER like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("USER not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("USER in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("USER not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andSysIsNull() {
            addCriterion("SYS is null");
            return (Criteria) this;
        }

        public Criteria andSysIsNotNull() {
            addCriterion("SYS is not null");
            return (Criteria) this;
        }

        public Criteria andSysEqualTo(String value) {
            addCriterion("SYS =", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotEqualTo(String value) {
            addCriterion("SYS <>", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysGreaterThan(String value) {
            addCriterion("SYS >", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysGreaterThanOrEqualTo(String value) {
            addCriterion("SYS >=", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLessThan(String value) {
            addCriterion("SYS <", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLessThanOrEqualTo(String value) {
            addCriterion("SYS <=", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLike(String value) {
            addCriterion("SYS like", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotLike(String value) {
            addCriterion("SYS not like", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysIn(List<String> values) {
            addCriterion("SYS in", values, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotIn(List<String> values) {
            addCriterion("SYS not in", values, "sys");
            return (Criteria) this;
        }

        public Criteria andSysBetween(String value1, String value2) {
            addCriterion("SYS between", value1, value2, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotBetween(String value1, String value2) {
            addCriterion("SYS not between", value1, value2, "sys");
            return (Criteria) this;
        }

        public Criteria andIdleIsNull() {
            addCriterion("IDLE is null");
            return (Criteria) this;
        }

        public Criteria andIdleIsNotNull() {
            addCriterion("IDLE is not null");
            return (Criteria) this;
        }

        public Criteria andIdleEqualTo(String value) {
            addCriterion("IDLE =", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleNotEqualTo(String value) {
            addCriterion("IDLE <>", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleGreaterThan(String value) {
            addCriterion("IDLE >", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleGreaterThanOrEqualTo(String value) {
            addCriterion("IDLE >=", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleLessThan(String value) {
            addCriterion("IDLE <", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleLessThanOrEqualTo(String value) {
            addCriterion("IDLE <=", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleLike(String value) {
            addCriterion("IDLE like", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleNotLike(String value) {
            addCriterion("IDLE not like", value, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleIn(List<String> values) {
            addCriterion("IDLE in", values, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleNotIn(List<String> values) {
            addCriterion("IDLE not in", values, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleBetween(String value1, String value2) {
            addCriterion("IDLE between", value1, value2, "idle");
            return (Criteria) this;
        }

        public Criteria andIdleNotBetween(String value1, String value2) {
            addCriterion("IDLE not between", value1, value2, "idle");
            return (Criteria) this;
        }

        public Criteria andIowaitIsNull() {
            addCriterion("IOWAIT is null");
            return (Criteria) this;
        }

        public Criteria andIowaitIsNotNull() {
            addCriterion("IOWAIT is not null");
            return (Criteria) this;
        }

        public Criteria andIowaitEqualTo(String value) {
            addCriterion("IOWAIT =", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitNotEqualTo(String value) {
            addCriterion("IOWAIT <>", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitGreaterThan(String value) {
            addCriterion("IOWAIT >", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitGreaterThanOrEqualTo(String value) {
            addCriterion("IOWAIT >=", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitLessThan(String value) {
            addCriterion("IOWAIT <", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitLessThanOrEqualTo(String value) {
            addCriterion("IOWAIT <=", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitLike(String value) {
            addCriterion("IOWAIT like", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitNotLike(String value) {
            addCriterion("IOWAIT not like", value, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitIn(List<String> values) {
            addCriterion("IOWAIT in", values, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitNotIn(List<String> values) {
            addCriterion("IOWAIT not in", values, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitBetween(String value1, String value2) {
            addCriterion("IOWAIT between", value1, value2, "iowait");
            return (Criteria) this;
        }

        public Criteria andIowaitNotBetween(String value1, String value2) {
            addCriterion("IOWAIT not between", value1, value2, "iowait");
            return (Criteria) this;
        }

        public Criteria andIrqIsNull() {
            addCriterion("IRQ is null");
            return (Criteria) this;
        }

        public Criteria andIrqIsNotNull() {
            addCriterion("IRQ is not null");
            return (Criteria) this;
        }

        public Criteria andIrqEqualTo(String value) {
            addCriterion("IRQ =", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqNotEqualTo(String value) {
            addCriterion("IRQ <>", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqGreaterThan(String value) {
            addCriterion("IRQ >", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqGreaterThanOrEqualTo(String value) {
            addCriterion("IRQ >=", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqLessThan(String value) {
            addCriterion("IRQ <", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqLessThanOrEqualTo(String value) {
            addCriterion("IRQ <=", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqLike(String value) {
            addCriterion("IRQ like", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqNotLike(String value) {
            addCriterion("IRQ not like", value, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqIn(List<String> values) {
            addCriterion("IRQ in", values, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqNotIn(List<String> values) {
            addCriterion("IRQ not in", values, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqBetween(String value1, String value2) {
            addCriterion("IRQ between", value1, value2, "irq");
            return (Criteria) this;
        }

        public Criteria andIrqNotBetween(String value1, String value2) {
            addCriterion("IRQ not between", value1, value2, "irq");
            return (Criteria) this;
        }

        public Criteria andSoftIsNull() {
            addCriterion("SOFT is null");
            return (Criteria) this;
        }

        public Criteria andSoftIsNotNull() {
            addCriterion("SOFT is not null");
            return (Criteria) this;
        }

        public Criteria andSoftEqualTo(String value) {
            addCriterion("SOFT =", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotEqualTo(String value) {
            addCriterion("SOFT <>", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftGreaterThan(String value) {
            addCriterion("SOFT >", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftGreaterThanOrEqualTo(String value) {
            addCriterion("SOFT >=", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftLessThan(String value) {
            addCriterion("SOFT <", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftLessThanOrEqualTo(String value) {
            addCriterion("SOFT <=", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftLike(String value) {
            addCriterion("SOFT like", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotLike(String value) {
            addCriterion("SOFT not like", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftIn(List<String> values) {
            addCriterion("SOFT in", values, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotIn(List<String> values) {
            addCriterion("SOFT not in", values, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftBetween(String value1, String value2) {
            addCriterion("SOFT between", value1, value2, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotBetween(String value1, String value2) {
            addCriterion("SOFT not between", value1, value2, "soft");
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