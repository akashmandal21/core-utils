package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING_APPROVAL_ON_L1("Pending L1 Approval", "#FFEAB6", "#FFB701")
    ,PENDING_APPROVAL_ON_L2("Pending L2 Approval", "#FFEAB6", "#FFB701")
    ,REJECTED_BY_L1("Rejected By L1", " #FFF1F1", "#F55F71")
    ,REJECTED_BY_L2("Rejected By L2", " #FFF1F1", "#F55F71")
    ,APPROVED_BY_L1("Approved By L1", "#FFEAB6", "#FFB701")
    ,APPROVED_BY_L2("Approved By L2", "#FFEAB6", "#FFB701");
    String status;
    String bgColorCode;
    String textColorCode;

    public static List<DropDownDto> dropDownDtoListForL1 = new ArrayList<>();
    public static List<DropDownDto> dropDownDtoListForL2 = new ArrayList<>();


    static {
        for(ApprovalStatus approvalStatus : ApprovalStatus.values()){
            if(!ApprovalStatus.APPROVED_BY_L2.equals(approvalStatus) && !ApprovalStatus.APPROVED_BY_L1.equals(approvalStatus)) {
                dropDownDtoListForL1.add(new DropDownDto(approvalStatus.toString(), approvalStatus.getStatus()));
            }
        }
    }

    static {
        for(ApprovalStatus approvalStatus : ApprovalStatus.values()){
            if(!ApprovalStatus.APPROVED_BY_L2.equals(approvalStatus) && !ApprovalStatus.APPROVED_BY_L1.equals(approvalStatus) &&
                    !ApprovalStatus.PENDING_APPROVAL_ON_L1.equals(approvalStatus) && !ApprovalStatus.REJECTED_BY_L1.equals(approvalStatus)) {
                dropDownDtoListForL2.add(new DropDownDto(approvalStatus.toString(), approvalStatus.getStatus()));
            }
        }
    }
}
