package com.pjqdyd.repository;

import com.pjqdyd.dataobject.Weekend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 周末游信息对象资源仓库接口(DAO层)
 */
public interface WeekendRespository extends JpaRepository<Weekend,String> {
}
