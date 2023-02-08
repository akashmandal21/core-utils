package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum LeadSourceEnum {

    ADITYA_REFERRAL("Aditya Referral", LeadSourceGroupEnum.REFERRAL),
    ABOUT_US("About us", LeadSourceGroupEnum.DIGITAL),
    AMC_BANNERGHATT("AMC Bannerghatt", LeadSourceGroupEnum.OTHERS),
    ALFRED_TRUECALLER("Alfred-Truecaller", LeadSourceGroupEnum.RESIDENT_APP),
    APARTMENT_LEAD_LP_FORM("Apartment Lead LP Form", LeadSourceGroupEnum.DIGITAL),
    BETA_TEST_1("betatest1", LeadSourceGroupEnum.OTHERS),
    BLOG_PAGE("Blog Page", LeadSourceGroupEnum.DIGITAL),
    BROKER_APP("Broker App", LeadSourceGroupEnum.BROKER_EBI),
    BVP_LATERAL("BVP Lateral", LeadSourceGroupEnum.OTHERS),
    CHAT("Chat", LeadSourceGroupEnum.DIGITAL),
    CHATBOT("Chatbot", LeadSourceGroupEnum.DIGITAL),
    CHRIST_DELHI_ACTIVITY("Christ-Delhi-Activity", LeadSourceGroupEnum.SIGMA_APP),
    CITY_TEAM("City Team", LeadSourceGroupEnum.SIGMA_APP),
    COLLEGE_DUNIA("Collegedunia", LeadSourceGroupEnum.AFFILIATE),
    COLLEGE_EVENT("College Event", LeadSourceGroupEnum.SIGMA_APP),
    CONSUMER_APP("ConsumerApp", LeadSourceGroupEnum.REFERRAL),
    CONTACT_US_PAGE("Contact us page", LeadSourceGroupEnum.DIGITAL),
    COOKIE_POLICY_PAGE("Cookie Policy Page", LeadSourceGroupEnum.DIGITAL),
    CORPORATE_ACTIVATION("Corporate Activation", LeadSourceGroupEnum.SIGMA_APP),
    COVid("CoVid", LeadSourceGroupEnum.DIGITAL),
    COVID_COMMUNICATION("Covid Communication", LeadSourceGroupEnum.DIGITAL),
    COVID_MWEB("covid-mweb", LeadSourceGroupEnum.DIGITAL),
    COVID_PAGE("Covid Page", LeadSourceGroupEnum.DIGITAL),
    DATABASE("Database", LeadSourceGroupEnum.DATABASE),
    DATABASE_AVINASH("Database Avinash", LeadSourceGroupEnum.DATABASE),
    DATABASE_BRACKET_AVINASH("Database (Avinash)", LeadSourceGroupEnum.DATABASE),
    DATABASE_BRACKET_HYDERABAD_VRN("Database (Hyderabad VRN)", LeadSourceGroupEnum.DATABASE),
    DATABASE_BRACKET_PARUL("Database (Parul)", LeadSourceGroupEnum.DATABASE),
    DATABASE_HYDERABAD_VRN("Database Hyderabad VRN", LeadSourceGroupEnum.DATABASE),
    DATABASE_PARUL("Database Parul", LeadSourceGroupEnum.DATABASE),
    DATABSE_INDORE("Database - Indore", LeadSourceGroupEnum.DATABASE),
    DAVV_DATABASE("DAVV Database", LeadSourceGroupEnum.DATABASE),
    DETAILS_PAGE("Details Page", LeadSourceGroupEnum.DIGITAL),
    DIRECT_WALK_IN("Direct Walk-in", LeadSourceGroupEnum.SIGMA_APP),
    DU_BEAT("DU Beat", LeadSourceGroupEnum.SIGMA_APP),
    DU_UPDATES("DU Updates", LeadSourceGroupEnum.DATABASE),
    EMPTY("Empty", LeadSourceGroupEnum.OTHERS),
    FACEBOOK("Facebook", LeadSourceGroupEnum.DIGITAL),
    FACEBOOK_AD("facebook ad", LeadSourceGroupEnum.DIGITAL),
    FAQ_PAGE("Faq Page", LeadSourceGroupEnum.DIGITAL),
    FB_LEAD_GEN("Fb Lead Gen", LeadSourceGroupEnum.DIGITAL),
    FILTER_COPY("Filtercopy", LeadSourceGroupEnum.AFFILIATE),
    FIND_MY_ROOM("Find my room", LeadSourceGroupEnum.AFFILIATE),
    FLAT_AND_FLATMATES("Flat and flatmates", LeadSourceGroupEnum.AFFILIATE),
    FLAT_URL("Flat Url", LeadSourceGroupEnum.DIGITAL),
    FLP("FLP", LeadSourceGroupEnum.DIGITAL),
    FLYERS("Flyers", LeadSourceGroupEnum.SIGMA_APP),
    GOOGLE("google", LeadSourceGroupEnum.DIGITAL),
    GOOGLE_ADS("google ads", LeadSourceGroupEnum.DIGITAL),
    GOOGLE_MAPS("Google Maps", LeadSourceGroupEnum.DIGITAL),
    GOOGLE_PLAY_STORE("Google Play Store", LeadSourceGroupEnum.DIGITAL),
    HOME_PAGE("Home Page", LeadSourceGroupEnum.DIGITAL),
    HOTSTAR("Hotstar", LeadSourceGroupEnum.DIGITAL),
    HOUSE_RULES_PAGE("House rules page", LeadSourceGroupEnum.DIGITAL),
    HOUSING("Housing", LeadSourceGroupEnum.AFFILIATE),
    HYDERABAD_LATERAL("Hyderabad- Lateral", LeadSourceGroupEnum.SIGMA_APP),
    INBOUND_CALL("Inbound Call", LeadSourceGroupEnum.DIGITAL),
    INSTAGRAM("Instagram", LeadSourceGroupEnum.DIGITAL),
    INVESTORS_PAGE("Investors Page", LeadSourceGroupEnum.DIGITAL),
    JUST_DIAL("Just Dial", LeadSourceGroupEnum.AFFILIATE),
    JUSTDIAL("Justdial", LeadSourceGroupEnum.AFFILIATE),
    LEAD_LP("Lead LP", LeadSourceGroupEnum.DIGITAL),
    LEAD_LP_FORM_1("Lead LP-form-1", LeadSourceGroupEnum.DIGITAL),
    LEAD_LP_FORM_2("Lead LP-form-2", LeadSourceGroupEnum.DIGITAL),
    LEAD_LP_FORM_3("Lead LP-form-3", LeadSourceGroupEnum.DIGITAL),
    LISTING_PAGE("Listing Page", LeadSourceGroupEnum.DIGITAL),
    MAGIC_BRICKS("Magicbricks", LeadSourceGroupEnum.AFFILIATE),
    MAGIC_BRICKS_2("Magicbricks-2", LeadSourceGroupEnum.AFFILIATE),
    MAKAAN("Makaan", LeadSourceGroupEnum.AFFILIATE),
    MEDIA_PAGE("Media Page", LeadSourceGroupEnum.DIGITAL),
    MICROSITE("Microsite", LeadSourceGroupEnum.DIGITAL),
    NINETY_NINE_ACRES("99Acres", LeadSourceGroupEnum.AFFILIATE),
    NO_BROKER("No Broker", LeadSourceGroupEnum.AFFILIATE),
    OFFLINE("Offline", LeadSourceGroupEnum.SIGMA_APP),
    OLX("OLX", LeadSourceGroupEnum.AFFILIATE),
    ON_GROUND("On Ground", LeadSourceGroupEnum.SIGMA_APP),
    ONLINE("Online", LeadSourceGroupEnum.OTHERS),
    PAGE_404("404 Page", LeadSourceGroupEnum.OTHERS),
    PARTNER_PAGE("Partner page", LeadSourceGroupEnum.DIGITAL),
    PG_LEAD_LP_FORM_4("PG lead lp-form-4", LeadSourceGroupEnum.DIGITAL),
    PHONE_PE("PhonePe", LeadSourceGroupEnum.OTHERS),
    PREBOOKING("Prebooking", LeadSourceGroupEnum.DIGITAL),
    PREBOOKING_VIRTUAL_TOUR("Prebooking-Virtual Tour", LeadSourceGroupEnum.DIGITAL),
    PRESIDENCY_YELAHANKA("Presidency Yelahanka", LeadSourceGroupEnum.SIGMA_APP),
    PRIVACY_POLICY("Privacy Policy", LeadSourceGroupEnum.DIGITAL),
    PROMOTER("Promoter", LeadSourceGroupEnum.SIGMA_APP),
    PROMOTER_ACTIVATION("Promoter Activation", LeadSourceGroupEnum.SIGMA_APP),
    PROPERTY_WALA_ORGANIC("Property Wala (Organic)", LeadSourceGroupEnum.DIGITAL),
    PUBLICATION("Publication", LeadSourceGroupEnum.DIGITAL),
    QUICKR("Quikr", LeadSourceGroupEnum.AFFILIATE),
    QUORA("Quora", LeadSourceGroupEnum.DIGITAL),
    REFERRAL_PAGE("Referral Page", LeadSourceGroupEnum.DIGITAL),
    REFUND_PAGE("Refund Page", LeadSourceGroupEnum.DIGITAL),
    RESIDENCE_APP("Resident App", LeadSourceGroupEnum.REFERRAL),
    RESIDENCE_PAGE("Residence Page", LeadSourceGroupEnum.DIGITAL),
    RESIDENCE_SEARCH_PAGE("Residence Search Page", LeadSourceGroupEnum.DIGITAL),
    SALES_APP("Sales App", LeadSourceGroupEnum.SIGMA_APP),
    SHIKSHA("Shiksha", LeadSourceGroupEnum.AFFILIATE),
    SIGMA_APP("Sigma App", LeadSourceGroupEnum.SIGMA_APP),
    SMS("SMS", LeadSourceGroupEnum.OTHERS),
    STANZA_CARE("Stanza Care", LeadSourceGroupEnum.OTHERS),
    STUDENT_APP("Student App", LeadSourceGroupEnum.REFERRAL),
    STUDENT_REFERRAL("Student Referral", LeadSourceGroupEnum.REFERRAL),
    SULEKHA("Sulekha", LeadSourceGroupEnum.AFFILIATE),
    TEAMS_PAGE("Teams page", LeadSourceGroupEnum.DIGITAL),
    TERMS_CONDITION_PAGE("Terms Condition Page", LeadSourceGroupEnum.DIGITAL),
    TENANTO("Tenanto", LeadSourceGroupEnum.AFFILIATE),
    UNATTRIBUTED("Unattributed", LeadSourceGroupEnum.OTHERS),
    UTM_SOURCE("utmSource", LeadSourceGroupEnum.OTHERS),
    VANTAGE_CIRCLE("Vantage Circle", LeadSourceGroupEnum.AFFILIATE),
    WALKINS("Walk-ins", LeadSourceGroupEnum.SIGMA_APP),
    WEBSITE("Website", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_COMING_SOON("Website - Coming Soon", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_GOOGLE_MAPS("Website, Google Maps", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_RESIDENCE_CARD("Website - Residence Card", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_RESIDENCE_CARD_RESERVE_NOW("Website - Residence Card Reserve Now", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_RESIDENCE_CARD_SCHEDULE_VISIT("Website - Residence Card Schedule Visit", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_RESIDENCE_PAGE_VS_FORM("Website - Residence Page Vs Form", LeadSourceGroupEnum.DIGITAL),
    WEBSITE_VISIT("WebSite Visit", LeadSourceGroupEnum.DIGITAL),
    WHATSAPP("Whatsapp", LeadSourceGroupEnum.DIGITAL),
    WHATSAPP_WEBSITE("Whatsapp-Website", LeadSourceGroupEnum.DIGITAL),
    WISHLIST_PAGE("Wishlist Page", LeadSourceGroupEnum.DIGITAL),
    ZOHO("zoho", LeadSourceGroupEnum.OTHERS),
    UNLOCK_DISCOUNT_FORM("Website-Discount", LeadSourceGroupEnum.DIGITAL);;

    private static Map<LeadSourceEnum, String> leadSourceDescMap = new HashMap<>();
    private static Map<String, LeadSourceEnum> leadNameSourceMap = new HashMap<>();

    static {
        for (LeadSourceEnum leadSource : LeadSourceEnum.values()) {
            leadSourceDescMap.put(leadSource, leadSource.getLeadSourceName());
            leadNameSourceMap.put(leadSource.getLeadSourceName(), leadSource);
        }
    }

    private String leadSourceName;
    private LeadSourceGroupEnum leadSourceGroupEnum;

    public static Map<LeadSourceEnum, String> getLeadSources() {
        return leadSourceDescMap;
    }

    public static LeadSourceEnum getLeadSourceEnumByName(String name) {
        return leadNameSourceMap.getOrDefault(name, SIGMA_APP);
    }

    public static List<LeadSourceEnum> getPrebookingLeadSources() {
        return Arrays.asList(LeadSourceEnum.PREBOOKING, LeadSourceEnum.PREBOOKING_VIRTUAL_TOUR);
    }

    public static List<LeadSourceEnum> getBrokerLeadSources() {
        LeadSourceEnum[] allLeadSource = LeadSourceEnum.values();
        List<LeadSourceEnum> brokerLeadSources = new ArrayList<>();
        for (LeadSourceEnum leadSourceEnum : allLeadSource) {
            if (leadSourceEnum.getLeadSourceGroupEnum() == LeadSourceGroupEnum.BROKER_EBI) {
                brokerLeadSources.add(leadSourceEnum);
            }
        }
        return brokerLeadSources;
    }

    public static List<LeadSourceEnum> getReferralLeadSources() {
        LeadSourceEnum[] allLeadSource = LeadSourceEnum.values();
        List<LeadSourceEnum> referralLeadSources = new ArrayList<>();
        for (LeadSourceEnum leadSourceEnum : allLeadSource) {
            if (leadSourceEnum.getLeadSourceGroupEnum() == LeadSourceGroupEnum.REFERRAL) {
                referralLeadSources.add(leadSourceEnum);
            }
        }
        return referralLeadSources;
    }

}