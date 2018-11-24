package com.pjqdyd.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 推荐信息(对应数据库的实体类)
 */
@Entity
@Data
public class Recommend {

    @Id
    @Column(unique = true)
    private String Id;

    @Column(length = 32)
    private String title;

    @Column(length = 128)
    private String recoDesc;

    @Column(length = 256)
    private String imgUrl;
}
