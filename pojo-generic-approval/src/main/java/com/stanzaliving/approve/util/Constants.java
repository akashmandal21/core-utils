package com.stanzaliving.approve.util;

import com.stanzaliving.approve.enums.ApprovalStatus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {

    public static final String SUCCESS = "Success";
    public static final String ERROR = "Error in processing data";
    public static final String NO_RECORD_FOUND_WITH_ID = "No record found with id ";
    public static final String NO_RECORD_FOUND_WITH_UUID = "No record found with uuid ";

    public static final String RESIDENCE = "residence";
    public static final String RESIDENCE_KEY = "RESIDENCE_UPDATES";
    public static final String RESIDENCE_DISPLAY_NAME = "Residence Updates";
    public static final String ROOM_KEY = "ROOM_UPDATES";
    public static final String ROOM_DISPLAY_NAME = "Room Updates";
    public static final List<ApprovalStatus> REJECTED_APPROVAL_STATUS = Arrays.asList(new ApprovalStatus[] {ApprovalStatus.L1_REJECTED,
            ApprovalStatus.L2_REJECTED, ApprovalStatus.L3_REJECTED, ApprovalStatus.L4_REJECTED, ApprovalStatus.L5_REJECTED, ApprovalStatus.REJECTED});

    public static final List<ApprovalStatus> INITIAL_APPROVAL_STATUS = Arrays.asList(new ApprovalStatus[]{ApprovalStatus.L1_REJECTED,
            ApprovalStatus.L2_REJECTED, ApprovalStatus.L3_REJECTED, ApprovalStatus.L4_REJECTED, ApprovalStatus.L5_REJECTED, ApprovalStatus.REJECTED,
            ApprovalStatus.APPROVED});
    public static final List<String> RESIDENCE_ENTITY = Arrays.asList(new String[]{"RESIDENCE_UPDATION", "BULK_UPDATE_RESIDENCE"});

    public static final List<String> ROOM_ENTITY = Arrays.asList(new String[]{"BULK_UPLOAD_ROOMS", "BULK_UPDATE_ROOM_PRICING","ROOM_UPDATION"});

    public static final List<String> INDIVIDUAL_ACTION = Arrays.asList(new String[]{"RESIDENCE_UPDATION", "ROOM_UPDATION" });

    public static final List<String> BULK_ACTION = Arrays.asList(new String[]{"BULK_UPLOAD_ROOMS", "BULK_UPDATE_ROOM_PRICING","BULK_UPDATE_RESIDENCE"});


    public static final String SUBJECT_BULK_APPROVED = "IMS | Bulk Action - Your request has been Approved";

    public static final String SUBJECT_BULK_REJECTED = "IMS | Bulk Action - Your request has been Rejected";

    public static final String SUBJECT_SINGLE_UPDATE_APPROVED = "IMS | Room Updating Action - Your request has been Approved";

    public static final String SUBJECT_SINGLE_UPDATE_REJECTED = "IMS | Room Updating Action - Your request has been Rejected";

    public static final Map<String, String> MAIL_ENTITY_NAME  = new HashMap<String, String>() {{
        put("BULK_UPDATE_RESIDENCE", "Update residences in bulk");
        put("BULK_UPLOAD_ROOMS", " Upload room in bulk");
        put("BULK_UPDATE_ROOM_PRICING","Update rooms in bulk");
    }};

}
