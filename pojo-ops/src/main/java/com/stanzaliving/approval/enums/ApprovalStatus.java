package com.stanzaliving.approval.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING_L1_APPROVAL("Pending L1 Approval",ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode()),
    L1_REJECTED("L1 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode()),
    PENDING_L2_APPROVAL("Pending L2 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode()),
    L2_REJECTED("L2 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode()),
    PENDING_L3_APPROVAL("Pending L3 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode()),
    L3_REJECTED("L3 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode()),
    APPROVED("Approved", ColorCode.GREEN.getColorCode(), ColorCode.BLACK.getColorCode()),        //color code need to be updated with product
    REJECTED("Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode());

    private String status;
    private String bgColorCode;
    private String textColorCode;
}
