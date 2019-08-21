package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CpuState implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String user;

    private String sys;

    private String idle;

    private String iowait;

    private String irq;

    private String soft;

    private String dateStr;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getIdle() {
        return idle;
    }

    public void setIdle(String idle) {
        this.idle = idle;
    }

    public String getIowait() {
        return iowait;
    }

    public void setIowait(String iowait) {
        this.iowait = iowait;
    }

    public String getIrq() {
        return irq;
    }

    public void setIrq(String irq) {
        this.irq = irq;
    }

    public String getSoft() {
        return soft;
    }

    public void setSoft(String soft) {
        this.soft = soft;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountId=").append(accountId);
        sb.append(", account=").append(account);
        sb.append(", hostName=").append(hostName);
        sb.append(", user=").append(user);
        sb.append(", sys=").append(sys);
        sb.append(", idle=").append(idle);
        sb.append(", iowait=").append(iowait);
        sb.append(", irq=").append(irq);
        sb.append(", soft=").append(soft);
        sb.append(", dateStr=").append(dateStr);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}