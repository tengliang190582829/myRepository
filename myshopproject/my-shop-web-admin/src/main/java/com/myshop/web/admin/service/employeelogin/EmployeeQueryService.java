package com.myshop.web.admin.service.employeelogin;

import com.myshop.domain.userentity.EmployeeEntity;

import java.util.List;

public interface EmployeeQueryService
{
    /**
     * 通过员工Id查询员工信息
     * */
    public EmployeeEntity selectEmployeeByEmployeeId (Integer employeeId);

    /**
     * 动态查询员工信息
     * */
    public List<EmployeeEntity> selectEmployee (EmployeeEntity searchEmployeeParams);
}
