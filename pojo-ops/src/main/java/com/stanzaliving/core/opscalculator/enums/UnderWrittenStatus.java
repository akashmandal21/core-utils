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
    UNDER_DRAFT("Under Draft", "Underwritten saved successfully", ColorCode.BLACK.getColorCode(), ColorCode.WHITE.getColorCode()),
    SENT_FOR_APPROVAL("Sent For Approval", "Underwritten submitted for approval", ColorCode.BLACK.getColorCode(), ColorCode.WHITE.getColorCode()),
    APPROVED("Approved", "Underwritten approved successfully", ColorCode.BLACK.getColorCode(), ColorCode.WHITE.getColorCode()),
    REJECTED("Rejected", "Underwritten rejected successfully", ColorCode.BLACK.getColorCode(), ColorCode.WHITE.getColorCode()),
    DISCARDED("Discarded", "Underwritten discarded successfully", ColorCode.BLACK.getColorCode(), ColorCode.WHITE.getColorCode());

    String status;
    String responseMsg;
    String bgColorCode;     //currently incorrectly mapped
    String textColorCode;   //currently incorrectly mapped
}
