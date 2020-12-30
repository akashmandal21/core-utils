package com.stanzaliving.core.po.generic.enums;

import com.stanzaliving.core.generic.constants.GenericConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.*;

@Getter
@AllArgsConstructor
public enum GenericPOTOStatus {
    IN_DRAFT("In Draft","#7A7D7E","#7a7d7e4d",-1,false,false,null),
    L1_APPROVAL_DUE("L1 Approval Due","#FFB701","#ffb7014d",0,false,false,ApprovalCycle.NORMAL),
    L2_APPROVAL_DUE("L2 Approval Due","#FFB701","#ffb7014d",1,false,false,ApprovalCycle.NORMAL),
    L3_APPROVAL_DUE("L3 Approval Due","#FFB701","#ffb7014d",2,false,false,ApprovalCycle.NORMAL),
    L1_SENT_BACK("L1 Sent Back","#F55F71","#f55f714d", GenericConstants.rejectionStart-1,false,false,null),
    L2_SENT_BACK("L2 Sent Back","#F55F71","#f55f714d",GenericConstants.rejectionStart-2,false,false,null),
    L3_SENT_BACK("L3 Sent Back","#F55F71","#f55f714d",GenericConstants.rejectionStart-3,false,false,null),

    //underShortCloseCycle =true
    SC_L1_APPROVAL_DUE("SC L1 Approval Due","#DEB76A","#deb76a4d",0,true,false,ApprovalCycle.SHORTCLOSE),
    SC_L2_APPROVAL_DUE("SC L2 Approval Due","#DEB76A","#deb76a4d",1,true,false,ApprovalCycle.SHORTCLOSE),
    SC_L3_APPROVAL_DUE("SC L3 Approval Due","#DEB76A","#deb76a4d",2,true,false,ApprovalCycle.SHORTCLOSE),
    SC_L1_REJECTED("SC L1 Rejected","#FF5238","#ff52384d",GenericConstants.rejectionStart-1,false,false,null),
    SC_L2_REJECTED("SC L2 Rejected","#FF5238","#ff52384d",GenericConstants.rejectionStart-2,false,false,null),
    SC_L3_REJECTED("SC L3 Rejected","#FF5238","#ff52384d",GenericConstants.rejectionStart-3,false,false,null),

    //underCancelCycle =true
    CANCEL_L1_APPROVAL_DUE("Cancel L1 Due","#4B87E3","#E4EDFB",0,false,true,ApprovalCycle.CANCEL),
    CANCEL_L2_APPROVAL_DUE("Cancel L2 Due","#4B87E3","#E4EDFB",1,false,true,ApprovalCycle.CANCEL),
    CANCEL_L3_APPROVAL_DUE("Cancel L3 Due","#4B87E3","#E4EDFB",2,false,true,ApprovalCycle.CANCEL),
    CANCEL_L1_REJECTED("Cancel L1 Rejected","#F55F71","#f55f714d",GenericConstants.rejectionStart-1,false,false,null),
    CANCEL_L2_REJECTED("Cancel L2 Rejected","#F55F71","#f55f714d",GenericConstants.rejectionStart-2,false,false,null),
    CANCEL_L3_REJECTED("Cancel L3 Rejected","#F55F71","#f55f714d",GenericConstants.rejectionStart-3,false,false,null),

    APPROVED("Approved","#60C3AD","#60c3ad4d",3,false,false,null),
    SHORTCLOSED("Shortclosed","#790A00","#790a004d",4,false,false,null),
    CANCELLED("Cancelled","#5C49A2","#5c49a24d",5,false,false,null),
    GSRI_COMPLETED("GSRI Closed","#60C3AD","#60c3ad4d",6,false,false,null);
//    WORK_COMPLETED("Work Completed","#60C3AD","#60c3ad4d",7,false,false);



    private String statusText;
    private String statusColor;
    private String bgColor;
    private Integer order;
    private boolean underShortClose;
    private boolean underCancel;
    private ApprovalCycle cycle;
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
    private static Map<ApprovalCycle,Map<Integer,GenericPOTOStatus>> orderMap = new HashMap<>();

