package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum LeadSourceEnum {

    ADITYA_REFERRAL("Aditya Referral"),
    AMC_BANNERGHATT("AMC Bannerghatt"),
    APARTMENT_LEAD_LP_FORM("Apartment Lead LP Form"),
    BETA_TEST_1("betatest1"),
    BROKER_APP("Broker App"),
    BVP_LATERAL("BVP Lateral"),
    CHAT("Chat"),
    CHRIST_DELHI_ACTIVITY("Christ-Delhi-Activity"),
    CITY_TEAM("City Team"),
    COLLEGE_DUNIA("Collegedunia"),
    COLLEGE_EVENT("College Event"),
    CONSUMER_APP("ConsumerApp"),
    CORPORATE_ACTIVATION("Corporate Activation"),
    COVid("CoVid"),
    COVID_COMMUNICATION("Covid Communication"),
    COVID_MWEB("covid-mweb"),
    DATABASE("Database"),
    DATABASE_AVINASH("Database Avinash"),
    DATABASE_BRACKET_AVINASH("Database (Avinash)"),
    DATABASE_BRACKET_HYDERABAD_VRN("Database (Hyderabad VRN)"),
    DATABASE_BRACKET_PARUL("Database (Parul)"),
    DATABASE_HYDERABAD_VRN("Database Hyderabad VRN"),
    DATABASE_PARUL("Database Parul"),
    DATABSE_INDORE("Database - Indore"),
    DAVV_DATABASE("DAVV Database"),
    DIRECT_WALK_IN("Direct Walk-in"),
    DU_BEAT("DU Beat"),
    DU_UPDATES("DU Updates"),
    EMPTY("Empty"),
    FACEBOOK("Facebook"),
    FACEBOOK_AD("facebook ad"),
    FB_LEAD_GEN("Fb Lead Gen"),
    FILTER_COPY("Filtercopy"),
    FLAT_AND_FLATMATES("Flat and flatmates"),
    FLP("FLP"),
    FLYERS("Flyers"),
    GOOGLE("google"),
    GOOGLE_ADS("google ads"),
    GOOGLE_MAPS("Google Maps"),
    GOOGLE_PLAY_STORE("Google Play Store"),
    HOTSTAR("Hotstar"),
    HOUSING("Housing"),
    HYDERABAD_LATERAL("Hyderabad- Lateral"),
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
    MICROSITE("Microsite"),
    NINETY_NINE_ACRES("99Acres"),
    NO_BROKER("No Broker"),
    OFFLINE("Offline"),
    OLX("OLX"),
    ON_GROUND("On Ground"),
    ONLINE("Online"),
    PAGE_404("404 Page"),
    PHONE_PE("PhonePe"),
    PREBOOKING("Prebooking"),
    PREBOOKING_VIRTUAL_TOUR("Prebooking-Virtual Tour"),
    PRESIDENCY_YELAHANKA("Presidency Yelahanka"),
    PROMOTER("Promoter"),
    PROMOTER_ACTIVATION("Promoter Activation"),
    PROPERTY_WALA_ORGANIC("Property Wala (Organic)"),
    PUBLICATION("Publication"),
    QUICKR("Quikr"),
    QUORA("Quora"),
    RESIDENCE_APP("Resident App"),
    RESIDENCE_PAGE("Residence Page"),
    RESIDENCE_SEARCH_PAGE("Residence Search Page"),
    SALES_APP("Sales App"),
    SHIKSHA("Shiksha"),
    SIGMA_APP("Sigma App"),
    SMS("SMS"),
    STANZA_CARE("Stanza Care"),
    STUDENT_APP("Student App"),
    STUDENT_REFERRAL("Student Referral"),
    SULEKHA("Sulekha"),
    UNATTRIBUTED("Unattributed"),
    UTM_SOURCE("utmSource"),
    VANTAGE_CIRCLE("Vantage Circle"),
    WALKINS("Walk-ins"),
    WEBSITE("Website"),
    WEBSITE_COMING_SOON("Website - Coming Soon"),
    WEBSITE_GOOGLE_MAPS("Website, Google Maps"),
    WEBSITE_RESIDENCE_CARD("Website - Residence Card"),
    WEBSITE_RESIDENCE_CARD_RESERVE_NOW("Website - Residence Card Reserve Now"),
    WEBSITE_RESIDENCE_CARD_SCHEDULE_VISIT("Website - Residence Card Schedule Visit"),
    WEBSITE_VISIT("WebSite Visit"),
    WHATSAPP("Whatsapp"),
    WHATSAPP_WEBSITE("Whatsapp-Website"),
    ZOHO("zoho");

    private static Map<LeadSourceEnum, String> leadSourceDescMap = new HashMap<>();
    private static Map<String, LeadSourceEnum> leadNameSourceMap = new HashMap<>();

    static {
        for (LeadSourceEnum leadSource : LeadSourceEnum.values()) {
            leadSourceDescMap.put(leadSource, leadSource.getLeadSourceName());
            leadNameSourceMap.put(leadSource.getLeadSourceName(), leadSource);
        }
    }

    private String leadSourceName;

    public static Map<LeadSourceEnum, String> getLeadSources() {
        return leadSourceDescMap;
    }

    public static LeadSourceEnum getLeadSourceEnumByName(String name) {
        return leadNameSourceMap.getOrDefault(name, SIGMA_APP);
    }

}