package com.myshop.web.admin.controller.content;

import com.myshop.commons.utils.PageInfo;
import com.myshop.domain.userentity.ContentEntity;
import com.myshop.web.admin.service.content.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ContentController {

    private static String CONTENT_MANAGE_POAGE = "content_list";

    @Autowired
    private ContentService contentService;

    /**
     *跳转到Content界面
     * */
    @RequestMapping(value = "/contentManage", method = RequestMethod.GET)
    public String toContentManagePage() {

        return CONTENT_MANAGE_POAGE;
    }

    @RequestMapping(value = "/content/pages", method = RequestMethod.GET)
    public PageInfo<ContentEntity> getContentByPages (HttpServletRequest request, ContentEntity contentEntity)
    {
        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        PageInfo<ContentEntity> pageInfo = contentService.getContentListByPages(strDraw, strStart, strLength, contentEntity);

        return null;
    }
}
