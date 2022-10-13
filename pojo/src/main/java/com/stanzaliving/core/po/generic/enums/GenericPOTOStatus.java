package com.stanzaliving.core.po.generic.enums;

import com.stanzaliving.core.generic.constants.GenericConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum GenericPOTOStatus {

    IN_DRAFT("In Draft", "#7A7D7E", "#E6E9EA", -1, false, false, null,false),
    L1_APPROVAL_DUE("L1 Approval Due", "#FFB701", "#FFEAB6", 0, false, false, ApprovalCycle.NORMAL,false),
    L2_APPROVAL_DUE("L2 Approval Due", "#FFB701", "#FFEAB6", 1, false, false, ApprovalCycle.NORMAL,false),
    L3_APPROVAL_DUE("L3 Approval Due", "#FFB701", "#FFEAB6", 2, false, false, ApprovalCycle.NORMAL,false),
    L1_SENT_BACK("L1 Sent Back", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 1, false, false, null,false),
    L2_SENT_BACK("L2 Sent Back", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 2, false, false, null,false),
    L3_SENT_BACK("L3 Sent Back", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 3, false, false, null,false),

    //underShortCloseCycle =true
    SC_L1_APPROVAL_DUE("SC L1 Approval Due", "#FFB701", "#FFEAB6", 0, true, false, ApprovalCycle.SHORTCLOSE,true),
    SC_L2_APPROVAL_DUE("SC L2 Approval Due", "#FFB701", "#FFEAB6", 1, true, false, ApprovalCycle.SHORTCLOSE,true),
    SC_L3_APPROVAL_DUE("SC L3 Approval Due", "#FFB701", "#FFEAB6", 2, true, false, ApprovalCycle.SHORTCLOSE,true),
    SC_L1_REJECTED("SC L1 Rejected", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 1, false, false, null,true),
    SC_L2_REJECTED("SC L2 Rejected", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 2, false, false, null,true),
    SC_L3_REJECTED("SC L3 Rejected", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 3, false, false, null,true),

    //underCancelCycle =true
    CANCEL_L1_APPROVAL_DUE("Cancel L1 Due", "#FFB701", "#FFEAB6", 0, false, true, ApprovalCycle.CANCEL,true),
    CANCEL_L2_APPROVAL_DUE("Cancel L2 Due", "#FFB701", "#FFEAB6", 1, false, true, ApprovalCycle.CANCEL,true),
    CANCEL_L3_APPROVAL_DUE("Cancel L3 Due", "#FFB701", "#FFEAB6", 2, false, true, ApprovalCycle.CANCEL,true),
    CANCEL_L1_REJECTED("Cancel L1 Rejected", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 1, false, false, null,true),
    CANCEL_L2_REJECTED("Cancel L2 Rejected", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 2, false, false, null,true),
    CANCEL_L3_REJECTED("Cancel L3 Rejected", "#FF5238", "#FFE5E1", GenericConstants.rejectionStart - 3, false, false, null,true),

    APPROVED("Approved", "#60C3AD", "#EDFFF5", 3, false, false, null,true),
    SHORTCLOSED("Shortclosed", "#5F11D7", "#F4EEFF", 4, false, false, null,true),
    CANCELLED("Cancelled", "#5FC4F5", "#EDF4FF", 5, false, false, null,false),
    GSRI_COMPLETED("GSRI Closed", "#37CF76", "#EFF9F6", 6, false, false, null,true),
    //todo check for order number

    VENDOR_ACCEPTANCE_PENDING("Vendor Acceptance Pending", "#FFB701", "#FFEAB6", 2, false, false, null,false),
    VENDOR_ACCEPTED("Accepted By Vendor", "#60C3AD", "#EDFFF5", 3, false, false, null,true),
    VENDOR_REJECTED("Rejected By Vendor", "#FF5238", "#FFE5E1", 5, false, false, null,false),
    SHORTCLOSE_REQUESTED("Shortclose Requested", "#5F11D7", "#F4EEFF", 0, true, false, null,false);

//    WORK_COMPLETED("Work Completed","#60C3AD","#60c3ad4d",7,false,false);

    private String statusText;
    private String statusColor;
    private String bgColor;
    private Integer order;
    private boolean underShortClose;
    private boolean underCancel;
    private ApprovalCycle cycle;
    private boolean visibleInGrn;

    @Getter
    private static Set<GenericPOTOStatus> cancelStatus = new HashSet<>(5);

    @Getter
    private static Set<GenericPOTOStatus> cancelRejectStatus = new HashSet<>(5);

    @Getter
    private static Set<GenericPOTOStatus> scStatus = new HashSet<>(5);

    @Getter
    private static Set<GenericPOTOStatus> scRejectStatus = new HashSet<>(5);

    @Getter
    private static Set<GenericPOTOStatus> scAllowedStatus = new HashSet<>(10);

    @Getter
    private static Set<GenericPOTOStatus> firstApprovalStatus = new HashSet<>(3);

    @Getter
    private static Set<GenericPOTOStatus> firstApprovalCycle = new HashSet<>(10);

    @Getter
    private static Set<GenericPOTOStatus> firstApprovalRejects = new HashSet<>(5);

    @Getter
    private static Set<GenericPOTOStatus> approvals = new HashSet<>(10);

    @Getter
    private static Set<GenericPOTOStatus> allValues = new HashSet<>();

    @Getter
    private static Map<ApprovalCycle, Map<Integer, GenericPOTOStatus>> orderMap = new HashMap<>();

    @Getter
    private static final Map<Integer,GenericPOTOStatus> firstApprovalOrderStatusMap = new HashMap<>();

    @Getter
    private static final Map<Integer,GenericPOTOStatus> cancelOrderStatusMap = new HashMap<>();

    @Getter
    private static final Map<Integer,GenericPOTOStatus> shortCloseOrderStatusMap  =  new HashMap<>();
    @Getter
    private static Set<GenericPOTOStatus> viewRole = new HashSet<>();

    static {
        cancelStatus.addAll(Arrays.asList(CANCEL_L1_APPROVAL_DUE, CANCEL_L2_APPROVAL_DUE, CANCEL_L3_APPROVAL_DUE));
        cancelRejectStatus.addAll(Arrays.asList(CANCEL_L1_REJECTED, CANCEL_L2_REJECTED, CANCEL_L3_REJECTED));
        scStatus.addAll(Arrays.asList(SC_L1_APPROVAL_DUE, SC_L2_APPROVAL_DUE, SC_L3_APPROVAL_DUE, SHORTCLOSE_REQUESTED));
        scRejectStatus.addAll(Arrays.asList(SC_L1_REJECTED, SC_L2_REJECTED, SC_L3_REJECTED));
        scAllowedStatus.addAll(Arrays.asList(CANCEL_L1_REJECTED, CANCEL_L2_REJECTED, CANCEL_L3_REJECTED, APPROVED, SHORTCLOSED, SC_L1_REJECTED, SC_L2_REJECTED, SC_L3_REJECTED, VENDOR_ACCEPTED));
        firstApprovalStatus.addAll(Arrays.asList(L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE));
        firstApprovalCycle.addAll(Arrays.asList(IN_DRAFT, L1_SENT_BACK, L2_SENT_BACK, L3_SENT_BACK, L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE, VENDOR_REJECTED));
        firstApprovalRejects.addAll(Arrays.asList(L1_SENT_BACK, L2_SENT_BACK, L3_SENT_BACK, VENDOR_REJECTED));
        approvals.addAll(Arrays.asList(CANCEL_L2_APPROVAL_DUE, CANCEL_L3_APPROVAL_DUE, SC_L2_APPROVAL_DUE, SC_L3_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE, APPROVED, SHORTCLOSED, CANCELLED, VENDOR_ACCEPTANCE_PENDING, VENDOR_ACCEPTED, VENDOR_REJECTED));
        allValues.addAll(Arrays.asList(CANCEL_L1_APPROVAL_DUE, CANCEL_L2_APPROVAL_DUE, CANCEL_L3_APPROVAL_DUE, SC_L1_APPROVAL_DUE, SC_L2_APPROVAL_DUE, SC_L3_APPROVAL_DUE, IN_DRAFT,
                L1_SENT_BACK, L2_SENT_BACK, L3_SENT_BACK, L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE, CANCEL_L1_REJECTED, CANCEL_L2_REJECTED, CANCEL_L3_REJECTED, APPROVED, SHORTCLOSED,
                SC_L1_REJECTED, SC_L2_REJECTED, SC_L3_REJECTED, CANCELLED, GSRI_COMPLETED, VENDOR_ACCEPTANCE_PENDING, VENDOR_ACCEPTED, VENDOR_REJECTED, SHORTCLOSE_REQUESTED));
        viewRole.addAll(Arrays.asList(CANCEL_L1_APPROVAL_DUE, CANCEL_L2_APPROVAL_DUE, CANCEL_L3_APPROVAL_DUE, SC_L1_APPROVAL_DUE, SC_L2_APPROVAL_DUE, SC_L3_APPROVAL_DUE,
                L1_SENT_BACK, L2_SENT_BACK, L3_SENT_BACK, L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE, CANCEL_L1_REJECTED, CANCEL_L2_REJECTED, CANCEL_L3_REJECTED, APPROVED, SHORTCLOSED,
                SC_L1_REJECTED, SC_L2_REJECTED, SC_L3_REJECTED, CANCELLED, GSRI_COMPLETED, VENDOR_ACCEPTANCE_PENDING, VENDOR_ACCEPTED, VENDOR_REJECTED, SHORTCLOSE_REQUESTED));

        allValues.stream().filter(f -> f.getCycle() != null).forEach(f -> {
            Map<Integer, GenericPOTOStatus> map = orderMap.getOrDefault(f.getCycle(), new HashMap<>());
            map.put(f.getOrder(), f);
            orderMap.put(f.getCycle(), map);
        });

        for (GenericPOTOStatus status : firstApprovalStatus) {
            if(status != VENDOR_ACCEPTANCE_PENDING) {
                firstApprovalOrderStatusMap.put(status.getOrder(), status);
            }
        }

        for(GenericPOTOStatus status : cancelStatus ){
            cancelOrderStatusMap.put(status.getOrder(),status);

        }

        for(GenericPOTOStatus status : scStatus ){
            shortCloseOrderStatusMap.put(status.getOrder(),status);

        }
    }

    public static int getLevel(GenericPOTOStatus genericPOTOStatus) {
        return genericPOTOStatus.getOrder() >= 0 ? (genericPOTOStatus.getOrder()) + 1 : Math.abs(genericPOTOStatus.getOrder() - GenericConstants.rejectionStart);
    }

    public static GenericPOTOStatus getStatusByOrder(int statusOrder){

       return firstApprovalOrderStatusMap.get(statusOrder);
    }

    public static GenericPOTOStatus getCancelStatusByOrder(int statusOrder){

        return cancelOrderStatusMap.get(statusOrder);
    }

    public static GenericPOTOStatus getShortClosedlStatusByOrder(int statusOrder){

        return shortCloseOrderStatusMap.get(statusOrder);
    }
}

