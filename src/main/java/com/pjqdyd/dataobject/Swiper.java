package com.pjqdyd.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 轮播图(对应数据库的类)
 */
@Entity
@Data
public class Swiper {

    @Id
    private String Id;

    @Column(length = 256)
    private String imgUrl;
}
