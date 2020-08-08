package com.myshop.web.admin.service.test;

import com.myshop.domain.userentity.TbUser;
import com.myshop.web.admin.dao.test.TbUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserDao tbUserDao;

    @Override
    public List<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }

    @Override
    public void insertEmployee(TbUser employee) {
        tbUserDao.insert(employee);
    }

    @Override
    public List<TbUser> selectEmployeeByEmployeeId(Integer employeeId) {
        return tbUserDao.selectEmployeeByEmployeeId(employeeId);
    }

    @Override
    public void updateEmployeeByEmployeeId(TbUser employee) {
        tbUserDao.updateEmployeeByEmployeeId(employee);
    }

    @Override
    public List<TbUser> selectEmpoloyeeByEmployeeName(String employeeName) {
        return tbUserDao.selectEmpoloyeeByEmployeeName(employeeName);
    }

    @Override
    public void deleteEmployeeByEmployeeId(Integer employeeId) {
        tbUserDao.deleteEmployeeByEmployeeId(employeeId);
    }


    @Override
    public List<TbUser> selectEmployeeByEmployeeNameOrSex(TbUser employee) {
        return tbUserDao.selectEmployeeByEmployeeNameOrSex(employee);
    }

    @Override
    public List<TbUser> selectEmployeeByEmployeeNameOrSex2(TbUser employee) {
        return tbUserDao.selectEmployeeByEmployeeNameOrSex2(employee);
    }

    @Override
    public List<TbUser> selectEmployeeByList(List<Integer> employeeId) {
        return tbUserDao.selectEmployeeByList(employeeId);
    }

    @Override
    public List<TbUser> selectEmpoloyeeByInclude(List<Integer> employeeId) {
        return tbUserDao.selectEmpoloyeeByInclude(employeeId);
    }

}