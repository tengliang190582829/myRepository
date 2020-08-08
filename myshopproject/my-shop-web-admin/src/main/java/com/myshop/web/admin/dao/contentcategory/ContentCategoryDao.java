package com.myshop.web.admin.dao.contentcategory;

import com.myshop.domain.userentity.ContentCategporyEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentCategoryDao
{
    public List<ContentCategporyEntity> selectAllContenetCategory ();
}
