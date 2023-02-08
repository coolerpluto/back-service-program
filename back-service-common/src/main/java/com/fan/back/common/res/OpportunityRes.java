package com.fan.back.common.res;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpportunityRes implements Serializable {
    private Integer opportunityId;
    
    private String opportunityNum;
    
    private String opportunityName;
}
