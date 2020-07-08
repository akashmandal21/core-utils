/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@AllArgsConstructor
public enum LeadSourceEnum {

	CHAT("Chat"),
	WEBSITE_VISIT("WebSite Visit"),
	GOOGLE("Google"),
	SMS("SMS"),
	INSTAGRAM("Instagram"),
	BROKER_APP("Broker App"),
	LEAD_LP("Lead Lp"),
	WEBSITE("Website"),
	RESIDENCE_PAGE("Residence Page"),
	DATABASE("Database"),
	FACEBOOK("Facebook"),
	QUORA("Quora"),
	HOTSTAR("Hotstar"),
	DIRECT_WALK_IN("Direct Walk-In"),
	WHATSAPP("Whatsapp"),
	STANZA_CARE("Stanza Care"),
	FLP("FLP"),
	RESIDENCE_SEARCH_PAGE("Residence Search Page"),
	INBOUND_CALL("Inbound Call"),
	JUST_DIAL("Just Dial"),
	CHRIST_DELHI_ACTIVITY("Christ Delhi Activity"),
	DU_BEAT("DU Beat"),
	PUBLICATION("Publication"),
	ON_GROUND("On Ground"),
	SALES_APP("Sales App"),
	MAGIC_BRICKS("Magicbricks"),
	ADITYA_REFERRAL("Aditya Referral"),
	FLAT_AND_FLATMATES("Flat And Flatmates"),
	FLYERS("Flyers"),
	STUDENT_REFERRAL("Student Referral"),
	COLLEGE_EVENT("College Event"),
	PROMOTER("Promoter"),
	BVP_LATERAL("BVP Lateral"),
	SHIKSHA("Shiksha"),
	CITY_TEAM("City Team"),
	DU_UPDATES("DU Updates"),
	DATABASE_AVINASH("Database Avinash"),
	UNATTRIBUTED("Unattributed"),
	DATABASE_PARUL("Database Parul"),
	GOOGLE_PLAY_STORE("Google Play Store"),
	GOOGLE_MAPS("Google Maps"),
	DATABASE_HYDERABAD_VRN("Database Hyderabad VRN"),
	GOOGLE_ADS("Google Ads"),
	OLX("OLX"),
	STUDENT_APP("Student App"),
	AMC_BANNERGHATT("AMC Bannerghatt"),
	CORPORATE_ACTIVATION("Corporate Activation"),
	NINETY_NINE_ACRES("99Acres"),
	PRESIDENCY_YELAHANKA("Presidency Yelahanka"),
	MAKAAN("Makaan"),
	NO_BROKER("No Broker");

	private String leadSourceName;
}
