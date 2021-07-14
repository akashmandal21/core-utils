package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {

    APPROVED("Approved" ,"Successfully Approved"), //todo: update color code
    REJECTED("Rejected", "Successfully Rejected");

    private final String status;
    private final String responseMessage;

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
