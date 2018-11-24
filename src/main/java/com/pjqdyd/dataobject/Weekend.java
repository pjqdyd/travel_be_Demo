package com.pjqdyd.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 周末游信息(对应数据库的类)
 */
@Entity
@Data
public class Weekend {

    @Id
    @Column(unique = true)
    private String Id;

    @Column(length = 32)
    private String title;

    @Column(length = 128)
    private String weekendDesc;

    @Column(length = 256)
    private String imgUrl;

}
