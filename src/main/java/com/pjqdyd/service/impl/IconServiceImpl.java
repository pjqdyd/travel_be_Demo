package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Icon;
import com.pjqdyd.repository.IconRespository;
import com.pjqdyd.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 图标相关业务接口实现类
 */
@Service
public class IconServiceImpl implements IconService {
    @Autowired
    private IconRespository iconRespository;

    @Override
    public Icon findOne(String id) {
        return iconRespository.findOne(id);
    }

    @Override
    public List<Icon> findAll() {
        return iconRespository.findAll();
    }

    @Override
    public Icon save(Icon icon) {
        return iconRespository.save(icon);
    }

    @Override
    public void delete(Icon icon) {
        iconRespository.delete(icon);
    }
}
