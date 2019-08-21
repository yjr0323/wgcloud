package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SystemInfo implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String version;

    private String versionDetail;

    private String cpuNum;

    private String yxDays;

    private String cpuCoreNum;

    private Date createTime;

    private String cpuXh;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionDetail() {
        return versionDetail;
    }

    public void setVersionDetail(String versionDetail) {
        this.versionDetail = versionDetail;
    }

    public String getCpuNum() {
        return cpuNum;
    }

    public void setCpuNum(String cpuNum) {
        this.cpuNum = cpuNum;
    }

    public String getYxDays() {
        return yxDays;
    }

    public void setYxDays(String yxDays) {
        this.yxDays = yxDays;
    }

    public String getCpuCoreNum() {
        return cpuCoreNum;
    }

    public void setCpuCoreNum(String cpuCoreNum) {
        this.cpuCoreNum = cpuCoreNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCpuXh() {
        return cpuXh;
    }

    public void setCpuXh(String cpuXh) {
        this.cpuXh = cpuXh;
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
        sb.append(", version=").append(version);
        sb.append(", versionDetail=").append(versionDetail);
        sb.append(", cpuNum=").append(cpuNum);
        sb.append(", yxDays=").append(yxDays);
        sb.append(", cpuCoreNum=").append(cpuCoreNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", cpuXh=").append(cpuXh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}