package com.pjqdyd.service;

import com.pjqdyd.dataobject.Swiper;

import java.util.List;

//轮播图相关业务接口
public interface SwiperService {

    Swiper findOne(String id);

    List<Swiper> findAll();

    Swiper save(Swiper swiper);

    void delete(Swiper swiper);
}
