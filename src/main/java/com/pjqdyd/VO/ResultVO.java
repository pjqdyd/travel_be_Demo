package com.pjqdyd.VO;

import lombok.Data;


/**
 * Http最外层的返回对象
 * @param <T>
 */
@Data
public class ResultVO<T> {

    private Boolean ret;

    private T data;
}
