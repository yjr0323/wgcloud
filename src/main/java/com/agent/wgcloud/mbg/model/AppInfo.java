package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class AppInfo implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String appPid;

    private Date createTime;

    private String appName;

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

    public String getAppPid() {
        return appPid;
    }

    public void setAppPid(String appPid) {
        this.appPid = appPid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
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
        sb.append(", appPid=").append(appPid);
        sb.append(", createTime=").append(createTime);
        sb.append(", appName=").append(appName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}