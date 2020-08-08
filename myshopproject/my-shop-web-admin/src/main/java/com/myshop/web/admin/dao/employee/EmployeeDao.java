package com.myshop.web.admin.dao.employee;

import com.myshop.domain.userentity.EmployeeEntity;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeDao
{
    public List<EmployeeEntity> selectEmployeeAll ();

    /**
     * 根据邮箱查询员工信息
     * */
    public EmployeeEntity selectEmployeeByEmail (String Email);

    /**
     * 根据id查询员工信息
     * */
    public EmployeeEntity selectEmployeeByEmployeeId (Integer EmployeeId);

    /**
     * 动态查询员工信息
     * */
    public List<EmployeeEntity> selectEmployeeInfo (EmployeeEntity employeeInfo);

    /**
     * 注册员工信息
     * */
    void insert(EmployeeEntity employeeInfo);

    /**
     * 更新员工信息
     * */
    void update (EmployeeEntity employeeInfo);

    /**
     * 删除员工信息
     * */
    void delete(List<Integer> deleteEmployeeIdList);

    List<EmployeeEntity> getEmployeesListByPages (Map<String , Object> requestMap);

    int getEmployeeCount (Map<String , Object> requestMap);
}
