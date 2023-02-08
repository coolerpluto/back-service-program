package com.fan.back.rest.entity;

import lombok.Data;

import java.util.Date;

/**
 * 实体类会有很多属性，在res里面规范想要实体类的哪些数据，直接命名相同属性即可，然后使用
 * BeanCopyUtils工具类进行复制，res里面可以放任何东西，返回给前端
 */
@Data
public class Book {
    
    private Long id;
    
    private String bookName;
    
    private Integer bookPrice;
    
    private String category;
    
    private Date createTime;
}
