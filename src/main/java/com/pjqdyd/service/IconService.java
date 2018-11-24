package com.pjqdyd.service;

import com.pjqdyd.dataobject.Icon;

import java.util.List;

//图标相关业务操作接口
public interface IconService {

    Icon findOne(String id);

    List<Icon> findAll();

    Icon save(Icon icon);

    void delete(Icon icon);

}
