package com.pjqdyd.repository;

import com.pjqdyd.dataobject.Icon;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Icon的对象的资源仓库接口 (DAO层)
 */
public interface IconRespository extends JpaRepository<Icon,String> {
}
