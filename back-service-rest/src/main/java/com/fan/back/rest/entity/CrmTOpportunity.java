package com.fan.back.rest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName crm_t_opportunity
 */
@TableName(value ="crm_t_opportunity")
@Data
public class CrmTOpportunity implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer opportunityId;

    /**
     * 
     */
    private Integer quotationId;

    /**
     * 
     */
    private String customerName;

    /**
     * 
     */
    private String opportunityNum;

    /**
     * 
     */
    private String customerAddressProvince;

    /**
     * 
     */
    private String customerAddressCity;

    /**
     * 
     */
    private String customerAddressDistrict;

    /**
     * 
     */
    private String customerAddressDetail;

    /**
     * 
     */
    private String zipCode;

    /**
     * 
     */
    private String customerMainBusiness;

    /**
     * 
     */
    private String customerIndustry;

    /**
     * 
     */
    private Integer customerIndustryInfluence;

    /**
     * 
     */
    private String subCustomerIndustry;

    /**
     * 
     */
    private Date deliveryDate;

    /**
     * 
     */
    private Integer isOldCustomer;

    /**
     * 
     */
    private String opportunityName;

    /**
     * 
     */
    private Integer opportunityStage;

    /**
     * 
     */
    private String opportunityStageSequence;

    /**
     * 
     */
    private Integer mainOperatorType;

    /**
     * 
     */
    private String channelName;

    /**
     * 
     */
    private String providerName;

    /**
     * 
     */
    private Integer tenderType;

    /**
     * 
     */
    private String customerProjectName;

    /**
     * 
     */
    private Integer isShortlistedRequire;

    /**
     * 
     */
    private Integer isInitiation;

    /**
     * 
     */
    private Integer isFundsInvested;

    /**
     * 
     */
    private Integer expectedValue;

    /**
     * 
     */
    private Integer focusPoint;

    /**
     * 
     */
    private Integer projectBudget;

    /**
     * 
     */
    private Integer budgetSource;

    /**
     * 
     */
    private Date expectedTenderDate;

    /**
     * 
     */
    private Date nextStageDate;

    /**
     * 
     */
    private Integer backgroundPurpose;

    /**
     * 
     */
    private String backgroundPurposeNotes;

    /**
     * 
     */
    private String projectSponsorInfo;

    /**
     * 
     */
    private String customerBenefits;

    /**
     * 
     */
    private String companyBenefits;

    /**
     * 
     */
    private String oppotunityNotes;

    /**
     * 
     */
    private String customerOrgNotes;

    /**
     * 
     */
    private String opportunityFollowupActions;

    /**
     * 
     */
    private String winReason;

    /**
     * 
     */
    private String lostReason;

    /**
     * 
     */
    private String giveupReason;

    /**
     * 
     */
    private String stopReason;

    /**
     * 
     */
    private String summary;

    /**
     * 
     */
    private Integer isDelivered;

    /**
     * 
     */
    private Integer isPaid;

    /**
     * 
     */
    private Date paymentDate;

    /**
     * 
     */
    private Integer isAccepted;

    /**
     * 
     */
    private Integer creatorId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer operatorId;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Integer ownerId;

    /**
     * 
     */
    private Integer isDeleted;

    /**
     * 
     */
    private Integer isDraft;

    /**
     * 
     */
    private Date alertSentDate;

    /**
     * 
     */
    private Integer isStageDraft;

    /**
     * 
     */
    private Integer signingStatus;

    /**
     * 
     */
    private Date signingDate;

    /**
     * 
     */
    private String signingComment;

    /**
     * 
     */
    private Integer leaderInfoConfirmFlg;

    /**
     * 
     */
    private Integer leaderVisitCustomerFlg;

    /**
     * 
     */
    private Integer leaderValidOpportunityFlg;

    /**
     * 
     */
    private Integer contractId;

    /**
     * 
     */
    private Integer isFiling;

    /**
     * 
     */
    private Date filingTime;

    /**
     * 
     */
    private String coreBusiness;

    /**
     * 
     */
    private Integer channelId;

    /**
     * 
     */
    private Integer successPossibility;

    /**
     * 
     */
    private Integer nextOpportunityStage;

    /**
     * 
     */
    private Date expectedSignDate;

    /**
     * 
     */
    private Integer customerId;

    /**
     * 
     */
    private String projectUsedSystem;

    /**
     * 
     */
    private Integer isvId;

    /**
     * 
     */
    private String isvName;

    /**
     * 
     */
    private Date expectedFirstPaymentCollectionDate;

    /**
     * 
     */
    private Integer biddingStatus;

    /**
     * 
     */
    private Date systemOnlineDate;

    /**
     * 
     */
    private Integer dbBudget;

    /**
     * 
     */
    private Integer productTypeId;

    /**
     * 
     */
    private Integer signedChannelId;

    /**
     * 
     */
    private String systemChosenReason;

    /**
     * 
     */
    private Date systemStartDate;

    /**
     * 
     */
    private Integer projectHasDocument;

    /**
     * 
     */
    private Integer projectHasMeeting;

    /**
     * 
     */
    private String projectNeedSupport;

    /**
     * 
     */
    private Integer isKnownTenderContent;

    /**
     * 
     */
    private Integer isOurParamInTender;

    /**
     * 
     */
    private Integer isKnownTenderProcess;

    /**
     * 
     */
    private Integer isMasterTenderProcess;

    /**
     * 
     */
    private Integer isKnownAllExperts;

    /**
     * 
     */
    private Integer isSupportedByExperts;

    /**
     * 
     */
    private String competitorInfo;

    /**
     * 
     */
    private Date l1CreatedTime;

    /**
     * 
     */
    private Date l2CreatedTime;

    /**
     * 
     */
    private Date l3CreatedTime;

    /**
     * 
     */
    private Date l4CreatedTime;

    /**
     * 
     */
    private Date l5CreatedTime;

    /**
     * 
     */
    private Date l6CreatedTime;

    /**
     * 
     */
    private Date l7CreatedTime;

    /**
     * 
     */
    private Date l8CreatedTime;

    /**
     * 
     */
    private Date l9CreatedTime;

    /**
     * 
     */
    @TableField("l6_3_created_time")
    private Date l63CreatedTime;
    
    private String inspurProvideNamePhone;

    /**
     * 
     */
    private String isInspurProvide;

    /**
     * 
     */
    private String inspurProvideName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}