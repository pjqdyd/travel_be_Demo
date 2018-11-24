package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Recommend;
import com.pjqdyd.service.RecommendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RecommendServiceImplTest {

    @Autowired
    private RecommendService recommendService;

    @Test
    public void findAll() {
       List<Recommend> recommendList = recommendService.findAll();
        System.out.println(recommendList.toString());
    }
}