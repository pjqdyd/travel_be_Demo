package com.pjqdyd.VO;

import com.pjqdyd.dataobject.Icon;
import com.pjqdyd.dataobject.Recommend;
import com.pjqdyd.dataobject.Swiper;
import com.pjqdyd.dataobject.Weekend;

import java.util.List;

/**
 * 返回给前端的data对象
 */
@lombok.Data
public class HomeData {

    private List<Swiper> swiperList;

    private List<Icon> iconList;

    private List<Recommend> recommendList;

    private List<Weekend> weekendList;

}
