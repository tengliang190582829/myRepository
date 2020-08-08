package com.myshop.web.admin.service.employeequery;

import com.myshop.commons.utils.PageInfo;
import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.web.admin.dao.employee.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QueryEmployeeAllServiceImpl implements QueryEmployeeAllService
{
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private QueryEmployeeAllService queryEmployeeAllService;

    @Override
    public List<EmployeeEntity> queryEmployeeAll() {
        return employeeDao.selectEmployeeAll();
    }

    /**
     * 分页查询方法
     * @param strDraw 某条查询标识
     * @param strStart 查询的开始数
     * @param strLength 一页查询多少
     * @return PageInfo<T> 分页查询返回对象
     * */
    @Override
    public PageInfo<EmployeeEntity> getEmployeesListByPages (String strDraw, String strStart, String strLength, EmployeeEntity employeeEntity)
    {
        Map<String, Object> requestMap = buildByPageReqParams(strStart, strLength, employeeEntity);
        List<EmployeeEntity> employeeList = employeeDao.getEmployeesListByPages(requestMap);

        return buildByPageRespParams(employeeList, strDraw, employeeEntity);
    }

    /**
     * 组装分页查询参数
     * @param strStart 查询的开始数
     * @param strLength 一页查询多少
     * @return requestMap 分页查询参数对象
     * */
    private Map<String, Object> buildByPageReqParams (String strStart, String strLength,  EmployeeEntity employeeEntity)
    {
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 0 : Integer.parseInt(strLength);
        int end = start + length;

        Map<String, Object> requestMap = new HashMap<String, Object>();
        requestMap.put("start", start);
        requestMap.put("end", end);
        requestMap.put("employeeEntity", employeeEntity);
        return requestMap;
    }

    /**
     * 组装分页查询返回结果对象
     * @param employeeList 员工数量
     * @param strDraw 某条查询标识
     * @return respMap 返回结果对象
     * */
    private PageInfo<EmployeeEntity> buildByPageRespParams (List<EmployeeEntity> employeeList, String strDraw, EmployeeEntity employeeEntity)
    {
        PageInfo<EmployeeEntity> pageInfo = new PageInfo<EmployeeEntity>();

        Map<String, Object> requestMap = new HashMap<String, Object>();
        requestMap.put("employeeEntity", employeeEntity);

        int recordsTotal = employeeDao.getEmployeeCount(requestMap);
        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);

        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(recordsTotal);
        pageInfo.setRecordsFiltered(recordsTotal);
        pageInfo.setData(employeeList);
        pageInfo.setError("");

        return pageInfo;
    }
}
