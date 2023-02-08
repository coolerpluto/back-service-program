package com.fan.back.common.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BookReq {
    private Long id;
    
    private String bookName;
    
    private String category;
    
    private String bookPrice;
}
