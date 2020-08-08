package com.my.shop.web.admin.service.test;

import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.domain.userentity.TbUser;
import com.myshop.web.admin.dao.employee.EmployeeDao;
import com.myshop.web.admin.dao.test.TbUserDao;
import com.myshop.web.admin.service.employeelogin.EmployeeLoginByEmailService;
import com.myshop.web.admin.service.employeequery.QueryEmployeeAllService;
import com.myshop.web.admin.service.test.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserDao tbUserDao;

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private EmployeeLoginByEmailService employeeLoginByEmailService;


    @Autowired
    private QueryEmployeeAllService queryEmployeeAllService;
    /**
     * 查询数据
     */
   // @Test
    //public void testSelectAll() {
     //   List<TbUser> tbUsers = tbUserDao.selectAll();
    //    for (TbUser tbUser : tbUsers) {
     //       System.out.println("单元册测试 mybatis : " + tbUser.getCreateTime());
    //    }
   // }

    /**
     * 插入数据
     */
   //  @Test
   // public void testInsert() {
    //    TbUser tbUser = new TbUser();
    //    tbUser.setEmployeeId(Integer.parseInt("1002"));
    //    tbUser.setEmployeeName("小明");
    //    tbUser.setEmployeeType("0");
    //    tbUser.setEmployeeEmail("5965989@qq.com");
    //    tbUser.setEmployeeAddRess("湖南省");
    //    tbUser.setEmployeeMobilePhone("4654154");
    //    tbUser.setEmployeePhotoId(Integer.parseInt("1324574"));
    //    tbUser.setSex("男");
    //    tbUser.setStatus("1");
    //    tbUser.setRemake("普通员工");

    //    tbUserService.insertEmployee(tbUser);
    //}

    /**
     * 条件查询数据
     */
    //@Test
    //public void testSelectEmployeeByEmployeeId ()
    //{
    //    Integer employeeId = Integer.parseInt("1001");
    //    List<TbUser> employeeInfoList = tbUserService.selectEmployeeByEmployeeId(employeeId);
    //    for (TbUser employee : employeeInfoLiist)
    //    {
    //        System.out.println("单元册测试 mybatis : " + employee.getEmployeeName());
    //    }
    //}

    /**
     * 更新数据
     */
    //@Test
    //public void testUpdayeEmployeeByEmployeeId () {
    //    TbUser employee = new TbUser();
    //    employee.setEmployeeName("余小C");
    //    employee.setEmployeeMobilePhone("12345");
    //    employee.setEmployeeId(Integer.parseInt("1000"));
    //    tbUserDao.updateEmployeeByEmployeeId(employee);
    //}

    /**
     * 更新数据
     */
    // @Test
    //public void testSelectEmployeeByEmployeeName ()
    //{
    //    List<TbUser> employeeInfoList = tbUserService.selectEmpoloyeeByEmployeeName("小C");
    //    for (TbUser employee : employeeInfoList)
    //    {
    //        System.out.println("单元册测试 mybatis : " + employee.getEmployeeName());
    //    }
    // }

    /**
     * 删除数据
     */
    //@Test
    //public void testDeleteEmplpyeeByEmployeeId ()
    //{
    //    tbUserService.deleteEmployeeByEmployeeId(Integer.parseInt("1002"));
    //}

    /**
     * if条件查询
     * */
    //@Test
    //public void testSelectEmployeeBYEmployeeNameOrSex ()
    //{
    //   TbUser employee = new TbUser();
    //    employee.setEmployeeName("余小C");//   List<TbUser> employeeInfoList = tbUserService.selectEmployeeByEmployeeNameOrSex(employee);//   for (TbUser employees : employeeInfoList)
    //    {
    //        System.out.println("单元册测试 mybatis : " + employees.getEmployeeName());
    //    }
    //}

    /**
     * if条件查询
     * */
    //@Test
    //public void testSelectEmployeeBYEmployeeNameOrSex2 ()
    //{
    //   TbUser employee = new TbUser();
    //   employee.setEmployeeName("余小C");
    //   List<TbUser> employeeInfoList = tbUserService.selectEmployeeByEmployeeNameOrSex2(employee);
    //   for (TbUser employees : employeeInfoList)
    //   {
    //        System.out.println("单元册测试 mybatis : " + employees.getEmployeeName());
    //   }
    //}

    /**
     * foreach条件查询
     * */
    //@Test
    //public void testSelectEmployeeByList ()
    //{
    //    List<Integer> employeeIdList = new ArrayList<Integer>();
    //    employeeIdList.add(Integer.parseInt("1000"));
    //   employeeIdList.add(Integer.parseInt("1001"));
    //   List<TbUser> employeeInfoList = tbUserService.selectEmployeeByList(employeeIdList);
    //   for (TbUser employees : employeeInfoList)
    //    {
    //        System.out.println("单元册测试 mybatis : " + employees.getEmployeeName());
    //    }
    //}

    /**
     * include条件查询
     * */
    //@Test
    //public void testSelectEmpoloyeeByInclude ()
    //{
    //    List<Integer> employeeIdList = new ArrayList<Integer>();
    //    employeeIdList.add(Integer.parseInt("1000"));
    //    employeeIdList.add(Integer.parseInt("1001"));
    //    List<TbUser> employeeInfoList = tbUserService.selectEmpoloyeeByInclude(employeeIdList);
    //    for (TbUser employees : employeeInfoList)
    //    {
    //        System.out.println("单元册测试 mybatis : " + employees.getEmployeeName());
    //    }
    //}

    @Test
    public void testMethods ()
    {
        // 定义一个数组
        String[] array = {
                "尼尔机械纪元",
                "关于我转生成为史莱姆这件事",
                "实力至上主义教师",
                "地狱少女"
        };

        // 转换成集合
        List<String> acgs = Arrays.asList(array);

        // 传统的遍历方式
        System.out.println("传统的遍历方式：");
        for (String acg : acgs) {
            System.out.println(acg);
        }
        System.out.println();

        // 使用 Lambda 表达式以及函数操作(functional operation)
        System.out.println("Lambda 表达式以及函数操作：");
        acgs.forEach((acg) -> System.out.println(acg));
        System.out.println();

        System.out.println("Stream 去重复：");

        // 定义一个数组
        String[] array2 = {
                "尼尔机械纪元",
                "尼尔机械纪元",
                "关于我转生成为史莱姆这件事",
                "关于我转生成为史莱姆这件事",
                "实力至上主义教师",
                "实力至上主义教师",
                "地狱少女",
                "地狱少女"
        };

        // 转换成集合
        List<String> acgs2 = Arrays.asList(array2);

        // Stream 去重复
        acgs2.stream().distinct().collect(Collectors.toList());

        // 打印
        acgs2.forEach(System.out::println);


        String[] strArr = { "abc", "cd", "abce", "a" };
        Arrays.sort(strArr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        List tt5 = Arrays.asList(strArr);
        tt5.forEach(System.out::println);
        Instant now = Instant.now();


    }
}