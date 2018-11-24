package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Swiper;
import com.pjqdyd.service.SwiperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SwiperServiceImplTest {

    @Autowired
    private SwiperService swiperService;

    @Test
    public void findAll() {
       List<Swiper> swiperList = swiperService.findAll();
        System.out.println(swiperList.toString());
    }
}