package com.stanzaliving.estate_v2.enumeration;

import com.stanzaliving.estate_v2.dto.StatusDto;
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
    ATL_UPLOAD_PENDING("ATL Upload Pending"),


    //SocietyFlowStatus
    SENT_TO_CH("Sent To CH"),
    SENT_TO_SL("Sent To SL"),
    SOCIETY_APPROVED("Society Approved");

    private final String description;

    EstateV2Status(String description) {
        this.description = description;
    }


    public static List<StatusDto> getBasicStatusAlpha() {
        final List<StatusDto> basicStatusAlpha=new ArrayList<>();
        basicStatusAlpha.add(new StatusDto(DRAFT_IN_PROGRESS.name(), DRAFT_IN_PROGRESS.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_APPROVAL_TO_CITY_HEAD.name(), SENT_FOR_APPROVAL_TO_CITY_HEAD.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_BACK_BY_CITY_HEAD.name(), SENT_BACK_BY_CITY_HEAD.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD.name(), SENT_FOR_L1_APPROVAL_TO_NATIONAL_HEAD.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_BACK_L1_BY_NATIONAL_HEAD.name(), SENT_BACK_L1_BY_NATIONAL_HEAD.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_L1_APPROVAL_TO_LEADERSHIP.name(), SENT_FOR_L1_APPROVAL_TO_LEADERSHIP.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_BACK_L1_BY_LEADERSHIP.name(), SENT_BACK_L1_BY_LEADERSHIP.getDescription()));
        basicStatusAlpha.add(new StatusDto(APPROVED_L1_BY_LEADERSHIP.name(), APPROVED_L1_BY_LEADERSHIP.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_APPROVAL.name(), SENT_FOR_APPROVAL.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_NH_DH_APPROVED.name(), SENT_FOR_NH_DH_APPROVED.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_BACK_L2_BY_NATIONAL_HEAD.name(), SENT_BACK_L2_BY_NATIONAL_HEAD.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_DH_NH_APPROVED.name(), SENT_FOR_DH_NH_APPROVED.getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_BACK_BY_TRANSFORMATION.name(),SENT_BACK_BY_TRANSFORMATION .getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_FOR_SANDEEP_APPROVAL.name(),SENT_FOR_SANDEEP_APPROVAL .getDescription()));
        basicStatusAlpha.add(new StatusDto(SENT_BACK_BY_SANDEEP.name(),SENT_BACK_BY_SANDEEP .getDescription()));
        basicStatusAlpha.add(new StatusDto(SIGNED_ATL_UPLOADED.name(),SIGNED_ATL_UPLOADED .getDescription()));
        basicStatusAlpha.add(new StatusDto(APPROVED_BY_LEADERSHIP.name(),APPROVED_BY_LEADERSHIP .getDescription()));
        return basicStatusAlpha;
    }

    public static List<StatusDto> getInitialBedCountStatus() {
        final List<StatusDto> initialBedCountStatus=new ArrayList<>();
        initialBedCountStatus.add(new StatusDto(SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES.name(), SENT_FOR_APPROVAL_TO_CITY_HEAD_WITH_DESIGN_FILES.getDescription()));
        initialBedCountStatus.add(new StatusDto(PENDING_DESIGN_FILES.name(), PENDING_DESIGN_FILES.getDescription()));
        initialBedCountStatus.add(new StatusDto(PENDING_INITIAL_BED_COUNT.name(), PENDING_INITIAL_BED_COUNT.getDescription()));
        initialBedCountStatus.add(new StatusDto(SENT_BACK_FROM_INITIAL_BED_COUNT.name(), SENT_BACK_FROM_INITIAL_BED_COUNT.getDescription()));
        return initialBedCountStatus;
    }

    public static List<StatusDto> getSalesReviewStatus() {
        final List<StatusDto> salesReviewStatus=new ArrayList<>();
        salesReviewStatus.add(new StatusDto(SENT_FOR_APPROVAL_TO_CLUSTER_MANAGER.name(), SENT_FOR_APPROVAL_TO_CLUSTER_MANAGER.getDescription()));
        salesReviewStatus.add(new StatusDto(SENT_FOR_APPROVAL_TO_ZONAL_HEAD.name(), SENT_FOR_APPROVAL_TO_ZONAL_HEAD.getDescription()));
        return salesReviewStatus;
    }

    public static List<StatusDto> getLegalStatus() {
        final List<StatusDto> legalStatus=new ArrayList<>();
        legalStatus.add(new StatusDto(SENT_TO_LEGAL.name(), SENT_TO_LEGAL.getDescription()));
        legalStatus.add(new StatusDto(ATL_UPLOAD_PENDING.name(), ATL_UPLOAD_PENDING.getDescription()));
        return legalStatus;
    }

    public static List<StatusDto> getSocietyStatus()
    {  final List<StatusDto> gammaStatus=new ArrayList<>();
        gammaStatus.add(new StatusDto(DRAFT_IN_PROGRESS.name(), DRAFT_IN_PROGRESS.getDescription()));
        gammaStatus.add(new StatusDto(SENT_TO_CH.name(), SENT_TO_CH.getDescription()));
        gammaStatus.add(new StatusDto(SENT_TO_SL.name(), SENT_TO_SL.getDescription()));
        gammaStatus.add(new StatusDto(SOCIETY_APPROVED.name(), SOCIETY_APPROVED.getDescription()));
        return gammaStatus;
    }




}
