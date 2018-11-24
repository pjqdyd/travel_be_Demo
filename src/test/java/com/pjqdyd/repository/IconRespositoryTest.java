package com.pjqdyd.repository;

import com.pjqdyd.dataobject.Icon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IconRespositoryTest {

    @Autowired
    private IconRespository iconRespository;

    @Test
    public void findOneTest(){
        Icon result = iconRespository.findOne("0002");
        System.out.println(result.toString());
    }
}