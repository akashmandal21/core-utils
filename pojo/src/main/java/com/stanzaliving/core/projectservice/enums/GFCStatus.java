package com.stanzaliving.core.projectservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum GFCStatus {

    NOT_STARTED("Not Available","#e5e3e3"),
    IN_DRAFT("Pending","#e5e3e3"),
    SENT_FOR_APPROVAL_TO_ZH("Uploaded","#FFC300"),
    SENT_FOR_APPROVAL_TO_NH("Uploaded","#FFC300"),
    SENT_BACK_BY_ZH("Pending","#e5e3e3"),
    SENT_BACK_BY_NH("Pending","#e5e3e3"),
    APPROVED("Approved","#77baa6");

    private String status;
    private String color;

    private static EnumMap<GFCStatus, String> gfcStatus = new EnumMap<>(GFCStatus.class);

    static {
        gfcStatus.put(NOT_STARTED,NOT_STARTED.getStatus());
        gfcStatus.put(IN_DRAFT, IN_DRAFT.getStatus());
        gfcStatus.put(SENT_FOR_APPROVAL_TO_ZH, SENT_FOR_APPROVAL_TO_ZH.getStatus());
        gfcStatus.put(SENT_FOR_APPROVAL_TO_NH, SENT_FOR_APPROVAL_TO_NH.getStatus());
        gfcStatus.put(SENT_BACK_BY_ZH, SENT_BACK_BY_ZH.getStatus());
        gfcStatus.put(SENT_BACK_BY_NH, SENT_BACK_BY_NH.getStatus());
        gfcStatus.put(APPROVED, APPROVED.getStatus());
    }

    public static Map<GFCStatus, String> getAll() {
        return gfcStatus;
    }

}
