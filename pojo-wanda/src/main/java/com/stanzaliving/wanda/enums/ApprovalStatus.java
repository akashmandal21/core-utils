package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {

    PENDING_VERIFICATION("Pending Verification","Verification Pending", "#FFB701"),
    APPROVED("Approved" ,"Successfully Approved", "#F55F71"), //todo: update color code
    REJECTED("Rejected", "Successfully Rejected", "#60C3AD");

    private final String status;
    private final String responseMessage;
    private final String statusCode;

    private static final Map<String, ApprovalStatus> map = new HashMap<>();

    static {
        for (ApprovalStatus approvalStatus : ApprovalStatus.values()) {
            map.put(approvalStatus.getStatus(), approvalStatus);
        }
    }

    public static ApprovalStatus enumOf(String approvalStatus) {
        return map.get(approvalStatus);
    }
}
