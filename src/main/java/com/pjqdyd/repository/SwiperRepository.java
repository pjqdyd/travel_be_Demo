package com.pjqdyd.repository;

import com.pjqdyd.dataobject.Swiper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 轮播图对象的资源仓库接口(DAO层)
 */
public interface SwiperRepository extends JpaRepository<Swiper, String> {
}
