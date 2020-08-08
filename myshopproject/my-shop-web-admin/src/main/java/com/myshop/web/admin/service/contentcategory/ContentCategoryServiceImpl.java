package com.myshop.web.admin.service.contentcategory;

import com.myshop.domain.userentity.ContentCategporyEntity;
import com.myshop.web.admin.dao.contentcategory.ContentCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService
{
    @Autowired
    ContentCategoryDao contentCategoryDao;
    @Override
    public List<ContentCategporyEntity> selectAllContentCategory()
    {
        return contentCategoryDao.selectAllContenetCategory();
    }
}