    @Getter
    private static Set<GenericPOTOStatus> viewRole = new HashSet<>();

    static {
        cancelStatus.addAll(Arrays.asList(CANCEL_L1_APPROVAL_DUE,CANCEL_L2_APPROVAL_DUE,CANCEL_L3_APPROVAL_DUE));
        cancelRejectStatus.addAll(Arrays.asList(CANCEL_L1_REJECTED,CANCEL_L2_REJECTED,CANCEL_L3_REJECTED));
        scStatus.addAll(Arrays.asList(SC_L1_APPROVAL_DUE,SC_L2_APPROVAL_DUE,SC_L3_APPROVAL_DUE));
        scRejectStatus.addAll(Arrays.asList(SC_L1_REJECTED,SC_L2_REJECTED,SC_L3_REJECTED));
        scAllowedStatus.addAll(Arrays.asList(CANCEL_L1_REJECTED,CANCEL_L2_REJECTED,CANCEL_L3_REJECTED,APPROVED,SHORTCLOSED,SC_L1_REJECTED,SC_L2_REJECTED,SC_L3_REJECTED));
        firstApprovalStatus.addAll(Arrays.asList(L1_APPROVAL_DUE,L2_APPROVAL_DUE,L3_APPROVAL_DUE));
        firstApprovalCycle.addAll(Arrays.asList(IN_DRAFT,L1_SENT_BACK,L2_SENT_BACK,L3_SENT_BACK,L1_APPROVAL_DUE,L2_APPROVAL_DUE,L3_APPROVAL_DUE));
        firstApprovalRejects.addAll(Arrays.asList(L1_SENT_BACK,L2_SENT_BACK,L3_SENT_BACK));
        approvals.addAll(Arrays.asList(CANCEL_L2_APPROVAL_DUE,CANCEL_L3_APPROVAL_DUE,SC_L2_APPROVAL_DUE,SC_L3_APPROVAL_DUE,L2_APPROVAL_DUE,L3_APPROVAL_DUE,APPROVED,SHORTCLOSED,CANCELLED));
        allValues.addAll(Arrays.asList(CANCEL_L1_APPROVAL_DUE,CANCEL_L2_APPROVAL_DUE,CANCEL_L3_APPROVAL_DUE,SC_L1_APPROVAL_DUE,SC_L2_APPROVAL_DUE,SC_L3_APPROVAL_DUE,IN_DRAFT,
                L1_SENT_BACK,L2_SENT_BACK,L3_SENT_BACK,L1_APPROVAL_DUE,L2_APPROVAL_DUE,L3_APPROVAL_DUE,CANCEL_L1_REJECTED,CANCEL_L2_REJECTED,CANCEL_L3_REJECTED,APPROVED,SHORTCLOSED,
                SC_L1_REJECTED,SC_L2_REJECTED,SC_L3_REJECTED,CANCELLED,GSRI_COMPLETED));
        viewRole.addAll(Arrays.asList(CANCEL_L1_APPROVAL_DUE,CANCEL_L2_APPROVAL_DUE,CANCEL_L3_APPROVAL_DUE,SC_L1_APPROVAL_DUE,SC_L2_APPROVAL_DUE,SC_L3_APPROVAL_DUE,
                L1_SENT_BACK,L2_SENT_BACK,L3_SENT_BACK,L1_APPROVAL_DUE,L2_APPROVAL_DUE,L3_APPROVAL_DUE,CANCEL_L1_REJECTED,CANCEL_L2_REJECTED,CANCEL_L3_REJECTED,APPROVED,SHORTCLOSED,
                SC_L1_REJECTED,SC_L2_REJECTED,SC_L3_REJECTED,CANCELLED,GSRI_COMPLETED));

        allValues.stream().filter(f->f.getCycle()!=null).forEach(f->{
            Map<Integer,GenericPOTOStatus> map = orderMap.getOrDefault(f.getCycle(),new HashMap<>());
            map.put(f.getOrder(),f);
            orderMap.put(f.getCycle(),map);
        });

    }
}
