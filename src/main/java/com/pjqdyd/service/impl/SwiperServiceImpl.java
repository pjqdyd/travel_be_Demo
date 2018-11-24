package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Swiper;
import com.pjqdyd.repository.SwiperRepository;
import com.pjqdyd.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 轮播图相关业务操作实现类
 */
@Service
public class SwiperServiceImpl implements SwiperService {
    @Autowired
    private SwiperRepository swiperRepository;

    @Override
    public Swiper findOne(String id) {
        return swiperRepository.findOne(id);
    }

    @Override
    public List<Swiper> findAll() {
        return swiperRepository.findAll();
    }

    @Override
    public Swiper save(Swiper swiper) {
        return swiperRepository.save(swiper);
    }

    @Override
    public void delete(Swiper swiper) {
       swiperRepository.delete(swiper);
    }
}
