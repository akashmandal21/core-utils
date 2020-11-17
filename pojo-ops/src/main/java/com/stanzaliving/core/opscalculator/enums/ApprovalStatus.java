package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING_APPROVAL_ON_L1("Pending L1 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode())
    ,PENDING_APPROVAL_ON_L2("Pending L2 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode())
    ,PENDING_APPROVAL_ON_L3("Pending L3 Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode())
    ,L1_REJECTED("L1 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode())
    ,L2_REJECTED("L2 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode())
    ,L3_REJECTED("L3 Rejected", ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode())
    ,APPROVED_BY_L1("Approved By L1", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode())
    ,APPROVED_BY_L2("Approved By L2", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode())
    ,APPROVED_BY_L3("Approved By L3", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode())
    ,SENT_FOR_APPROVAL("Sent For Approval", ColorCode.PALE_ORANGE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode());
    private String status;
    private String bgColorCode;
    private String textColorCode;

    private static List<DropDownDto> dropDownDtoListForL1 = new ArrayList<>();
    private static List<DropDownDto> dropDownDtoListForL2 = new ArrayList<>();

    public static List<DropDownDto> getDropDownDtoListForL1(){
        return dropDownDtoListForL1;
    }
    public static List<DropDownDto> getDropDownDtoListForL2(){
        return dropDownDtoListForL2;
    }

    static {
        for(ApprovalStatus approvalStatus : ApprovalStatus.values()){
            if(!ApprovalStatus.APPROVED_BY_L2.equals(approvalStatus) &&
                    !ApprovalStatus.APPROVED_BY_L1.equals(approvalStatus)
               && !ApprovalStatus.APPROVED_BY_L3.equals(approvalStatus)) {
                dropDownDtoListForL1.add(new DropDownDto(approvalStatus.toString(), approvalStatus.getStatus()));
            }
            if(!ApprovalStatus.APPROVED_BY_L2.equals(approvalStatus) && !ApprovalStatus.APPROVED_BY_L1.equals(approvalStatus) &&
                    !ApprovalStatus.PENDING_APPROVAL_ON_L1.equals(approvalStatus) && !ApprovalStatus.L1_REJECTED.equals(approvalStatus)) {
                dropDownDtoListForL2.add(new DropDownDto(approvalStatus.toString(), approvalStatus.getStatus()));
            }
        }
    }

}
