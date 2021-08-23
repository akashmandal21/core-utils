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

    //Apartment Flow
    L1_ZH("L1 Zonal Head", "f7aad752-0428-11ec-9a03-0242ac130003", "L1_ZH"),
    L1_SL("L1 SL", "f7aad810-0428-11ec-9a03-0242ac130003", "L1_SL"),
    L2_SL("L2 SL", "f7aad8ce-0428-11ec-9a03-0242ac130003", "L2_SL"),
    SENT_TO_LEGAL("Legal", "f7aad98c-0428-11ec-9a03-0242ac130003", "SENT_TO_LEGAL"),
    ESTATE_LEADERSHIP("Leadership", "f7aadd88-0428-11ec-9a03-0242ac130003", "ESTATE_LEADERSHIP"),
    LEGAL_DUE_DILIGENCE("Legal Due Diligence", "f7aade6e-0428-11ec-9a03-0242ac130003", "LEGAL_DUE_DILIGENCE"),
    SENT_TO_PROPERTY_NAMING("Property Naming", "f7aadf22-0428-11ec-9a03-0242ac130003", "SENT_TO_PROPERTY_NAMING");

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
        return apartmentPropertyActions;
    }

    public static List<KeyValueDto> getPropertyActionForSociety() {
        final List<KeyValueDto> societyPropertyActions=new ArrayList<>();
        societyPropertyActions.add(new KeyValueDto(L1_SL.getAlias(),L1_SL.uuid));
        return societyPropertyActions;
    }



}
