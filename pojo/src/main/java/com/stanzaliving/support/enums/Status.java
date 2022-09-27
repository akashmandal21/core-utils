package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Status {
    OPEN("OPEN","a11d5ed6-c694-496d-8fd5-e08d41a8065c","SYSTEM","TICKET","Open"),
    IN_PROGRESS("IN PROGRESS","1826ffdf-989a-4a2b-8435-e9e0b1f787ec","USER","TICKET","In Progress"),
    WAITING_ON_CUSTOMER("WAITING ON CUSTOMER","f3833b2f-93a3-4569-8840-8602da68ffb8","USER","TICKET","Waiting on Customer"),
    REOPEN("REOPENED","99269fe9-1e4a-4a2d-a0fb-070ca50541fa","SYSTEM","TICKET","Reopen"),
    RESOLVED("RESOLVED","6c1c88a-d3f3-446d-8da3-1dcc92043ce4","USER","TICKET","Resolved"),
    CLOSED("CLOSED","277c107b-458f-4b51-9940-ed9c651ec292","USER","TICKET","Closed"),
    PENDING("PENDING","ab0a8afe-8aa4-45ad-9544-130a5ee368ae","SYSTEM","SUB_TICKET","Pending"),
    DELAYED("DELAYED","cde42cc6-1b8e-4055-a26e-d4ead90cc195","USER","SUB_TICKET",""),
    COMPLETED("COMPLETED","1ac402a2-3c70-4566-a1b5-d2c05a95ff0b","USER","SUB_TICKET",""),
    MERGED("MERGED","4cf7d95f-2138-4663-9220-a7c3dc3464ed","SYSTEM","TICKET","Closed"),
    NOT_DEFINED("NOT_DEFINED","f3833b2f-4a2d-3c70-8da3-a7c3dc3464ed","SYSTEM","TICKET","");

    private final String value;

    private final String uuid;

    private final String statusPrivilage;

    private final String ticketType;

    private final String complaintStatus;


    private static final Map<String, Status> map = new HashMap<>();

    static {
        for (Status status : Status.values()) {
            map.put(status.value, status);
        }
    }
    public static Status enumOf(String status) {
        return map.get(status);
    }

    @Override
    public String toString() {
        return value;
    }

}
