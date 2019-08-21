package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class IntrusionInfo implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String passwdInfo;

    private String promisc;

    private Date createTime;

    private String lsmod;

    private String crontab;

    private String rpcinfo;

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

    public String getPasswdInfo() {
        return passwdInfo;
    }

    public void setPasswdInfo(String passwdInfo) {
        this.passwdInfo = passwdInfo;
    }

    public String getPromisc() {
        return promisc;
    }

    public void setPromisc(String promisc) {
        this.promisc = promisc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLsmod() {
        return lsmod;
    }

    public void setLsmod(String lsmod) {
        this.lsmod = lsmod;
    }

    public String getCrontab() {
        return crontab;
    }

    public void setCrontab(String crontab) {
        this.crontab = crontab;
    }

    public String getRpcinfo() {
        return rpcinfo;
    }

    public void setRpcinfo(String rpcinfo) {
        this.rpcinfo = rpcinfo;
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
        sb.append(", passwdInfo=").append(passwdInfo);
        sb.append(", promisc=").append(promisc);
        sb.append(", createTime=").append(createTime);
        sb.append(", lsmod=").append(lsmod);
        sb.append(", crontab=").append(crontab);
        sb.append(", rpcinfo=").append(rpcinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}