package com.pjqdyd.service;

import com.pjqdyd.dataobject.Weekend;

import java.util.List;

//周末游相关业务操作接口
public interface WeekendService {

    Weekend findOne(String id);

    List<Weekend> findAll();

    Weekend save(Weekend weekend);

    void delete(Weekend weekend);
}
