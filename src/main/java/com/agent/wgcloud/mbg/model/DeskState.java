package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class DeskState implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String fileStstem;

    private String size;

    private String used;

    private String avail;

    private String usePer;

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

    public String getFileStstem() {
        return fileStstem;
    }

    public void setFileStstem(String fileStstem) {
        this.fileStstem = fileStstem;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

    public String getUsePer() {
        return usePer;
    }

    public void setUsePer(String usePer) {
        this.usePer = usePer;
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
        sb.append(", fileStstem=").append(fileStstem);
        sb.append(", size=").append(size);
        sb.append(", used=").append(used);
        sb.append(", avail=").append(avail);
        sb.append(", usePer=").append(usePer);
        sb.append(", dateStr=").append(dateStr);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}