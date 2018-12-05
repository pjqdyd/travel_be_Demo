package com.pjqdyd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 城市页面Controller层
 */
@RestController
@RequestMapping("/travel")
public class CityController {

    @GetMapping("/city")
    public String city(){
        return "fhd";
    }
}
