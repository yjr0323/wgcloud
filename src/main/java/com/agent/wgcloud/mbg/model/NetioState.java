package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class NetioState implements Serializable {
    private String id;

    private String accountId;

    private String account;

    private String hostName;

    private String rxpck;

    private String txpck;

    private String rxbyt;

    private String txbyt;

    private String rxcmp;

    private String txcmp;

    private String rxmcst;

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

    public String getRxpck() {
        return rxpck;
    }

    public void setRxpck(String rxpck) {
        this.rxpck = rxpck;
    }

    public String getTxpck() {
        return txpck;
    }

    public void setTxpck(String txpck) {
        this.txpck = txpck;
    }

    public String getRxbyt() {
        return rxbyt;
    }

    public void setRxbyt(String rxbyt) {
        this.rxbyt = rxbyt;
    }

    public String getTxbyt() {
        return txbyt;
    }

    public void setTxbyt(String txbyt) {
        this.txbyt = txbyt;
    }

    public String getRxcmp() {
        return rxcmp;
    }

    public void setRxcmp(String rxcmp) {
        this.rxcmp = rxcmp;
    }

    public String getTxcmp() {
        return txcmp;
    }

    public void setTxcmp(String txcmp) {
        this.txcmp = txcmp;
    }

    public String getRxmcst() {
        return rxmcst;
    }

    public void setRxmcst(String rxmcst) {
        this.rxmcst = rxmcst;
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
        sb.append(", rxpck=").append(rxpck);
        sb.append(", txpck=").append(txpck);
        sb.append(", rxbyt=").append(rxbyt);
        sb.append(", txbyt=").append(txbyt);
        sb.append(", rxcmp=").append(rxcmp);
        sb.append(", txcmp=").append(txcmp);
        sb.append(", rxmcst=").append(rxmcst);
        sb.append(", dateStr=").append(dateStr);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}