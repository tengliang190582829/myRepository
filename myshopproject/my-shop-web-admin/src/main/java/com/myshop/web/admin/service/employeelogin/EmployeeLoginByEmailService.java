package com.myshop.web.admin.service.employeelogin;

import com.myshop.domain.userentity.EmployeeEntity;
import org.springframework.stereotype.Service;

public interface EmployeeLoginByEmailService
{
    /**
     * 通过员工邮箱进行登陆
     * */
    public EmployeeEntity EmployeeLoginByEmail (String email);
}
