package com.myshop.web.admin.service.content;

import com.myshop.commons.utils.PageInfo;
import com.myshop.domain.userentity.ContentEntity;
import com.myshop.web.admin.dao.content.ContentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContentServiceImpl implements ContentService{

    @Autowired
    public ContentDao contentDao;

    /**
     * 分页查询方法
     * @param strDraw 某条查询标识
     * @param strStart 查询的开始数
     * @param strLength 一页查询多少
     * @return PageInfo<T> 分页查询返回对象
     * */
    @Override
    public PageInfo<ContentEntity> getContentListByPages (String strDraw, String strStart, String strLength, ContentEntity contentEntity)
    {
        Map<String, Object> requestMap = buildByPageReqParams(strStart, strLength, contentEntity);
        List<ContentEntity> contentList = contentDao.selectContentColumnsAll();

        return buildByPageRespParams(contentList, strDraw, contentEntity);
    }

    /**
     * 组装分页查询参数
     * @param strStart 查询的开始数
     * @param strLength 一页查询多少
     * @return requestMap 分页查询参数对象
     * */
    private Map<String, Object> buildByPageReqParams (String strStart, String strLength,  ContentEntity contentEntity)
    {
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 0 : Integer.parseInt(strLength);
        int end = start + length;

        Map<String, Object> requestMap = new HashMap<String, Object>();
        requestMap.put("start", start);
        requestMap.put("end", end);
        requestMap.put("contentEntity", contentEntity);
        return requestMap;
    }

    /**
     * 组装分页查询返回结果对象
     * @param contentList 数量
     * @param strDraw 某条查询标识
     * @return respMap 返回结果对象
     * */
    private PageInfo<ContentEntity> buildByPageRespParams (List<ContentEntity> contentList, String strDraw, ContentEntity contentEntity)
    {
        PageInfo<ContentEntity> pageInfo = new PageInfo<ContentEntity>();

        Map<String, Object> requestMap = new HashMap<String, Object>();
        requestMap.put("contentEntity", contentEntity);

        int recordsTotal = contentDao.selectContentCount(requestMap);
        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);

        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(recordsTotal);
        pageInfo.setRecordsFiltered(recordsTotal);
        pageInfo.setData(contentList);
        pageInfo.setError("");

        return pageInfo;
    }
}
