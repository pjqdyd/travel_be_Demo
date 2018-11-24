package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Weekend;
import com.pjqdyd.service.WeekendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WeekendServiceImplTest {

    @Autowired
    private WeekendService weekendService;

    @Test
    public void findAll() {
       List<Weekend> weekendList = weekendService.findAll();
        System.out.println(weekendList.toString());
    }
}