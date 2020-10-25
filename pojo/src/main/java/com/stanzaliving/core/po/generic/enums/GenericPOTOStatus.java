package com.stanzaliving.core.po.generic.enums;

import com.stanzaliving.core.generic.constants.GenericConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenericPOTOStatus {
    IN_DRAFT("In Draft","#7A7D7E","#7a7d7e4d",-1),
    L1_APPROVAL_DUE("L1 Approval Due","#FFB701","#ffb7014d",0),
    L2_APPROVAL_DUE("L2 Approval Due","#FFB701","#ffb7014d",1),
    L3_APPROVAL_DUE("L3 Approval Due","#FFB701","#ffb7014d",2),
    L1_SENT_BACK("L1 Sent Back","#F55F71","#f55f714d", GenericConstants.rejectionStart-1),
    L2_SENT_BACK("L2 Sent Back","#F55F71","#f55f714d",GenericConstants.rejectionStart-2),
    L3_SENT_BACK("L3 Sent Back","#F55F71","#f55f714d",GenericConstants.rejectionStart-3),

    //underShortCloseCycle =true
    SC_L1_APPROVAL_DUE("SC L1 Approval Due","#DEB76A","#deb76a4d",0),
    SC_L2_APPROVAL_DUE("SC L2 Approval Due","#DEB76A","#deb76a4d",1),
    SC_L3_APPROVAL_DUE("SC L3 Approval Due","#DEB76A","#deb76a4d",2),
    SC_L1_REJECTED("SC L1 Rejected","#FF5238","#ff52384d",GenericConstants.rejectionStart-1),
    SC_L2_REJECTED("SC L2 Approval Due","#FF5238","#ff52384d",GenericConstants.rejectionStart-2),
    SC_L3_REJECTED("SC L3 Approval Due","#FF5238","#ff52384d",GenericConstants.rejectionStart-3),

    //underCancelCycle =true
    CANCEL_L1_APPROVAL_DUE("Cancel L1 Due","#4B87E3","#E4EDFB",0),
    CANCEL_L2_APPROVAL_DUE("Cancel L2 Due","#4B87E3","#E4EDFB",1),
    CANCEL_L3_APPROVAL_DUE("Cancel L3 Due","#4B87E3","#E4EDFB",2),
    CANCEL_L1_REJECTED("L1 Approval Due","#F55F71","#f55f714d",GenericConstants.rejectionStart-1),
    CANCEL_L2_REJECTED("L2 Approval Due","#F55F71","#f55f714d",GenericConstants.rejectionStart-2),
    CANCEL_L3_REJECTED("L3 Approval Due","#F55F71","#f55f714d",GenericConstants.rejectionStart-3),

    APPROVED("L1 Approval Due","#60C3AD","#60c3ad4d",3),
    SHORTCLOSED("L1 Approval Due","#790A00","#790a004d",4),
    CANCELLED("L1 Approval Due","#5C49A2","#5c49a24d",5),
    GSRI_COMPLETED("GSRI Closed","#60C3AD","#60c3ad4d",6);



    private String statusText;
    private String statusColor;
    private String bgColor;
    private Integer order;
}
