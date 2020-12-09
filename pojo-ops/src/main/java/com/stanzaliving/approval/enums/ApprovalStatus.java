package com.stanzaliving.approval.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    //L1 approval is non skippable role, L2 and L3 are skippable roles
    PENDING_L1_APPROVAL("Pending L1 Approval",ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L1 Approval"),
    L1_REJECTED("L1 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L2_APPROVAL("Pending L2 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L2 Approval"),
    L2_REJECTED("L2 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L3_APPROVAL("Pending L3 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L3 Approval"),
    L3_REJECTED("L3 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    APPROVED("Approved", ColorCode.GREEN.getColorCode(), ColorCode.WHITE.getColorCode(), "Successfully Approved"),        //color code need to be updated with product
    REJECTED("Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected");

    private String status;
    private String bgColorCode;
    private String textColorCode;
    private String responseMessage;
}
