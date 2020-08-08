package com.myshop.domain.userentity;

import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable {

    private Integer employeeId;

    private String employeeName;

    private String employeeType;

    private String sex;

    private String status;

    private String employeeEmail;

    private Integer employeePhotoId;

    private String employeeAddRess;

    private String remake;

    private String employeeMobilePhone;

    private Date createTime;

    private Date modifyTime;

    private Date expiryTime;

    private Date effectiveTime;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Integer getEmployeePhotoId() {
        return employeePhotoId;
    }

    public void setEmployeePhotoId(Integer employeePhotoId) {
        this.employeePhotoId = employeePhotoId;
    }

    public String getEmployeeAddRess() {
        return employeeAddRess;
    }

    public void setEmployeeAddRess(String employeeAddRess) {
        this.employeeAddRess = employeeAddRess;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getEmployeeMobilePhone() {
        return employeeMobilePhone;
    }

    public void setEmployeeMobilePhone(String employeeMobilePhone) {
        this.employeeMobilePhone = employeeMobilePhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
}