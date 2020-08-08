package com.myshop.web.admin.controller.employeemanager;

import com.myshop.commons.utils.BaseResult;
import com.myshop.domain.userentity.EmployeeEntity;
import com.myshop.web.admin.service.employeeinfosave.EmployeeInfoSaveService;
import com.myshop.web.admin.service.employeelogin.EmployeeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeeRegisterController
{
    private static String EMPLOYEE_FORM_PAGE = "employeeform";

    @Autowired
    private EmployeeInfoSaveService employeeInfoSaveService;

    @Autowired
    private EmployeeQueryService employeeQueryService;

    @ModelAttribute
    public EmployeeEntity getEmployeeModel (@RequestParam(required = false) Integer employeeId)
    {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        if (employeeId != null)
        {
            return employeeQueryService.selectEmployeeByEmployeeId(employeeId);
        }
        else
        {
            return employeeEntity;
        }
    }
    /**
     * 跳转到员工详细信息表单
     * @return String
     * */
    @RequestMapping(value = "employeesregister", method = RequestMethod.GET)
    public String gotoEmployeeRegister ()
    {
        return EMPLOYEE_FORM_PAGE;
    }

    /**
     * 保存员工详细信息界面
     * @return String
     * */
    @RequestMapping(value = "saveEmployeeInfo", method = RequestMethod.POST)
    public String saveEmployeeInfo (EmployeeEntity employeeInfo, RedirectAttributes redirectAttributes, Model model)
    {
        BaseResult baseResult = employeeInfoSaveService.saveEmployeeInfo(employeeInfo);
        String message = baseResult.getMessage();
        int status = baseResult.getStatus();

        if (status == 200)
        {
            redirectAttributes.addFlashAttribute("baseResult", message);
            return "redirect:/employeesmanger"; // 重定向
        }
        else
        {
            model.addAttribute("baseResult", message);
            return EMPLOYEE_FORM_PAGE;
        }
    }
}
