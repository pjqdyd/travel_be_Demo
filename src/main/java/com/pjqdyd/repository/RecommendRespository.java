package com.pjqdyd.repository;

import com.pjqdyd.dataobject.Recommend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 推荐信息对象的资源仓库接口(DAO层)
 */
public interface RecommendRespository extends JpaRepository<Recommend,String> {
}
