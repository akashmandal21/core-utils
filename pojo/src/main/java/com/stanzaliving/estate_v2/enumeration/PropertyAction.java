package com.stanzaliving.estate_v2.enumeration;

import com.stanzaliving.estate_v2.dto.KeyValueDto;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public enum PropertyAction {

    //Pg Flow
    L1_NATIONAL_HEAD("L1 National Head", "f7aad022-0428-11ec-9a03-0242ac130003", "L1_NATIONAL_HEAD"),
    L1_TO_LEADERSHIP("L1 Leadership", "f7aad2b6-0428-11ec-9a03-0242ac130003", "L1_TO_LEADERSHIP"),
    L2_NATIONAL_HEAD("L2 National Head", "f7aad3a6-0428-11ec-9a03-0242ac130003", "L2_NATIONAL_HEAD"),
    L2_TRANSFORMATION("L2 Transformation", "f7aad46e-0428-11ec-9a03-0242ac130003", "L2_TRANSFORMATION"),
    L2_PROPERTY_NAMING("Property Naming", "f7aad68a-0428-11ec-9a03-0242ac130003", "L2_PROPERTY_NAMING"),
    SENT_TO_TRANSFORMATION("Sent To Transformation", "7b015d7e-8fce-4bbf-83fc-20e105586bbe", "SENT_TO_TRANSFORMATION"),
    SENT_TO_SANDEEP("Sent To Sandeep ", "9262e77c-eb72-43df-a075-e4b33cf42777", "SENT_TO_SANDEEP"),
    LEGAL_APPROVAL("Legal Approval", "03cd8e05-517f-46b2-949c-8998018edeeb", "SENT_FOR_APPROVAL_TO_LEGAL"),
    CH_APPROVAL("L1 CH ", "154a487a-8512-442c-9002-71068649729e", "SENT_FOR_L1_APPROVAL_TO_CH"),
    ZH_APPROVAL("L2 ZH", "f7aad7a6-0428-11ec-9a03-0242ac130003", "SENT_FOR_L2_APPROVAL_TO_ZH"),
    SENT_TO_TITLE_DOCS("Pending Legal for Title Docs Approval","f7aad7a6-0428-11ec-9a03-0242ac130003","SENT_TO_TITLE_DOCS"),

    //Apartment Flow
    L1_ZH("L1 Zonal Head", "f7aad752-0428-11ec-9a03-0242ac130003", "L1_ZH"),
    L1_SL("L1 SL", "f7aad810-0428-11ec-9a03-0242ac130003", "L1_SL"),
    L2_SL("L2 SL", "f7aad8ce-0428-11ec-9a03-0242ac130003", "L2_SL"),
    SENT_TO_LEGAL("Legal", "f7aad98c-0428-11ec-9a03-0242ac130003", "SENT_TO_LEGAL"),
    ESTATE_LEADERSHIP("Leadership", "f7aadd88-0428-11ec-9a03-0242ac130003", "ESTATE_LEADERSHIP"),
    LEGAL_DUE_DILIGENCE("Legal Due Diligence", "f7aade6e-0428-11ec-9a03-0242ac130003", "LEGAL_DUE_DILIGENCE"),
    SENT_TO_PROPERTY_NAMING("Property Naming", "f7aadf22-0428-11ec-9a03-0242ac130003", "SENT_TO_PROPERTY_NAMING"),
    SENT_TO_LEGAL_FOR_APPROVAL("Sent To Legal For Approval", "f7aadf22-0428-11ec-9a03-0242ac130006", "SENT_TO_LEGAL_FOR_APPROVAL"),
    SENT_TO_SUNIL("Sent To Sunil", "f0cf6014-3205-4bb6-b706-bd38f8d46f59", "SENT_TO_SUNIL"),
    SENT_TO_CH("L1 Sent To CH", "f7aae0a6-0428-11ec-9a03-0242ac130003", "SENT_TO_CH"),

    // Kitchen Flow

    KITCHEN_LO("Kitchen L0", "133b023c-9147-4ad3-8b8b-d0cc3e1bb300", "KITCHEN_LO"),
    KITCHEN_L1("Kitchen L1", "3b0ff0ed-9d1e-4e65-b75d-40fcdb1178e1", "KITCHEN_L1"),
    KITCHEN_L2("Kitchen L2", "a18a5f58-5824-4c1f-932d-3722b8204dfa", "KITCHEN_L2"),
    KITCHEN_L3("Kitchen L3", "ada55ac5-e59a-421e-a28c-176f483d5c68", "KITCHEN_L3"),
    KITCHEN_L4("Kitchen L4", "9436a69e-19ff-4245-abdc-8d1e59587963", "KITCHEN_L4"),
    SENT_TO_KITCHEN_HEAD("Pending Kitchen Head Approval", "408abb8b-0380-4868-9eaa-0ed3ca082ded", "SENT_TO_KITCHEN_HEAD");



    private final String name;
    private final String uuid;
    private final String alias;

    PropertyAction(String name, String uuid, String alias) {
        this.name = name;
        this.uuid = uuid;
        this.alias = alias;
    }


    public static List<KeyValueDto> getPropertyActionForPg() {
        final List<KeyValueDto> pgPropertyActions=new ArrayList<>();
        pgPropertyActions.add(new KeyValueDto(L1_NATIONAL_HEAD.getAlias(),L1_NATIONAL_HEAD.uuid));
        pgPropertyActions.add(new KeyValueDto(L1_TO_LEADERSHIP.getAlias(),L1_TO_LEADERSHIP.uuid));
        pgPropertyActions.add(new KeyValueDto(L2_NATIONAL_HEAD.getAlias(),L2_NATIONAL_HEAD.uuid));
        pgPropertyActions.add(new KeyValueDto(L2_TRANSFORMATION.getAlias(),L2_TRANSFORMATION.uuid));
        pgPropertyActions.add(new KeyValueDto(L2_PROPERTY_NAMING.getAlias(),L2_PROPERTY_NAMING.uuid));
        pgPropertyActions.add(new KeyValueDto(ESTATE_LEADERSHIP.getAlias(),ESTATE_LEADERSHIP.uuid));
        pgPropertyActions.add(new KeyValueDto(SENT_TO_TRANSFORMATION.getAlias(),SENT_TO_TRANSFORMATION.uuid));
        pgPropertyActions.add(new KeyValueDto(SENT_TO_SANDEEP.getAlias(),SENT_TO_SANDEEP.uuid));
        pgPropertyActions.add(new KeyValueDto(SENT_TO_LEGAL.getAlias(),SENT_TO_SANDEEP.uuid));
        pgPropertyActions.add(new KeyValueDto(CH_APPROVAL.getAlias(),SENT_TO_SANDEEP.uuid));
        pgPropertyActions.add(new KeyValueDto(ZH_APPROVAL.getAlias(),ZH_APPROVAL.uuid));
        pgPropertyActions.add(new KeyValueDto(SENT_TO_TITLE_DOCS.getAlias(),SENT_TO_TITLE_DOCS.uuid));
        return pgPropertyActions;
    }

    public static List<KeyValueDto> getPropertyActionForApartment() {
        final List<KeyValueDto> apartmentPropertyActions=new ArrayList<>();
        apartmentPropertyActions.add(new KeyValueDto(L1_ZH.getAlias(),L1_ZH.uuid));
        apartmentPropertyActions.add(new KeyValueDto(L1_SL.getAlias(),L1_SL.uuid));
        apartmentPropertyActions.add(new KeyValueDto(L2_SL.getAlias(),L2_SL.uuid));
        apartmentPropertyActions.add(new KeyValueDto(SENT_TO_LEGAL.getAlias(),SENT_TO_LEGAL.uuid));
        apartmentPropertyActions.add(new KeyValueDto(ESTATE_LEADERSHIP.getAlias(),ESTATE_LEADERSHIP.uuid));
        apartmentPropertyActions.add(new KeyValueDto(LEGAL_DUE_DILIGENCE.getAlias(),LEGAL_DUE_DILIGENCE.uuid));
        apartmentPropertyActions.add(new KeyValueDto(SENT_TO_PROPERTY_NAMING.getAlias(),SENT_TO_PROPERTY_NAMING.uuid));
        apartmentPropertyActions.add(new KeyValueDto(SENT_TO_LEGAL_FOR_APPROVAL.getAlias(), SENT_TO_LEGAL_FOR_APPROVAL.uuid));
        apartmentPropertyActions.add(new KeyValueDto(SENT_TO_SUNIL.getAlias(), SENT_TO_SUNIL.uuid));
        apartmentPropertyActions.add(new KeyValueDto(SENT_TO_CH.getAlias(), SENT_TO_CH.uuid));
        apartmentPropertyActions.add(new KeyValueDto(SENT_TO_TITLE_DOCS.getAlias(), SENT_TO_TITLE_DOCS.uuid));
        return apartmentPropertyActions;
    }

    public static List<KeyValueDto> getPropertyActionForSociety() {
        final List<KeyValueDto> societyPropertyActions=new ArrayList<>();
        societyPropertyActions.add(new KeyValueDto(L1_SL.getAlias(),L1_SL.uuid));
        societyPropertyActions.add(new KeyValueDto(SENT_TO_CH.getAlias(),SENT_TO_CH.uuid));
        return societyPropertyActions;
    }


    public static List<KeyValueDto> getPropertyActionForKitchen() {
        final List<KeyValueDto> kitchenPropertyActions=new ArrayList<>();
        kitchenPropertyActions.add(new KeyValueDto(KITCHEN_LO.getAlias(),KITCHEN_LO.uuid));
        kitchenPropertyActions.add(new KeyValueDto(KITCHEN_L1.getAlias(),KITCHEN_L1.uuid));
        kitchenPropertyActions.add(new KeyValueDto(KITCHEN_L2.getAlias(),KITCHEN_L2.uuid));
        kitchenPropertyActions.add(new KeyValueDto(KITCHEN_L3.getAlias(),KITCHEN_L3.uuid));
        kitchenPropertyActions.add(new KeyValueDto(KITCHEN_L4.getAlias(),KITCHEN_L4.uuid));
        kitchenPropertyActions.add(new KeyValueDto(SENT_TO_KITCHEN_HEAD.getAlias(),SENT_TO_KITCHEN_HEAD.uuid));
        kitchenPropertyActions.add(new KeyValueDto(ESTATE_LEADERSHIP.getAlias(),ESTATE_LEADERSHIP.uuid));
        return kitchenPropertyActions;



    }
}
