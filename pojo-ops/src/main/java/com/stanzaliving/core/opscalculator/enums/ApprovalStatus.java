package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING_APPROVAL_ON_L1("Pending L1 Approval"),
    PENDING_APPROVAL_ON_L2("Pending L2 Approval"),
    REJECTED_BY_L1("Rejected By L1"), REJECTED_BY_L2("Rejected By L2"),
    APPROVED_BY_L1("Approved By L1"), APPROVED_BY_L2("Approved By L2");
    String status;

    public static List<DropDownDto> dropDownDtoList = new ArrayList<>();

    static {
        for(ApprovalStatus approvalStatus : ApprovalStatus.values()){
            if(!ApprovalStatus.APPROVED_BY_L2.equals(approvalStatus) && !ApprovalStatus.APPROVED_BY_L1.equals(approvalStatus)) {
                dropDownDtoList.add(new DropDownDto(approvalStatus.toString(), approvalStatus.getStatus()));
            }
        }
    }
}
