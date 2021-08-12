package com.stanzaliving.estate_v2.enumeration;

import com.stanzaliving.core.estate.enums.EstateStatus;
import lombok.Getter;

import java.util.*;
@Getter
public enum EstateV2Status {

    DRAFT_IN_PROGRESS("Under Draft"),
    SENT_FOR_APPROVAL_TO_CITY_HEAD("L1 Sent To RM"),
    SENT_BACK_BY_CITY_HEAD("Sent Back BY "),
    SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD("L1 Sent To NH"),
    SENT_BACK_L1_BY_NATIONAL_HEAD("Sent Back By NH"),
    SENT_FOR_L1_APPROVAL_TO_LEADERSHIP("L1 Sent To Andy"),
    SENT_BACK_L1_BY_LEADERSHIP("L1 Sent Back By Leadership"),
    APPROVED_L1_BY_LEADERSHIP("L1 Approved By Leadership"),
    SENT_FOR_APPROVAL("L2 Sent To NH & DH"),
    SENT_FOR_NH_DH_APPROVED("Pending L2 NH approval"),
    SENT_BACK_L2_BY_NATIONAL_HEAD("L2 Sent Back By NH"),
    SENT_FOR_DH_NH_APPROVED("Pending L2 DH approval"),
    SENT_BACK_BY_TRANSFORMATION("Sent Back By Transformation"),
    SENT_FOR_SANDEEP_APPROVAL("Sent For Sandeep's approval"),
    SENT_BACK_BY_SANDEEP("Sent Back By Sandeep"),
    SIGNED_ATL_UPLOADED("Sent For Property Naming"),
    APPROVED_BY_LEADERSHIP("Property Naming Done"),


    //Initial Bed Test

    SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES("L1+DF Sent To RM"),
    PENDING_DESIGN_FILES("Pending Design Files"),
    PENDING_INITIAL_BED_COUNT("Pending Initial Bed Count"),
    SENT_BACK_FROM_INITIAL_BED_COUNT("Sent Back From Initial Bed Count"),

    //Sales Review
    SENT_FOR_APPROVAL_TO_CLUSTER_MANAGER("Pending Cluster Manager Approval"),
    SENT_FOR_APPROVAL_TO_ZONAL_HEAD("Pending Zonal Head Approval"),


    //Legal
    SENT_TO_LEGAL("Sent To Legal"),
    ATL_UPLOAD_PENDING("ATL Upload Pending");


    private final String name;

    EstateV2Status(String name) {
        this.name = name;
    }


    public static SortedMap<EstateV2Status, String> getBasicStatusAlpha() {
         final TreeMap<EstateV2Status, String> basicStatusAlpha = new TreeMap<>();
        basicStatusAlpha.put(DRAFT_IN_PROGRESS, DRAFT_IN_PROGRESS.getName());
        basicStatusAlpha.put(SENT_FOR_APPROVAL_TO_CITY_HEAD, SENT_FOR_APPROVAL_TO_CITY_HEAD.getName());
        basicStatusAlpha.put(SENT_BACK_BY_CITY_HEAD, SENT_BACK_BY_CITY_HEAD.getName());
        basicStatusAlpha.put(SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD, SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD.getName());
        basicStatusAlpha.put(SENT_BACK_L1_BY_NATIONAL_HEAD, SENT_BACK_L1_BY_NATIONAL_HEAD.getName());
        basicStatusAlpha.put(SENT_FOR_L1_APPROVAL_TO_LEADERSHIP, SENT_FOR_L1_APPROVAL_TO_LEADERSHIP.getName());
        basicStatusAlpha.put(SENT_BACK_L1_BY_LEADERSHIP, SENT_BACK_L1_BY_LEADERSHIP.getName());
        basicStatusAlpha.put(APPROVED_L1_BY_LEADERSHIP, APPROVED_L1_BY_LEADERSHIP.getName());
        basicStatusAlpha.put(SENT_FOR_APPROVAL, SENT_FOR_APPROVAL.getName());
        basicStatusAlpha.put(SENT_FOR_NH_DH_APPROVED, SENT_FOR_NH_DH_APPROVED.getName());
        basicStatusAlpha.put(SENT_BACK_L2_BY_NATIONAL_HEAD, SENT_BACK_L2_BY_NATIONAL_HEAD.getName());
        basicStatusAlpha.put(SENT_FOR_DH_NH_APPROVED, SENT_FOR_DH_NH_APPROVED.getName());
        basicStatusAlpha.put(SENT_BACK_BY_TRANSFORMATION,SENT_BACK_BY_TRANSFORMATION .getName());
        basicStatusAlpha.put(SENT_FOR_SANDEEP_APPROVAL,SENT_FOR_SANDEEP_APPROVAL .getName());
        basicStatusAlpha.put(SENT_BACK_BY_SANDEEP,SENT_BACK_BY_SANDEEP .getName());
        basicStatusAlpha.put(SIGNED_ATL_UPLOADED,SIGNED_ATL_UPLOADED .getName());
        basicStatusAlpha.put(APPROVED_BY_LEADERSHIP,APPROVED_BY_LEADERSHIP .getName());
        return basicStatusAlpha;
    }

    public static SortedMap<EstateV2Status, String> getInitialBedCountStatus() {
        final TreeMap<EstateV2Status, String> initialBedCountStatus = new TreeMap<>();
        initialBedCountStatus.put(SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES, SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES.getName());
        initialBedCountStatus.put(PENDING_DESIGN_FILES, PENDING_DESIGN_FILES.getName());
        initialBedCountStatus.put(PENDING_INITIAL_BED_COUNT, PENDING_INITIAL_BED_COUNT.getName());
        initialBedCountStatus.put(SENT_BACK_FROM_INITIAL_BED_COUNT, SENT_BACK_FROM_INITIAL_BED_COUNT.getName());
        return initialBedCountStatus;
    }

    public static SortedMap<EstateV2Status, String> getSalesReviewStatus() {
        final TreeMap<EstateV2Status, String> salesReviewStatus = new TreeMap<>();
        salesReviewStatus.put(SENT_FOR_APPROVAL_TO_CLUSTER_MANAGER, SENT_FOR_APPROVAL_TO_CLUSTER_MANAGER.getName());
        salesReviewStatus.put(SENT_FOR_APPROVAL_TO_ZONAL_HEAD, SENT_FOR_APPROVAL_TO_ZONAL_HEAD.getName());
        return salesReviewStatus;
    }

    public static SortedMap<EstateV2Status, String> getLegalStatus() {
        final TreeMap<EstateV2Status, String> legalStatus = new TreeMap<>();
        legalStatus.put(SENT_TO_LEGAL, SENT_TO_LEGAL.getName());
        legalStatus.put(ATL_UPLOAD_PENDING, ATL_UPLOAD_PENDING.getName());
        return legalStatus;
    }





}
