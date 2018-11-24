package com.pjqdyd.service;

import com.pjqdyd.dataobject.Recommend;

import java.util.List;

//推荐信息对象相关业务操作接口
public interface RecommendService {

    Recommend findOne(String id);

    List<Recommend> findAll();

    Recommend save(Recommend recommend);

    void delete(Recommend recommend);
}
