package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;
import lombok.Data;

import java.util.Date;

@Data
public class LeadAttributesDto {

    private String name;
    private Date createAt;

    private String leadSource;
    private LeadSourceEnum leadSourceEnum;

    private String phone;
    private String email;
    private String leadSubstatus;
    private String gender;
    private String city;
    private String micromarket;
    private String residence;
    private String cityUuid;
    private String micromarketUuid;
    private String residenceUuid;

    private String leadOwnerName;
    private String leadOwnerUuid;

    private String colorCode;

    private String leadUuid;

    private String leadTag;
    private String moveInDate;
    private String preBookingResidence;
    private Double preBookingAmount;
    private String preBookingDate;

    private boolean phoneTruncate;
    private String micromarketAliasName;
    private boolean priorityLeadTag;
    private boolean phoneVerified;
    private String dateOfVisit;
    private String leadType;

    private LeadTagsDto leadTagsDto;
}