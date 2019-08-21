package com.agent.wgcloud.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class AppState implements Serializable {
    private String id;

    private String appInfoId;

    private String cpuPer;

    private String memPer;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppInfoId() {
        return appInfoId;
    }

    public void setAppInfoId(String appInfoId) {
        this.appInfoId = appInfoId;
    }

    public String getCpuPer() {
        return cpuPer;
    }

    public void setCpuPer(String cpuPer) {
        this.cpuPer = cpuPer;
    }

    public String getMemPer() {
        return memPer;
    }

    public void setMemPer(String memPer) {
        this.memPer = memPer;
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
        sb.append(", appInfoId=").append(appInfoId);
        sb.append(", cpuPer=").append(cpuPer);
        sb.append(", memPer=").append(memPer);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}