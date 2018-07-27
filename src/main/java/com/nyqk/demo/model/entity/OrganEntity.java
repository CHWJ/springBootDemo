package com.nyqk.demo.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrganEntity implements Serializable {
    private int oid;
    private String name;
    private int parentid;
    private String code;
    private String ancestors;
    private String operater;
    private LocalDateTime operatedate;
    private int state;
    private String lat;
    private String lon;
    private int organtype;
    private int organorder;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public LocalDateTime getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(LocalDateTime operatedate) {
        this.operatedate = operatedate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public int getOrgantype() {
        return organtype;
    }

    public void setOrgantype(int organtype) {
        this.organtype = organtype;
    }

    public int getOrganorder() {
        return organorder;
    }

    public void setOrganorder(int organorder) {
        this.organorder = organorder;
    }
}
