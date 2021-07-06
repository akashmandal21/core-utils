package com.stanzaliving.approve.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING_L1_APPROVAL("Pending L1 Approval",1, ColorCode.LIGHT_GRAYISH_PINK.getColorCode(), ColorCode.DARK_GRAYISH_BLUE.getColorCode(), ColorCode.GRAYISH_RED.getColorCode(), "Successfully Submitted for L1 Approval"),
    L1_REJECTED("L1 Rejected",1, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), ColorCode.GRAYISH_RED.getColorCode(), "Successfully Rejected"),
    PENDING_L2_APPROVAL("Pending L2 Approval",2, ColorCode.LIGHT_GRAYISH_ORANGE.getColorCode(), ColorCode.DARK_GRAYISH_BLUE.getColorCode(), ColorCode.VERY_SOFT_ORANGE.getColorCode(),"Successfully Submitted for L2 Approval"),
    L2_REJECTED("L2 Rejected",2, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), ColorCode.VERY_SOFT_ORANGE.getColorCode(),"Successfully Rejected"),

    PENDING_L3_APPROVAL("Pending L3 Approval", 3, ColorCode.VERY_PALE_MOSTLY_WHITE_VIOLET.getColorCode(), ColorCode.DARK_GRAYISH_BLUE.getColorCode(), ColorCode.STRONG_VIOLET.getColorCode(), "Successfully Submitted for L3 Approval"),
    L3_REJECTED("L3 Rejected", 3, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), ColorCode.STRONG_VIOLET.getColorCode(), "Successfully Rejected"),

    PENDING_L4_APPROVAL("Pending L4 Approval", 4, ColorCode.VERY_PALE_MOSTLY_WHITE_BLUE.getColorCode(), ColorCode.DARK_GRAYISH_BLUE.getColorCode(), ColorCode.VERY_LIGHT_BLUE.getColorCode(),"Successfully Submitted for L4 Approval"),
    L4_REJECTED("L4 Rejected", 4, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), ColorCode.VERY_LIGHT_BLUE.getColorCode(),"Successfully Rejected"),

    PENDING_L5_APPROVAL("Pending L5 Approval", 5, ColorCode.PALE_ORANGE.getColorCode(), ColorCode.DARK_GRAYISH_BLUE.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(), "Successfully Submitted for L5 Approval"),
    L5_REJECTED("L5 Rejected", 5, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(), ColorCode.VIVID_ORANGE.getColorCode(),"Successfully Rejected"),

    APPROVED("Approved", 6, ColorCode.SOFT_GREEN.getColorCode(), ColorCode.GREEN_CYAN.getColorCode(), ColorCode.GREEN_CYAN.getColorCode(),"Successfully Approved"),        //color code need to be updated with product
    REJECTED("Rejected", 7, ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), ColorCode.SOFT_RED.getColorCode(),  ColorCode.SOFT_RED.getColorCode(), "Successfully Rejected");


    private final String status;
    private final Integer level;
    private final String bgColorCode;
    private final String textColorCode;
    private final String cardLeftMargin;
    private final String responseMessage;
    private static final Map<String, ApprovalStatus> map = new HashMap<>();
    private static final Map<Integer, Set<ApprovalStatus>> levelMap = new HashMap<>();
    static {
        for (ApprovalStatus approvalStatus : ApprovalStatus.values()) {
            map.put(approvalStatus.getStatus(), approvalStatus);
            Set<ApprovalStatus> list = new HashSet<>();
            if (levelMap.containsKey(approvalStatus.getLevel())) {
                list = levelMap.get(approvalStatus.getLevel());
            }
            list.add(approvalStatus);
            levelMap.put(approvalStatus.getLevel(), list);
        }
    }

    public static ApprovalStatus enumOf(String approvalStatus) {
        return map.get(approvalStatus);
    }

    public static Set<ApprovalStatus> enumOf(Integer level) {
        Set<ApprovalStatus> approvalStatusList = new HashSet<>();
        while (level <= 6){
            approvalStatusList.addAll(levelMap.get(level));
            level ++;
        }
        return approvalStatusList;
    }
}