package com.fan.back.common.res;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class BookRes implements Serializable {
    
    private Long id;
    
    private String bookName;
    
    private String category;
}
