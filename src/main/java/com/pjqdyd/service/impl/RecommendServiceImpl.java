package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Recommend;
import com.pjqdyd.repository.RecommendRespository;
import com.pjqdyd.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 推荐对象相关业务操作对象实现类
 */
@Service
public class RecommendServiceImpl implements RecommendService {
    @Autowired
    private RecommendRespository recommendRespository;

    @Override
    public Recommend findOne(String id) {
        return recommendRespository.findOne(id);
    }

    @Override
    public List<Recommend> findAll() {
        return recommendRespository.findAll();
    }

    @Override
    public Recommend save(Recommend recommend) {
        return recommendRespository.save(recommend);
    }

    @Override
    public void delete(Recommend recommend) {
        recommendRespository.delete(recommend);
    }
}
