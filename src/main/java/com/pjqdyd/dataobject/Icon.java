package com.pjqdyd.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 图标对应数据库的类
 */
@Entity
@Data
public class Icon {
    @Id
    @Column(unique = true)
    private String Id;

    @Column(length = 32)
    private String iconDesc;

    @Column(length = 256)
    private String imgUrl;


}
