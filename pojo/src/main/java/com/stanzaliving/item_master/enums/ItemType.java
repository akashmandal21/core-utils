package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum ItemType {

    //Transformations Categories
    BOI("BOI","BOI"),
    GC("GC","GC"),
    ASIS("As-Is","ASIS"),
    COVID("Covid","Covid"),
    OTHER("Others","Others"),

    //Sales Sub categories
    AFFILIATE("Affiliate","Affiliate"),
    ACTIVATIONS("Activations","Activations"),
    AGENCY("Agency","Agency"),
    AUDIO_STREAMING("Audio Streaming","Audio Ads"),
    B2B_RELATIONSHIPS("B2B Relationships","B2B Relationships"),
    COLLATERAL("Collateral","Collateral"),
    ContestsAndAwards("Contests and Awards","Contests and Awards"),
    CRM("CRM","CRM"),
    CREDIT_NOTE("Credit Note","Credit Note"),
    DATABASE_RESEARCH("Database Research","Database"),
    DISPLAY("Display","Displays Ads"),
    EMAIL_MARKETING("Email Marketing","Email Marketing"),
    ENGAGEMENT_ACTIVITY("Engagement Activity","Engagement activity"),
    EVENTS_ACTIVATIONS("Events-Activations","Events-Activations"),
    FACILITATION_CHARGES("Facilitation Charges","Facilitation Charges"),
    INTERN_COST("Intern Cost","Intern Cost"),
    MERCHANDISE("Merchandise","Merchandise"),
    MISCELLANEOUS("Miscellaneous","Miscellaneous"),
    NEW_SALES_DISCOUNT("New Sales Discount","New Sales Discount"),
    NEW_SALES_INCENTIVE("New Sales Incentive","New Sales Incentive"),
    OTHER_SALES("Others","Others"),
    ONLINE_PROMOTIONS("Online Promotions","Online promotions"),
    PARTNERS("Partners","Partners"),
    PARTNERSHIPS("Partnerships","Partnerships"),
    PHOTOGRAPHY_VIDEOGRAPHY("Photography/Videography","Photography/Videography"),
    PRE_SALES_INCENTIVE("Pre-Sales Incentive","Pre-sales Incentive"),
    PROMOTERS_COST("Promoters Cost","Promoters Cost"),
    PRE_SALES_DISCOUNT("Pre-sales Discount","Pre-sales Discount"),
    RETENTION_DISCOUNT("Retention Discount","Retention Discount"),
    RETENTION_INCENTIVE("Retention Incentive","Retention Incentive"),
    SEARCH("Search","Search Ads"),
    SIGNAGE("Signage","Signage"),
    SMS_MARKETING("SMS Marketing","SMS Marketing"),
    SOCIAL("Social","Social"),
    STUDENTS("Students","Students"),
    TELEPHONY("Telephony","Telephony"),
    TEMP_STAFF_COST("Temp Staff Cost","Temp Staff Cost"),
    TRANSIT_MEDIA("Transit Media","Transit Media"),
    VIDEO_STREAMING("Video Streaming","Video Ads"),
    B2B_INCENTIVE("B2B Incentive","B2B Incentive"),
    KITCHEN_EQPT("Kitchen Equipments","Kitchen Equipments"),
    UTENSILS_SW("Utensils and SmallWares","Utensils and SmallWares");


    private String typeText;
    private String newSubCategoryText;

    public static Map<String, ItemType> itemTypeByNameMap = new HashMap<>();
    public static Map<String, ItemType> itemTypeByUpperCaseNameMap = new HashMap<>();

    static {

        for (ItemType itemType : ItemType.values()) {
            itemTypeByNameMap.put(itemType.getTypeText(), itemType);
            itemTypeByUpperCaseNameMap.put(itemType.getNewSubCategoryText().toUpperCase(), itemType);
        }
    }

    public static ItemType getItemTypeByName(String itemTypeName) {
        return itemTypeByNameMap.get(itemTypeName);
    }

}
