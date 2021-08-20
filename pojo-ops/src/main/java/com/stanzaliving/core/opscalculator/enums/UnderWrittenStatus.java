package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum UnderWrittenStatus {
    NEW("New", "", ColorCode.BLACK.getColorCode(), ColorCode.WHITE.getColorCode()),
    UNDER_DRAFT("Under Draft", "Underwritten saved successfully", ColorCode.LIGHT_GRAYISH_BLUE.getColorCode(), ColorCode.DARK_GRAYISH_BLUE.getColorCode()),
    SENT_FOR_APPROVAL("Sent For Approval", "Underwritten submitted for approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.WHITE.getColorCode()),
    APPROVED("Approved", "Underwritten approved successfully", ColorCode.MODERATE_CYAN.getColorCode(), ColorCode.WHITE.getColorCode()),
    REJECTED("Rejected", "Underwritten rejected successfully", ColorCode.RED.getColorCode(), ColorCode.WHITE.getColorCode()),
    DISCARDED("Discarded", "Underwritten discarded successfully", ColorCode.RED.getColorCode(), ColorCode.WHITE.getColorCode()),
    MERGED("Merged", "Underwritten merged successfully", ColorCode.RED.getColorCode(), ColorCode.WHITE.getColorCode());

    String status;
    String responseMsg;
    String bgColorCode;
    String textColorCode;
}
