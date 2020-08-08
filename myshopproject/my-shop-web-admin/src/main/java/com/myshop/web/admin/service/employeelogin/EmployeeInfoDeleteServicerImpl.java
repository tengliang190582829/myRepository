package com.myshop.web.admin.service.employeelogin;

import com.myshop.web.admin.dao.employee.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInfoDeleteServicerImpl implements EmployeeInfoDeleteServicer
{
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void deleteEmployee(List<Integer> deleteEmployeeIdList)
    {
        employeeDao.delete(deleteEmployeeIdList);

    }
}
