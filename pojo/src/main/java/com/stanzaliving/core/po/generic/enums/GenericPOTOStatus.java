package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenericPOTOStatus {
    IN_DRAFT("In Draft","#7A7D7E","#7a7d7e4d"),
    L1_APPROVAL_DUE("L1 Approval Due","#FFB701","#ffb7014d"),
    L2_APPROVAL_DUE("L2 Approval Due","#FFB701","#ffb7014d"),
    L3_APPROVAL_DUE("L3 Approval Due","#FFB701","#ffb7014d"),
    L1_SENT_BACK("L1 Sent Back","#F55F71","#f55f714d"),
    L2_SENT_BACK("L2 Sent Back","#F55F71","#f55f714d"),
    L3_SENT_BACK("L3 Sent Back","#F55F71","#f55f714d"),

    SC_L1_APPROVAL_DUE("SC L1 Approval Due","#DEB76A","#deb76a4d"),
    SC_L2_APPROVAL_DUE("SC L2 Approval Due","#DEB76A","#deb76a4d"),
    SC_L3_APPROVAL_DUE("SC L3 Approval Due","#DEB76A","#deb76a4d"),
    SC_L1_REJECTED("SC L1 Rejected","#FF5238","#ff52384d"),
    SC_L2_REJECTED("SC L2 Approval Due","#FF5238","#ff52384d"),
    SC_L3_REJECTED("SC L3 Approval Due","#FF5238","#ff52384d"),

    CANCEL_L1_APPROVAL_DUE("Cancel L1 Due","#4B87E3","#E4EDFB"),
    CANCEL_L2_APPROVAL_DUE("Cancel L2 Due","#4B87E3","#E4EDFB"),
    CANCEL_L3_APPROVAL_DUE("Cancel L3 Due","#4B87E3","#E4EDFB"),
    CANCEL_L1_REJECTED("L1 Approval Due","#F55F71","#f55f714d"),
    CANCEL_L2_REJECTED("L2 Approval Due","#F55F71","#f55f714d"),
    CANCEL_L3_REJECTED("L3 Approval Due","#F55F71","#f55f714d"),

    APPROVED("L1 Approval Due","#60C3AD","#60c3ad4d"),
    SHORTCLOSED("L1 Approval Due","#790A00","#790a004d"),
    CANCELLED("L1 Approval Due","#5C49A2","#5c49a24d"),
    GSRI_COMPLETED("GSRI Closed","#60C3AD","#60c3ad4d");



    private String statusText;
    private String statusColor;
    private String bgColor;
}
