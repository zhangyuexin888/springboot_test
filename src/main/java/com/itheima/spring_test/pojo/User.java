package com.itheima.spring_test.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: spring_test
 * @description:
 * @author: ZhangYuexin
 * @date : Created in 2019/7/15 8:27
 * @tips:
 */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
