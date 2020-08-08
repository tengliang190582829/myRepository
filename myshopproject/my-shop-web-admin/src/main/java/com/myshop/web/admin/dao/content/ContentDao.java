package com.myshop.web.admin.dao.content;

import com.myshop.domain.userentity.ContentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ContentDao {
    public List<ContentEntity> selectContentColumnsAll();

    public int selectContentCount(Map<String, Object> requestMap);
}
