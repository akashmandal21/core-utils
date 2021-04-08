package com.stanzaliving.approve.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {

    PENDING_L1_APPROVAL("Pending L1 Approval",1,ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L1 Approval"),
    L1_REJECTED("L1 Rejected",1, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L2_APPROVAL("Pending L2 Approval",2, ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L2 Approval"),
    L2_REJECTED("L2 Rejected",2, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L3_APPROVAL("Pending L3 Approval", 3, ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L3 Approval"),
    L3_REJECTED("L3 Rejected", 3, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    
    PENDING_L4_APPROVAL("Pending L4 Approval", 4, ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L4 Approval"),
    L4_REJECTED("L4 Rejected", 4, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    
    PENDING_L5_APPROVAL("Pending L5 Approval", 5, ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L5 Approval"),
    L5_REJECTED("L5 Rejected", 5, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    
    APPROVED("Approved", 6, ColorCode.SOFT_GREEN.getColorCode(), ColorCode.GREEN_CYAN.getColorCode(), "Successfully Approved"),        //color code need to be updated with product
    REJECTED("Rejected", 7, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected");

    private String status;
    private Integer level;
    private String bgColorCode;
    private String textColorCode;
    private String responseMessage;
}
