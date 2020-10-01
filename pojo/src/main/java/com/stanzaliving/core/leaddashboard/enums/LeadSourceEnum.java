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
	BETA_TEST_1("betatest1"),
	CHAT("Chat"),
	CHRIST_DELHI_ACTIVITY("Christ-Delhi-Activity"),
	CITY_TEAM("City Team"),
	COLLEGE_EVENT("College Event"),
	CORPORATE_ACTIVATION("Corporate Activation"),
	CONSUMER_APP("ConsumerApp"),
	COVid("CoVid"),
	COVID_MWEB("covid-mweb"),
	DATABASE("Database"),
	DATABASE_AVINASH("Database Avinash"),
	DATABASE_HYDERABAD_VRN("Database Hyderabad VRN"),
	DATABASE_PARUL("Database Parul"),
	DIRECT_WALK_IN("Direct Walk-in"),
	DU_UPDATES("DU Updates"),
	DU_BEAT("DU Beat"),
	FACEBOOK("Facebook"),
	FLAT_AND_FLATMATES("Flat and flatmates"),
	FLP("FLP"),
	FLYERS("Flyers"),
	GOOGLE("google"),
	GOOGLE_ADS("google ads"),
	GOOGLE_MAPS("Google Maps"),
	GOOGLE_PLAY_STORE("Google Play Store"),
	HOTSTAR("Hotstar"),
	HOUSING("Housing"),
	INBOUND_CALL("Inbound Call"),
	INSTAGRAM("Instagram"),
	JUST_DIAL("Just Dial"),
	JUSTDIAL("Justdial"),
	LEAD_LP("Lead LP"),
	LEAD_LP_FORM_1("Lead LP-form-1"),
	LEAD_LP_FORM_2("Lead LP-form-2"),
	LEAD_LP_FORM_3("Lead LP-form-3"),
	MAGIC_BRICKS("Magicbricks"),
	MAKAAN("Makaan"),
	NINETY_NINE_ACRES("99Acres"),
	NO_BROKER("No Broker"),
	PRESIDENCY_YELAHANKA("Presidency Yelahanka"),
	PROMOTER("Promoter"),
	PREBOOKING("Prebooking"),
	PUBLICATION("Publication"),
	PROPERTY_WALA_ORGANIC("Property Wala (Organic)"),
	OFFLINE("Offline"),
	ONLINE("Online"),
	OLX("OLX"),
	ON_GROUND("On Ground"),
	QUORA("Quora"),
	RESIDENCE_APP("Resident App"),
	RESIDENCE_PAGE("Residence Page"),
	RESIDENCE_SEARCH_PAGE("Residence Search Page"),
	SALES_APP("Sales App"),
	SHIKSHA("Shiksha"),
	SMS("SMS"),
	STANZA_CARE("Stanza Care"),
	STUDENT_APP("Student App"),
	STUDENT_REFERRAL("Student Referral"),
	SULEKHA("Sulekha"),
	UNATTRIBUTED("Unattributed"),
	UTM_SOURCE("utmSource"),
	WALKINS("Walk-ins"),
	WEBSITE("Website"),
	WEBSITE_COMING_SOON("Website - Coming Soon"),
	WEBSITE_VISIT("WebSite Visit"),
	WEBSITE_RESIDENCE_CARD("Website - Residence Card"),
	WEBSITE_GOOGLE_MAPS("Website, Google Maps"),
	WHATSAPP("Whatsapp"),
	WHATSAPP_WEBSITE("Whatsapp-Website"),
	PAGE_404("404 Page"),
	ZOHO("zoho");
	
	private String leadSourceName;
	
	private static Map<LeadSourceEnum, String> leadSourceDescMap = new HashMap<>();
	private static Map<String, LeadSourceEnum> leadNameSourceMap = new HashMap<>();
	
	static {
		for(LeadSourceEnum leadSource : LeadSourceEnum.values()) {
			leadSourceDescMap.put(leadSource, leadSource.getLeadSourceName());
			leadNameSourceMap.put(leadSource.getLeadSourceName(), leadSource);
		}		
	}
	
	public static Map<LeadSourceEnum, String> getLeadSources() {
		return leadSourceDescMap;
	}
	
	public static LeadSourceEnum getLeadSourceEnumByName(String name) {
		return leadNameSourceMap.get(name);
	}
}
