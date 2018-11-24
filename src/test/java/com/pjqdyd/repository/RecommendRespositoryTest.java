package com.pjqdyd.repository;


import com.pjqdyd.dataobject.Recommend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RecommendRespositoryTest {
    @Autowired
    private RecommendRespository recommendRespository;

    @Test
    public void findOneTest(){
        Recommend result = recommendRespository.findOne("0001");
        System.out.println(result.toString());
    }

}