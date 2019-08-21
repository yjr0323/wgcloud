package com.agent.wgcloud.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppStateExample() {
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

        public Criteria andAppInfoIdIsNull() {
            addCriterion("APP_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdIsNotNull() {
            addCriterion("APP_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdEqualTo(String value) {
            addCriterion("APP_INFO_ID =", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdNotEqualTo(String value) {
            addCriterion("APP_INFO_ID <>", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdGreaterThan(String value) {
            addCriterion("APP_INFO_ID >", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("APP_INFO_ID >=", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdLessThan(String value) {
            addCriterion("APP_INFO_ID <", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdLessThanOrEqualTo(String value) {
            addCriterion("APP_INFO_ID <=", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdLike(String value) {
            addCriterion("APP_INFO_ID like", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdNotLike(String value) {
            addCriterion("APP_INFO_ID not like", value, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdIn(List<String> values) {
            addCriterion("APP_INFO_ID in", values, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdNotIn(List<String> values) {
            addCriterion("APP_INFO_ID not in", values, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdBetween(String value1, String value2) {
            addCriterion("APP_INFO_ID between", value1, value2, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andAppInfoIdNotBetween(String value1, String value2) {
            addCriterion("APP_INFO_ID not between", value1, value2, "appInfoId");
            return (Criteria) this;
        }

        public Criteria andCpuPerIsNull() {
            addCriterion("CPU_PER is null");
            return (Criteria) this;
        }

        public Criteria andCpuPerIsNotNull() {
            addCriterion("CPU_PER is not null");
            return (Criteria) this;
        }

        public Criteria andCpuPerEqualTo(String value) {
            addCriterion("CPU_PER =", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerNotEqualTo(String value) {
            addCriterion("CPU_PER <>", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerGreaterThan(String value) {
            addCriterion("CPU_PER >", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerGreaterThanOrEqualTo(String value) {
            addCriterion("CPU_PER >=", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerLessThan(String value) {
            addCriterion("CPU_PER <", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerLessThanOrEqualTo(String value) {
            addCriterion("CPU_PER <=", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerLike(String value) {
            addCriterion("CPU_PER like", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerNotLike(String value) {
            addCriterion("CPU_PER not like", value, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerIn(List<String> values) {
            addCriterion("CPU_PER in", values, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerNotIn(List<String> values) {
            addCriterion("CPU_PER not in", values, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerBetween(String value1, String value2) {
            addCriterion("CPU_PER between", value1, value2, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andCpuPerNotBetween(String value1, String value2) {
            addCriterion("CPU_PER not between", value1, value2, "cpuPer");
            return (Criteria) this;
        }

        public Criteria andMemPerIsNull() {
            addCriterion("MEM_PER is null");
            return (Criteria) this;
        }

        public Criteria andMemPerIsNotNull() {
            addCriterion("MEM_PER is not null");
            return (Criteria) this;
        }

        public Criteria andMemPerEqualTo(String value) {
            addCriterion("MEM_PER =", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerNotEqualTo(String value) {
            addCriterion("MEM_PER <>", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerGreaterThan(String value) {
            addCriterion("MEM_PER >", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_PER >=", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerLessThan(String value) {
            addCriterion("MEM_PER <", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerLessThanOrEqualTo(String value) {
            addCriterion("MEM_PER <=", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerLike(String value) {
            addCriterion("MEM_PER like", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerNotLike(String value) {
            addCriterion("MEM_PER not like", value, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerIn(List<String> values) {
            addCriterion("MEM_PER in", values, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerNotIn(List<String> values) {
            addCriterion("MEM_PER not in", values, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerBetween(String value1, String value2) {
            addCriterion("MEM_PER between", value1, value2, "memPer");
            return (Criteria) this;
        }

        public Criteria andMemPerNotBetween(String value1, String value2) {
            addCriterion("MEM_PER not between", value1, value2, "memPer");
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