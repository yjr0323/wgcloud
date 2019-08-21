package com.agent.wgcloud.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemInfoExample() {
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionDetailIsNull() {
            addCriterion("VERSION_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andVersionDetailIsNotNull() {
            addCriterion("VERSION_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andVersionDetailEqualTo(String value) {
            addCriterion("VERSION_DETAIL =", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailNotEqualTo(String value) {
            addCriterion("VERSION_DETAIL <>", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailGreaterThan(String value) {
            addCriterion("VERSION_DETAIL >", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION_DETAIL >=", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailLessThan(String value) {
            addCriterion("VERSION_DETAIL <", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailLessThanOrEqualTo(String value) {
            addCriterion("VERSION_DETAIL <=", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailLike(String value) {
            addCriterion("VERSION_DETAIL like", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailNotLike(String value) {
            addCriterion("VERSION_DETAIL not like", value, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailIn(List<String> values) {
            addCriterion("VERSION_DETAIL in", values, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailNotIn(List<String> values) {
            addCriterion("VERSION_DETAIL not in", values, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailBetween(String value1, String value2) {
            addCriterion("VERSION_DETAIL between", value1, value2, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andVersionDetailNotBetween(String value1, String value2) {
            addCriterion("VERSION_DETAIL not between", value1, value2, "versionDetail");
            return (Criteria) this;
        }

        public Criteria andCpuNumIsNull() {
            addCriterion("CPU_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCpuNumIsNotNull() {
            addCriterion("CPU_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCpuNumEqualTo(String value) {
            addCriterion("CPU_NUM =", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotEqualTo(String value) {
            addCriterion("CPU_NUM <>", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumGreaterThan(String value) {
            addCriterion("CPU_NUM >", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumGreaterThanOrEqualTo(String value) {
            addCriterion("CPU_NUM >=", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumLessThan(String value) {
            addCriterion("CPU_NUM <", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumLessThanOrEqualTo(String value) {
            addCriterion("CPU_NUM <=", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumLike(String value) {
            addCriterion("CPU_NUM like", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotLike(String value) {
            addCriterion("CPU_NUM not like", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumIn(List<String> values) {
            addCriterion("CPU_NUM in", values, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotIn(List<String> values) {
            addCriterion("CPU_NUM not in", values, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumBetween(String value1, String value2) {
            addCriterion("CPU_NUM between", value1, value2, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotBetween(String value1, String value2) {
            addCriterion("CPU_NUM not between", value1, value2, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andYxDaysIsNull() {
            addCriterion("YX_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andYxDaysIsNotNull() {
            addCriterion("YX_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andYxDaysEqualTo(String value) {
            addCriterion("YX_DAYS =", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysNotEqualTo(String value) {
            addCriterion("YX_DAYS <>", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysGreaterThan(String value) {
            addCriterion("YX_DAYS >", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysGreaterThanOrEqualTo(String value) {
            addCriterion("YX_DAYS >=", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysLessThan(String value) {
            addCriterion("YX_DAYS <", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysLessThanOrEqualTo(String value) {
            addCriterion("YX_DAYS <=", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysLike(String value) {
            addCriterion("YX_DAYS like", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysNotLike(String value) {
            addCriterion("YX_DAYS not like", value, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysIn(List<String> values) {
            addCriterion("YX_DAYS in", values, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysNotIn(List<String> values) {
            addCriterion("YX_DAYS not in", values, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysBetween(String value1, String value2) {
            addCriterion("YX_DAYS between", value1, value2, "yxDays");
            return (Criteria) this;
        }

        public Criteria andYxDaysNotBetween(String value1, String value2) {
            addCriterion("YX_DAYS not between", value1, value2, "yxDays");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumIsNull() {
            addCriterion("CPU_CORE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumIsNotNull() {
            addCriterion("CPU_CORE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumEqualTo(String value) {
            addCriterion("CPU_CORE_NUM =", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumNotEqualTo(String value) {
            addCriterion("CPU_CORE_NUM <>", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumGreaterThan(String value) {
            addCriterion("CPU_CORE_NUM >", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumGreaterThanOrEqualTo(String value) {
            addCriterion("CPU_CORE_NUM >=", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumLessThan(String value) {
            addCriterion("CPU_CORE_NUM <", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumLessThanOrEqualTo(String value) {
            addCriterion("CPU_CORE_NUM <=", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumLike(String value) {
            addCriterion("CPU_CORE_NUM like", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumNotLike(String value) {
            addCriterion("CPU_CORE_NUM not like", value, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumIn(List<String> values) {
            addCriterion("CPU_CORE_NUM in", values, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumNotIn(List<String> values) {
            addCriterion("CPU_CORE_NUM not in", values, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumBetween(String value1, String value2) {
            addCriterion("CPU_CORE_NUM between", value1, value2, "cpuCoreNum");
            return (Criteria) this;
        }

        public Criteria andCpuCoreNumNotBetween(String value1, String value2) {
            addCriterion("CPU_CORE_NUM not between", value1, value2, "cpuCoreNum");
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

        public Criteria andCpuXhIsNull() {
            addCriterion("CPU_XH is null");
            return (Criteria) this;
        }

        public Criteria andCpuXhIsNotNull() {
            addCriterion("CPU_XH is not null");
            return (Criteria) this;
        }

        public Criteria andCpuXhEqualTo(String value) {
            addCriterion("CPU_XH =", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhNotEqualTo(String value) {
            addCriterion("CPU_XH <>", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhGreaterThan(String value) {
            addCriterion("CPU_XH >", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhGreaterThanOrEqualTo(String value) {
            addCriterion("CPU_XH >=", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhLessThan(String value) {
            addCriterion("CPU_XH <", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhLessThanOrEqualTo(String value) {
            addCriterion("CPU_XH <=", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhLike(String value) {
            addCriterion("CPU_XH like", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhNotLike(String value) {
            addCriterion("CPU_XH not like", value, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhIn(List<String> values) {
            addCriterion("CPU_XH in", values, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhNotIn(List<String> values) {
            addCriterion("CPU_XH not in", values, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhBetween(String value1, String value2) {
            addCriterion("CPU_XH between", value1, value2, "cpuXh");
            return (Criteria) this;
        }

        public Criteria andCpuXhNotBetween(String value1, String value2) {
            addCriterion("CPU_XH not between", value1, value2, "cpuXh");
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