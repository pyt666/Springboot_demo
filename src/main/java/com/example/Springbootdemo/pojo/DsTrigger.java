package com.example.Springbootdemo.pojo;

import java.io.Serializable;

public class DsTrigger implements Serializable {
    private Integer id;

    private Integer dsid;

    private Integer triggerid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }

    public Integer getTriggerid() {
        return triggerid;
    }

    public void setTriggerid(Integer triggerid) {
        this.triggerid = triggerid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dsid=").append(dsid);
        sb.append(", triggerid=").append(triggerid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}