/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@AllArgsConstructor
public enum LeadSourceEnum {
//Keep it alphabetical

	ADITYA_REFERRAL("Aditya Referral"),
	AMC_BANNERGHATT("AMC Bannerghatt"),
	BROKER_APP("Broker App"),
	BVP_LATERAL("BVP Lateral"),
	CHAT("Chat"),
	CHRIST_DELHI_ACTIVITY("Christ Delhi Activity"),
	CITY_TEAM("City Team"),
	COLLEGE_EVENT("College Event"),
	CORPORATE_ACTIVATION("Corporate Activation"),
	DATABASE("Database"),
	DATABASE_AVINASH("Database Avinash"),
	DATABASE_HYDERABAD_VRN("Database Hyderabad VRN"),
	DATABASE_PARUL("Database Parul"),
	DIRECT_WALK_IN("Direct Walk-In"),
	DU_UPDATES("DU Updates"),
	DU_BEAT("DU Beat"),
	FACEBOOK("Facebook"),
	FLAT_AND_FLATMATES("Flat And Flatmates"),
	FLP("FLP"),
	FLYERS("Flyers"),
	GOOGLE("Google"),
	GOOGLE_ADS("Google Ads"),
	GOOGLE_MAPS("Google Maps"),
	GOOGLE_PLAY_STORE("Google Play Store"),
	HOTSTAR("Hotstar"),
	INBOUND_CALL("Inbound Call"),
	INSTAGRAM("Instagram"),
	JUST_DIAL("Just Dial"),
	LEAD_LP("Lead Lp"),
	MAGIC_BRICKS("Magicbricks"),
	MAKAAN("Makaan"),
	NINETY_NINE_ACRES("99Acres"),
	NO_BROKER("No Broker"),
	PRESIDENCY_YELAHANKA("Presidency Yelahanka"),
	PROMOTER("Promoter"),
	PUBLICATION("Publication"),
	OLX("OLX"),
	ON_GROUND("On Ground"),
	QUORA("Quora"),
	RESIDENCE_PAGE("Residence Page"),
	RESIDENCE_SEARCH_PAGE("Residence Search Page"),
	SALES_APP("Sales App"),
	SHIKSHA("Shiksha"),
	SMS("SMS"),
	STANZA_CARE("Stanza Care"),
	STUDENT_APP("Student App"),
	STUDENT_REFERRAL("Student Referral"),
	UNATTRIBUTED("Unattributed"),
	WEBSITE("Website"),
	WEBSITE_VISIT("WebSite Visit"),
	WHATSAPP("Whatsapp"),
	ZOHO("Zoho");


	private String leadSourceName;
	
	private static Map<LeadSourceEnum, String> leadSourceDescMap = new HashMap<>();

	static {
		for(LeadSourceEnum leadSource : LeadSourceEnum.values()) {
			leadSourceDescMap.put(leadSource, leadSource.getLeadSourceName());
		}		
	}
	
	public static Map<LeadSourceEnum, String> getLeadSources() {
		return leadSourceDescMap;
	}
}
