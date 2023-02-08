package com.fan.back.rest.controller;

import com.fan.back.common.res.OpportunityRes;
import com.fan.back.common.res.ResultBody;
import com.fan.back.rest.mapper.CrmTOpportunityMapper;
import com.fan.back.rest.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpportunityController {
    
    @Autowired
    private OpportunityService opportunityService;
    
    @GetMapping("/opportunity/{opportunityNum}")
    public ResultBody<OpportunityRes> getOpportunityByNum(@PathVariable("opportunityNum") String opportunityNum){
        OpportunityRes opportunityRes = opportunityService.getOpportunityByNum(opportunityNum);
        return ResultBody.success(opportunityRes);
    }
    
}
