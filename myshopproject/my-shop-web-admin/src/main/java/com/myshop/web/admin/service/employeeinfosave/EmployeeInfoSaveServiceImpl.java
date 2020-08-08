package com.myshop.web.admin.service.employeeinfosave;

import com.myshop.commons.utils.BaseResult;
import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.web.admin.dao.employee.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import java.util.Date;

@Service
public class EmployeeInfoSaveServiceImpl implements EmployeeInfoSaveService
{
    private static int SUCCESS_STATUS = 200;

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 员工信息保存
     * @param employeeInfo
     * @return BaseResult
     * */
    @Override
    public BaseResult saveEmployeeInfo(EmployeeEntity employeeInfo)
    {
        BaseResult baseResult = checkEmployeeFormInfo(employeeInfo);

        if (SUCCESS_STATUS != baseResult.getStatus())
        {
            return baseResult;
        }

        if (null == employeeInfo.getEmployeeId())
        {
            employeeInfo.setCreateTime(new Date());
            employeeInfo.setEffectiveTime(new Date());
            employeeInfo.setEmployeeId(Integer.parseInt("10096"));
            employeeInfo.setStatus("2");
            employeeInfo.setEmployeePhotoId(Integer.parseInt("110"));
            employeeDao.insert(employeeInfo);
        }
        else
        {
            employeeInfo.setModifyTime(new Date());
            employeeDao.update(employeeInfo);
        }

        return baseResult;
    }

    /**
     * 员工注册信息字段验证
     * @param employeeInfo
     * @return BaseResult
     * */
    private BaseResult checkEmployeeFormInfo (EmployeeEntity employeeInfo)
    {
        BaseResult baseResult = new BaseResult();
        baseResult.success(baseResult);

        if (null == employeeInfo)
        {
            return baseResult.fail(baseResult,"Inpout employee baseinfo empty, please inout employee baseinfo empty.");
        }
        if (employeeInfo.getEmployeeName() == null || "" == employeeInfo.getEmployeeName().trim())
        {
            return baseResult.fail(baseResult,"Inpout employee name is empty, please inout employee name.");
        }
        if (employeeInfo.getPassword() == null || "" == employeeInfo.getPassword().trim())
        {
            return baseResult.fail(baseResult,"Inpout employee password is empty, please inout employee password.");
        }
        return baseResult;
    }
}
