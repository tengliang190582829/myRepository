package com.myshop.web.admin.service.employeeinfosave;

import com.myshop.commons.utils.BaseResult;
import com.myshop.domain.userentity.EmployeeEntity;

public interface EmployeeInfoSaveService
{
    public BaseResult saveEmployeeInfo (EmployeeEntity employeeInfo);
}
