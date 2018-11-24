package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Weekend;
import com.pjqdyd.repository.WeekendRespository;
import com.pjqdyd.service.WeekendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周末游相关业务实现类
 */
@Service
public class WeekendServiceImpl implements WeekendService {
    @Autowired
    private WeekendRespository weekendRespository;

    @Override
    public Weekend findOne(String id) {
        return weekendRespository.findOne(id);
    }

    @Override
    public List<Weekend> findAll() {
        return weekendRespository.findAll();
    }

    @Override
    public Weekend save(Weekend weekend) {
        return weekendRespository.save(weekend);
    }

    @Override
    public void delete(Weekend weekend) {
        weekendRespository.delete(weekend);
    }
}
