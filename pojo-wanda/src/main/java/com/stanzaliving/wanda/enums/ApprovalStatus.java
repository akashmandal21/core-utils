package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {

    PENDING_VERIFICATION("Pending Verification","", "#FAB432"),
    APPROVED("Verified" ,"Document Verified successfully", "#60C3AD"),
    REJECTED("Rejected", "Document Rejected successfully", "#F55F71");

    private final String status;
    private final String responseMessage;
    private final String colorCode;

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
