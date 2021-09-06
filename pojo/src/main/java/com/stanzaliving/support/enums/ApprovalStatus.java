package com.stanzaliving.support.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    //L1 approval is non skippable role, L2 and L3 are skippable roles
    PENDING_L1_APPROVAL("Pending L1 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L1 Approval"),
    L1_REJECTED("L1 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L2_APPROVAL("Pending L2 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L2 Approval"),
    L2_REJECTED("L2 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L3_APPROVAL("Pending L3 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L3 Approval"),
    L3_REJECTED("L3 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),

    PENDING_L4_APPROVAL("Pending L4 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L4 Approval"),
    L4_REJECTED("L4 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),

    PENDING_L5_APPROVAL("Pending L5 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L5 Approval"),
    L5_REJECTED("L5 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected"),

    APPROVED("Approved", ColorCode.SOFT_GREEN.getColorCode(), ColorCode.GREEN_CYAN.getColorCode(), "Successfully Approved"),        //color code need to be updated with product
    REJECTED("Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected");

    private String status;
    private String bgColorCode;
    private String textColorCode;
    private String responseMessage;

    private static final Map<String, ApprovalStatus> map = new HashMap<>();

    static {
        for (ApprovalStatus approvalStatus : ApprovalStatus.values()) {
            map.put(approvalStatus.status, approvalStatus);
        }
    }

    public static ApprovalStatus enumOf(String approvalStatus) {
        return map.get(approvalStatus);
    }
}