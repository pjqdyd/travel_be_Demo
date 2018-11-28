package com.pjqdyd.controller;

import com.pjqdyd.VO.*;
import com.pjqdyd.dataobject.Icon;
import com.pjqdyd.dataobject.Recommend;
import com.pjqdyd.dataobject.Swiper;
import com.pjqdyd.dataobject.Weekend;
import com.pjqdyd.service.IconService;
import com.pjqdyd.service.RecommendService;
import com.pjqdyd.service.SwiperService;
import com.pjqdyd.service.WeekendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 首页Controller层
 */
@RestController
@RequestMapping("/travel")
public class HomeController {
    @Autowired
    private IconService iconService;

    @Autowired
    private SwiperService swiperService;

    @Autowired
    private RecommendService recommendService;

    @Autowired
    private WeekendService weekendService;

    @GetMapping("/home")
    public ResultVO home() {

        ResultVO resultVO = new ResultVO();

        List<Swiper> swiperList = swiperService.findAll();
        List<Icon> iconList = iconService.findAll();
        List<Recommend> recommendList = recommendService.findAll();
        List<Weekend> weekendList = weekendService.findAll();

        //主页的数据data对象
        HomeData homedata = new HomeData();
        homedata.setSwiperList(swiperList);
        homedata.setIconList(iconList);
        homedata.setRecommendList(recommendList);
        homedata.setWeekendList(weekendList);

        resultVO.setData(homedata);

        resultVO.setRet(true);
        return resultVO;
    }

}
