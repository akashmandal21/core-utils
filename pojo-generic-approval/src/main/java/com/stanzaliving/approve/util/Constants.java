package com.stanzaliving.approve.util;

import com.stanzaliving.approve.enums.ApprovalStatus;

import java.util.Arrays;
import java.util.List;

public class Constants {

    public static final String SUCCESS = "Success";
    public static final String ERROR = "Error in processing data";
    public static final String NO_RECORD_FOUND_WITH_ID = "No record found with id ";
    public static final String NO_RECORD_FOUND_WITH_UUID = "No record found with uuid ";

    public static final String RESIDENCE = "residence";
    public static final List<ApprovalStatus> REJECTED_APPROVAL_STATUS = Arrays.asList(new ApprovalStatus[] {ApprovalStatus.L1_REJECTED,
            ApprovalStatus.L2_REJECTED, ApprovalStatus.L3_REJECTED, ApprovalStatus.L4_REJECTED, ApprovalStatus.L5_REJECTED, ApprovalStatus.REJECTED});

    public static final List<String> RESIDENCE_ENTITY = Arrays.asList(new String[]{"RESIDENCE_UPDATION", "BULK_UPDATE_RESIDENCE"});

    public static final List<String> ROOM_ENTITY = Arrays.asList(new String[]{"BULK_UPDATE_ROOMS", "BULK_UPDATE_ROOM_PRICING","ROOM_UPDATION"});
}
