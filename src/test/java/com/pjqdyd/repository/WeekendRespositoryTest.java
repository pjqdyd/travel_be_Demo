package com.pjqdyd.repository;

import com.pjqdyd.dataobject.Weekend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class WeekendRespositoryTest {

    @Autowired
    private WeekendRespository weekendRespository;

    @Test
    public void findOneTest(){
        Weekend result = weekendRespository.findOne("0002");
        System.out.println(result.toString());
    }


}