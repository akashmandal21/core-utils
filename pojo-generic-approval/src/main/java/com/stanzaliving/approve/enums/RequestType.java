package com.stanzaliving.approve.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RequestType {
    BULK_UPLOAD_ROOMS("Bulk upload rooms"),
    BULK_UPLOAD_ROOM_PRICING("Bulk update room pricing"),
    BULK_UPDATE_RESIDENCES("Monthly Underwritten"),
    ROOM_UPDATION("Food Menu Category"),
    RESIDENCE_UPDATION("Weekly Menu");
    private final String value;
}