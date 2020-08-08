package com.myshop.web.admin.controller.employeemanager;

import com.myshop.commons.utils.BaseResult;
import com.myshop.commons.utils.PageInfo;
import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.web.admin.service.employeelogin.EmployeeInfoDeleteServicer;
import com.myshop.web.admin.service.employeelogin.EmployeeQueryService;
import com.myshop.web.admin.service.employeequery.QueryEmployeeAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class EmployeeManagerController
{
    private static String MANAGER_PAGE = "employeesmanger";

    @Autowired
    private QueryEmployeeAllService queryEmployeeAllService;

    @Autowired
    private EmployeeQueryService employeeQueryService;

    @Autowired
    EmployeeInfoDeleteServicer employeeInfoDeleteServicer;

    /**
     * 跳转到员工列表
     * @return String
     * */
    @RequestMapping(value = "employeesmanger", method = RequestMethod.GET)
    public String gotoEmployeeManager (Model model)
    {
        //queryEmployee(model);
        return MANAGER_PAGE;
    }

    @RequestMapping(value = {"searchEmployeeInfo"}, method = RequestMethod.POST)
    public String searchEmployee(EmployeeEntity queryParams, Model model)
    {
        List<EmployeeEntity> employeeInfoList = employeeQueryService.selectEmployee(queryParams);
        if (CollectionUtils.isEmpty(employeeInfoList))
        {
            employeeInfoList = new ArrayList<EmployeeEntity>();
        }
        model.addAttribute("EmployeeInfoList", employeeInfoList);

        return MANAGER_PAGE;
    }

    /**
     * 分页查询员工数量
     * @param request 请求参数对象
     * @return 返回组装成Map<String, Object>类型结果
     * */
    @ResponseBody
    @RequestMapping(value = "employee/pages", method = RequestMethod.GET)
    public PageInfo<EmployeeEntity> getEmployeesListByPages (HttpServletRequest request, EmployeeEntity employeeEntity)
    {
        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        PageInfo<EmployeeEntity> pageInfo = queryEmployeeAllService.getEmployeesListByPages(strDraw, strStart, strLength, employeeEntity);

        return pageInfo;
    }

    /**
     * 查询操作员方法
     * @return List<EmployeePojo>
     * */
    private void queryEmployee(Model model)
    {
        List<EmployeeEntity> employeeInfoList = queryEmployeeAllService.queryEmployeeAll();

        if (CollectionUtils.isEmpty(employeeInfoList))
        {
            employeeInfoList = new ArrayList<EmployeeEntity>();
        }
        model.addAttribute("EmployeeInfoList", employeeInfoList);
    }

    @ResponseBody
    @RequestMapping(value = "deleteEmployee", method = RequestMethod.POST)
    public BaseResult deleteEmployee (String deleteEmployeeId)
    {
        BaseResult baseResult = new BaseResult();
        baseResult.setMessage("删除员工成功.");

        String[] employeeId = null;
        List<Integer> deleteEmployeeIdList = new ArrayList<Integer>();
        if (null != deleteEmployeeId && "" != deleteEmployeeId)
        {
            employeeId = deleteEmployeeId.split(",");
        }
        if (null != employeeId && employeeId.length > 0)
        {
            for (String id : employeeId)
            {
                deleteEmployeeIdList.add(Integer.parseInt(id));
            }
        }
        else
        {
            return BaseResult.fail(baseResult, "删除员工失败");
        }

        employeeInfoDeleteServicer.deleteEmployee(deleteEmployeeIdList);

        return BaseResult.success(baseResult, "删除员工成功");
    }
}
