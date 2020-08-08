package com.myshop.domain.userentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myshop.commons.utils.BaseEntity;

public  class EmployeeEntity extends BaseEntity
{
    private Integer employeeId;

    private String employeeName;

    private String password;

    private String employeeType;

    private String sex;

    private String status;

    private String employeeEmail;

    private Integer employeePhotoId;

    private String employeeAddRess;

    private String remake;

    private String employeeMobilePhone;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
