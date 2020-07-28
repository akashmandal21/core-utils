package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {

    BOI("BOI"),
    GC("GC"),
    ASIS("As-Is"),
    OFFLINE("Offline"),
    ONLINE("Online"),
    COLLATERAL("Collateral"),
    MERCHANDISE("Merchandise"),
    MISCELLANEOUS("Miscellaneous"),
    SIGNAGE("Signage"),
    TRANSIT_MEDIA("Transit Media"),
    AFFILIATE("Affiliate"),
    AGENCY("Agency"),
    AUDIO_STREAMING("Audio Streaming"),
    DISPLAY("Display"),
    EMAIL_MARKETING("Email Marketing"),
    ENGAGEMENT_ACTIVITY ("Engagement Activity"),
    ONLINE_PROMOTIONS("Online Promotions"),
    SEARCH("Search"),
    SMS_MARKETING("SMS Marketing"),
    SOCIAL("Social"),
    VIDEO_STREAMING("Video Streaming"),
    CONTENT_CREATION("Content Creation"),
    DATABASE_RESEARCH("Database Research"),
    PHOTOGRAPHY_VIDEOGRAPHY("Photography/Videography"),
    FACILITATION_CHARGES("Facilitation Charges"),
    INTERN_COST("Intern Cost"),
    PROMOTERS_COST("Promoters Cost"),
    TEMP_STAFF_COST("Temp Staff Cost"),
    B2B_RELATIONSHIPS("B2B Relationships"),
    PARTNERS("Partners"),
    STUDENTS("Students"),
    ADDITIONAL_DISCOUNT_CN("Additional Discount CN"),
    EXTENSION_DISCOUNT_CN("Extension Discount CN"),
    MISSED_DISCOUNT_CN("Missed Discount CN"),
    MISSING_REFERRAL_CN("Missing Referral CN"),
    OTHER_CN("Other CN"),
    RESIDENT_AWARD_CN("Resident Award CN"),
    EARLY_BIRD_DISCOUNT("Early Bird Discount"),
    FLASH_SALE("Flash Sale"),
    GROUP_DISCOUNT("Group Discount"),
    ONE_TIME_DISCOUNT("One time Discount"),
    POC_DISCOUNT("POC Discount"),
    POSTSEASON_DISCOUNT("Postseason Discount"),
    RELATIONSHIP_DISCOUNT("Relationship Discount"),
    RETENTION_DISCOUNT("Retention Discount"),
    PRE_SALES_TEAM_INCENTIVE("Pre Sales Team Incentive"),
    RETENTION_INCENTIVE("Retention Incentive"),
    SALES_TEAM_INCENTIVE("Sales Team Incentive"),
    CRM("CRM"),
    TELEPHONY("Telephony"),
    OTHER("Others");

    private String typeText;

}
