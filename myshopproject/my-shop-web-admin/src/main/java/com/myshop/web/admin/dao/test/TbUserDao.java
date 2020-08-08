package com.myshop.web.admin.dao.test;

import com.myshop.domain.userentity.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserDao {

    /**
     * 查询员工信息
     * @return
     */

    public List<TbUser> selectAll();

    /**
     * 插入员工信息
     * @return
     */
    public void insert(TbUser employee);

    /**
     * 通过员工Id查询员工信息
     * @return
     */
    public List<TbUser> selectEmployeeByEmployeeId(Integer employeeId);

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