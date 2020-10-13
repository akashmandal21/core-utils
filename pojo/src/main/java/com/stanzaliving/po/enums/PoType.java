package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PoType {

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
	AUDIO_STREAMING("Audio Ads"),
	DISPLAY("Display Ads"),
	EMAIL_MARKETING("Email Marketing"),
	ENGAGEMENT_ACTIVITY ("Engagement Activity"),
	ONLINE_PROMOTIONS("Online Promotions"),
	SEARCH("Search Ads"),
	SMS_MARKETING("SMS Marketing"),
	SOCIAL("Social"),
	VIDEO_STREAMING("Video Ads"),
	CONTENT_CREATION("Content Creation"),
	DATABASE_RESEARCH("Database"),
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
	PRE_SALES_TEAM_INCENTIVE("Pre-Sales Incentive"),
	RETENTION_INCENTIVE("Retention Incentive"),
	SALES_TEAM_INCENTIVE("New Sales Incentive"),
	CRM("CRM"),
	TELEPHONY("Telephony"),
	OTHER_DISCOUNT("Other Discount"),
	BRAND_AWARENESS("Brand Awareness"),
	ContestsAndAwards("Contests and Awards"),
	LEAD_NURTURING("Lead Nurturing"),

	ACTIVATIONS("Activations"),
	CREDIT_NOTE("Credit Note"),
	NEW_SALES_DISCOUNT("New Sales Discount"),
	PRE_SALES_DISCOUNT("Pre-sales Discount"),
	EVENTS_ACTIVATIONS("Events-Activations"),
	PARTNERSHIPS("Partnerships"),
	OTHER("Others");

	private String type;
	
}
