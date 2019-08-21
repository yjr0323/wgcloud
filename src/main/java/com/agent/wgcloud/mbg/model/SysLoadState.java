package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SysLoadState implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String oneLoad;

    private String fiveLoad;

    private String fifteenLoad;

    private String users;

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

    public String getOneLoad() {
        return oneLoad;
    }

    public void setOneLoad(String oneLoad) {
        this.oneLoad = oneLoad;
    }

    public String getFiveLoad() {
        return fiveLoad;
    }

    public void setFiveLoad(String fiveLoad) {
        this.fiveLoad = fiveLoad;
    }

    public String getFifteenLoad() {
        return fifteenLoad;
    }

    public void setFifteenLoad(String fifteenLoad) {
        this.fifteenLoad = fifteenLoad;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
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
        sb.append(", oneLoad=").append(oneLoad);
        sb.append(", fiveLoad=").append(fiveLoad);
        sb.append(", fifteenLoad=").append(fifteenLoad);
        sb.append(", users=").append(users);
        sb.append(", dateStr=").append(dateStr);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}