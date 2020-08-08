package com.myshop.web.admin.service.employeelogin;

import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.web.admin.dao.employee.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeLoginByEmailServiceImpl implements EmployeeLoginByEmailService
{
    public static final Logger logger = LoggerFactory.getLogger(EmployeeLoginByEmailServiceImpl.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public EmployeeEntity EmployeeLoginByEmail(String email)
    {
        logger.debug("EmployeeLoginByEmailServiceImpl EmployeeLoginByEmail is start.");

        EmployeeEntity employeeInfo = employeeDao.selectEmployeeByEmail(email);

        logger.debug("EmployeeLoginByEmailServiceImpl EmployeeLoginByEmail is end.");

        return employeeInfo;
    }
}
