package com.myshop.web.admin.service.employeelogin;

        import com.myshop.domain.userentity.EmployeeEntity;
        import com.myshop.web.admin.dao.employee.EmployeeDao;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class EmployeeInfoQueryServiceImpl implements EmployeeQueryService
{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public EmployeeEntity selectEmployeeByEmployeeId(Integer employeeId) {
        return employeeDao.selectEmployeeByEmployeeId(employeeId);
    }

    @Override
    public List<EmployeeEntity> selectEmployee(EmployeeEntity searchEmployeeParams) {
        return employeeDao.selectEmployeeInfo(searchEmployeeParams);
    }
}
