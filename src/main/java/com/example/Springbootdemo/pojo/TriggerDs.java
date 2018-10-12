package com.example.Springbootdemo.pojo;

import java.io.Serializable;

public class TriggerDs implements Serializable {
    private Integer id;

    private String triggerDscol;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTriggerDscol() {
        return triggerDscol;
    }

    public void setTriggerDscol(String triggerDscol) {
        this.triggerDscol = triggerDscol == null ? null : triggerDscol.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", triggerDscol=").append(triggerDscol);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}