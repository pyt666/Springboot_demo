package com.example.Springbootdemo.pojo;

import java.io.Serializable;
import java.util.Date;

public class Logs implements Serializable {
    private Integer id;

    private Integer deviceid;

    private String value;

    private Integer userid;

    private Date sendtime;

    private Date recivetime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getRecivetime() {
        return recivetime;
    }

    public void setRecivetime(Date recivetime) {
        this.recivetime = recivetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceid=").append(deviceid);
        sb.append(", value=").append(value);
        sb.append(", userid=").append(userid);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", recivetime=").append(recivetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}