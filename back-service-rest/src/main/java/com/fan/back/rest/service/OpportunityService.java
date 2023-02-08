package com.fan.back.rest.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.fan.back.common.res.OpportunityRes;
import com.fan.back.common.util.BeanCopyUtils;
import com.fan.back.rest.entity.CrmTOpportunity;
import com.fan.back.rest.mapper.CrmTOpportunityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpportunityService {
    @Autowired
    private CrmTOpportunityMapper opportunityMapper;
    
    public OpportunityRes getOpportunityByNum(String opportunityNum){
        CrmTOpportunity crmTOpportunity = opportunityMapper.selectOne(new QueryWrapper<CrmTOpportunity>().lambda()
                .eq(StringUtils.isNotBlank(opportunityNum), CrmTOpportunity::getOpportunityNum, opportunityNum));
        if (ObjectUtils.isNotEmpty(crmTOpportunity)){
            OpportunityRes opportunityRes = BeanCopyUtils.commonCopy(crmTOpportunity, OpportunityRes.class);
            return opportunityRes;
        }
        return null;
    }
}
