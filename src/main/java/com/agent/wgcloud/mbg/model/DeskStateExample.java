package com.agent.wgcloud.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeskStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeskStateExample() {
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

        public Criteria andFileStstemIsNull() {
            addCriterion("FILE_STSTEM is null");
            return (Criteria) this;
        }

        public Criteria andFileStstemIsNotNull() {
            addCriterion("FILE_STSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andFileStstemEqualTo(String value) {
            addCriterion("FILE_STSTEM =", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemNotEqualTo(String value) {
            addCriterion("FILE_STSTEM <>", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemGreaterThan(String value) {
            addCriterion("FILE_STSTEM >", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_STSTEM >=", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemLessThan(String value) {
            addCriterion("FILE_STSTEM <", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemLessThanOrEqualTo(String value) {
            addCriterion("FILE_STSTEM <=", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemLike(String value) {
            addCriterion("FILE_STSTEM like", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemNotLike(String value) {
            addCriterion("FILE_STSTEM not like", value, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemIn(List<String> values) {
            addCriterion("FILE_STSTEM in", values, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemNotIn(List<String> values) {
            addCriterion("FILE_STSTEM not in", values, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemBetween(String value1, String value2) {
            addCriterion("FILE_STSTEM between", value1, value2, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andFileStstemNotBetween(String value1, String value2) {
            addCriterion("FILE_STSTEM not between", value1, value2, "fileStstem");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("SIZE =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("SIZE <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("SIZE >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("SIZE >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("SIZE <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("SIZE <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("SIZE like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("SIZE not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("SIZE in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("SIZE not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("SIZE between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("SIZE not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("USED is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("USED is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(String value) {
            addCriterion("USED =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(String value) {
            addCriterion("USED <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(String value) {
            addCriterion("USED >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(String value) {
            addCriterion("USED >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(String value) {
            addCriterion("USED <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(String value) {
            addCriterion("USED <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLike(String value) {
            addCriterion("USED like", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotLike(String value) {
            addCriterion("USED not like", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<String> values) {
            addCriterion("USED in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<String> values) {
            addCriterion("USED not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(String value1, String value2) {
            addCriterion("USED between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(String value1, String value2) {
            addCriterion("USED not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andAvailIsNull() {
            addCriterion("AVAIL is null");
            return (Criteria) this;
        }

        public Criteria andAvailIsNotNull() {
            addCriterion("AVAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAvailEqualTo(String value) {
            addCriterion("AVAIL =", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailNotEqualTo(String value) {
            addCriterion("AVAIL <>", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailGreaterThan(String value) {
            addCriterion("AVAIL >", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailGreaterThanOrEqualTo(String value) {
            addCriterion("AVAIL >=", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailLessThan(String value) {
            addCriterion("AVAIL <", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailLessThanOrEqualTo(String value) {
            addCriterion("AVAIL <=", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailLike(String value) {
            addCriterion("AVAIL like", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailNotLike(String value) {
            addCriterion("AVAIL not like", value, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailIn(List<String> values) {
            addCriterion("AVAIL in", values, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailNotIn(List<String> values) {
            addCriterion("AVAIL not in", values, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailBetween(String value1, String value2) {
            addCriterion("AVAIL between", value1, value2, "avail");
            return (Criteria) this;
        }

        public Criteria andAvailNotBetween(String value1, String value2) {
            addCriterion("AVAIL not between", value1, value2, "avail");
            return (Criteria) this;
        }

        public Criteria andUsePerIsNull() {
            addCriterion("USE_PER is null");
            return (Criteria) this;
        }

        public Criteria andUsePerIsNotNull() {
            addCriterion("USE_PER is not null");
            return (Criteria) this;
        }

        public Criteria andUsePerEqualTo(String value) {
            addCriterion("USE_PER =", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerNotEqualTo(String value) {
            addCriterion("USE_PER <>", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerGreaterThan(String value) {
            addCriterion("USE_PER >", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerGreaterThanOrEqualTo(String value) {
            addCriterion("USE_PER >=", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerLessThan(String value) {
            addCriterion("USE_PER <", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerLessThanOrEqualTo(String value) {
            addCriterion("USE_PER <=", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerLike(String value) {
            addCriterion("USE_PER like", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerNotLike(String value) {
            addCriterion("USE_PER not like", value, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerIn(List<String> values) {
            addCriterion("USE_PER in", values, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerNotIn(List<String> values) {
            addCriterion("USE_PER not in", values, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerBetween(String value1, String value2) {
            addCriterion("USE_PER between", value1, value2, "usePer");
            return (Criteria) this;
        }

        public Criteria andUsePerNotBetween(String value1, String value2) {
            addCriterion("USE_PER not between", value1, value2, "usePer");
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