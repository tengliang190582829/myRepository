package com.myshop.web.admin.controller.contentcategory;

import com.myshop.domain.userentity.ContentCategporyEntity;
import com.myshop.web.admin.service.contentcategory.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContentCategoryController
{
    private static String CONTENT_CATEGORY_PAGE = "content_category_list";
    @Autowired
    ContentCategoryService ContentCategoryService;

    /**
     * 内容管理界面
     * @param model 视图模型
     * @return CONTENT_CATEGORY_PAGE 界面
     * */
    @RequestMapping(value = "/contentCategoryManage", method = RequestMethod.GET)
    public String contentCategoryForm (Model model)
    {
        List<ContentCategporyEntity> contentCategporyInfo = ContentCategoryService.selectAllContentCategory();
        if (CollectionUtils.isEmpty(contentCategporyInfo))
        {
            contentCategporyInfo = new ArrayList<ContentCategporyEntity>();
        }
        model.addAttribute("ContentCategporyInfoList", contentCategporyInfo);
        return CONTENT_CATEGORY_PAGE;
    }

}
