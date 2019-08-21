package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class MsgInfo implements Serializable {
    private String id;

    private String acceptInfo;

    private String infoContent;

    private String msgTitle;

    private Date createTime;

    private String accountId;

    private String account;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcceptInfo() {
        return acceptInfo;
    }

    public void setAcceptInfo(String acceptInfo) {
        this.acceptInfo = acceptInfo;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", acceptInfo=").append(acceptInfo);
        sb.append(", infoContent=").append(infoContent);
        sb.append(", msgTitle=").append(msgTitle);
        sb.append(", createTime=").append(createTime);
        sb.append(", accountId=").append(accountId);
        sb.append(", account=").append(account);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}