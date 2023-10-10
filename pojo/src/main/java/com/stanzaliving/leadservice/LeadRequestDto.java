package com.stanzaliving.leadService;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;
import com.stanzaliving.core.leaddashboard.enums.LeadStatus;
import com.stanzaliving.core.leaddashboard.enums.LeadSubStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeadRequestDto {

    private String leadUuid;

    private String firstName;
    private String lastName;
    private String phone;
    private String leadEmail;

    private String gender;
    private String lastPropertyVisited;
    private LeadSourceEnum leadSource;

    private String leadTag;
    private List<Map<String, String>> hotLeadAttributes;

    private String moveInDate;
    private String preBookingResidence;
    private Double preBookingAmount;

    private String preBookingDate;

    private String orderId;

    private String cityUuid;
    private String micromarketUuid;
    private String residenceUuid;

    private String leadOwnerUuid;
    private LeadStatus leadStatus;
    private LeadSubStatus leadSubStatus;

    private String leadSourceDesc;
    private String leadSubStatusDesc;

    private boolean isLeadBooked;

    private Integer visitCount;
    private boolean newLead;

    private String referralPhone;
    private String referralCode;
    private String referralCategory;

    private String occupancy;
    private String metadata;
    private String brokerCreatedBy;
    private boolean leadRevived;

    private String utmSource;
    private String utmMedium;
    private String utmCampaign;
    private String utmTerm;
    private String utmAdgroup;
    private String gclId;
    private String utmContent;
    private String utmTarget;
    private String utmAdformat;
    private String utmCategory;

    private String zohoId;
    private String leadOwnerZohoId;

    private Integer commissionEarned;
    private Integer preBookingCommissionEarned;

    private String leadType;
    private String college;
    private boolean phoneVerified;

    private int leadModeId;
    private boolean prebookingUpdateFlag;
    private String durationOfStay;
    private String otherMicromarketName;
    private String budget;

    private String fbclid;
    private String creative;

    private String moveInDateRange;
    private String profession;
    private String textMessage;
    private boolean zohoFlag;
    private String extendDurationMessage;

    private String micromarketAliasName;

    /*
     * Only to support existing website functionality
     */
    private Integer cityId;
    private Integer micromarketId;

    private Integer residenceId;
    private String residenceName;
    private String residenceNameUuid;

    private Boolean whatsappnotification = false;
    private Boolean qrCodeFlag = false;


    private String leadOwner;
    private String leadCreationInterface;

    //lead qualification variant
    private String dateOfVisit;
    private String timeSlot;

    private String micromarketNameUuid;
    private String cityNameUuid;
    private boolean ignoreScheduleVisit;
    private String accommodationType;
    private String customIntentTag;
    private String customTagFlag;

    private boolean consumedLead = false;

    private Integer placeId;
    private String placeName;

    private String cityName;
    private String micromarketName;
    private ExternalLeadAdditionalData externalLeadAdditionalData;

    @JsonProperty("gClientId")
    private String gClientId;

    private boolean createNewLeadForm;

    private boolean dropped;
    private boolean reschedule;
    private boolean visitSchduled;
    private boolean qualification;

    private String roomPreference;
    private String residencePreference;
    private String furnishedPreference;
    private String collegeEnrollment;
    private String visitScheduledDate;
    private String vendorName;

    private Long leadId;

    private String company;
    private String visitScheduleRange;
    private String chatbotOptionSelected;
    private String houseSelected;

    private String chatbotCitySelected;
    private String chatbotMicromarketSelected;
    private String chatbotOptionSelected2;
    private String chatbotOptionSelected3;
    private boolean chatbotPrebookLinkSent;

    private String chatbotOptionSelected4;
    private String chatbotOptionSelected5;
    private String chatbotOptionSelected6;
    private String chatbotOptionSelected7;
    private String chatbotOptionSelected8;
    private String gtCallback;
    private String droppedReasonsSelected;

    private String platformOs;
    private String preferredLanguage;
    private String createdBy;

}
