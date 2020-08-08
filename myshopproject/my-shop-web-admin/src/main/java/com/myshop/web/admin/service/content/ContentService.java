package com.myshop.web.admin.service.content;

import com.myshop.commons.utils.PageInfo;
import com.myshop.domain.userentity.ContentEntity;

public interface ContentService {
    public PageInfo<ContentEntity> getContentListByPages(String strDraw, String strStart, String strLength, ContentEntity contentEntity);
}
