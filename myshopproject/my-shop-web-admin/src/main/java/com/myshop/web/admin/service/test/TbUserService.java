package com.myshop.web.admin.service.test;

import com.myshop.domain.userentity.TbUser;

import java.util.List;

public interface TbUserService {

    /**
     * 查询全部用户信息
     * @return
     */
    public List<TbUser> selectAll();

    /**
     * 插入员工信息
     * @return
     */
    public void insertEmployee(TbUser employee);

    /**
     * 通过员工Id查询员工信息
     * @return
     */
    public  List<TbUser> selectEmployeeByEmployeeId(Integer employeeId);

    /**
     * 通过员工Id查询员工信息
     * @return
     */
    public void updateEmployeeByEmployeeId (TbUser employee);

    /**
     * 通过员工名字查询员工信息
     * @return
     */
    public List<TbUser> selectEmpoloyeeByEmployeeName (String employeeName);

    /**
     * 通过员工Id删除员工
     * @return
     */
    public void deleteEmployeeByEmployeeId (Integer employeeId);

    /**
     * if条件查询
     * */
    public List<TbUser> selectEmployeeByEmployeeNameOrSex (TbUser employee);

    /**
     * choose条件查询
     * */
    public List<TbUser> selectEmployeeByEmployeeNameOrSex2 (TbUser employee);

    /**
     * foreach条件查询
     * */
    public List<TbUser> selectEmployeeByList (List<Integer> employeeId);

    /**
     * include条件查询
     * */
    public List<TbUser> selectEmpoloyeeByInclude (List<Integer> employeeId);
}