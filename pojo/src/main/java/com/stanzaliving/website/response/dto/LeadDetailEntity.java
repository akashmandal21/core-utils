package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;
import com.stanzaliving.core.leaddashboard.enums.LeadStatus;
import com.stanzaliving.core.leaddashboard.enums.LeadSubStatus;
import com.stanzaliving.website.enums.LeadQualifiedBy;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LeadDetailEntity {
    private String phone;
    private String uuid;
    private LeadSourceEnum leadSource;
    private String firstName;
    private String lastName;
    private String leadEmail;
    private String gender;
    private String leadTag;
    private String cityUuid;
    private String micromarketUuid;
    private String leadOwnerUuid;
    private String residenceUuid;
    private LeadStatus leadStatus;
    private LeadSubStatus leadSubStatus;
    private String preBookingResidence;

    private Double preBookingAmount;

    private String preBookingDate;

    private String leadCreationInterface;

    private String referralCode;

    private String referralCategory;

    private String moveInDate;
    private String occupancy;
    private String metadata;
    private boolean leadRevived = false;
    private String utmSource;
    private String utmMedium;
    private String utmCampaign;
    private String utmTerm;
    private String utmAdgroup;
    private String gclId;
    private String fbclid;
    private String creative;
    private String utmContent;


    private String utmTarget;


    private String utmAdformat;


    private String college;


    private String zohoId;


    private String leadOwnerZohoId;


    private Integer commissionEarned;
    private Integer preBookingCommissionEarned;
    private boolean phoneVerified = false;

    private Integer leadModeId;

    private String leadType;

    private String durationOfStay;


    private String otherMicromarketName;


    private String micromarketAliasName;

    private LeadQualifiedBy qualifiedBy;

    private LeadSubStatus otherSubStatus;

    private String accommodationType;

    private Date createdAt;
}
