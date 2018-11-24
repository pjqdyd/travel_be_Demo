package com.pjqdyd.service.impl;

import com.pjqdyd.dataobject.Icon;
import com.pjqdyd.service.IconService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IconServiceImplTest {

    @Autowired
    private IconService iconService;

    @Test
    public void findAll() {
       List<Icon> iconList = iconService.findAll();
        System.out.println(iconList.toString());
    }
}