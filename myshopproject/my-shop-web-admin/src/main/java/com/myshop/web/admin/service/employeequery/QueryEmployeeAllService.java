package com.myshop.web.admin.service.employeequery;

import com.myshop.commons.utils.PageInfo;
import com.myshop.domain.userentity.EmployeeEntity;

import java.util.List;
import java.util.Map;

public interface QueryEmployeeAllService
{
    public List<EmployeeEntity> queryEmployeeAll();

    public PageInfo<EmployeeEntity> getEmployeesListByPages (String strDraw, String strStart, String strLength, EmployeeEntity employeeEntity);
}
