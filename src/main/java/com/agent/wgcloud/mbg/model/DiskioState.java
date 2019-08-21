package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class DiskioState implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String rs;

    private String ws;

    private String rkbs;

    private String wkbs;

    private String await;

    private String avgqusz;

    private String util;

    private Date createTime;

    private String dateStr;

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

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getRkbs() {
        return rkbs;
    }

    public void setRkbs(String rkbs) {
        this.rkbs = rkbs;
    }

    public String getWkbs() {
        return wkbs;
    }

    public void setWkbs(String wkbs) {
        this.wkbs = wkbs;
    }

    public String getAwait() {
        return await;
    }

    public void setAwait(String await) {
        this.await = await;
    }

    public String getAvgqusz() {
        return avgqusz;
    }

    public void setAvgqusz(String avgqusz) {
        this.avgqusz = avgqusz;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
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
        sb.append(", rs=").append(rs);
        sb.append(", ws=").append(ws);
        sb.append(", rkbs=").append(rkbs);
        sb.append(", wkbs=").append(wkbs);
        sb.append(", await=").append(await);
        sb.append(", avgqusz=").append(avgqusz);
        sb.append(", util=").append(util);
        sb.append(", createTime=").append(createTime);
        sb.append(", dateStr=").append(dateStr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}