package com.stanzaliving.core.base.enums;

import java.util.HashSet;
import java.util.Set;

public enum DocumentStatus {

    NOTUPLOADED("Not Uploaded Documents"),
    PENDING("Pending Verification"),
    REJECTED("Rejected Verification"),
    APPROVED("Approved Verification");

    String name;

    private DocumentStatus(String name){
        this.name = name;
    }

    public static Set<DocumentStatus> getAllDocumentStatus(){

        Set<DocumentStatus> documentStatuses = new HashSet<>();

        documentStatuses.add(PENDING);
        documentStatuses.add(NOTUPLOADED);
        documentStatuses.add(REJECTED);
        documentStatuses.add(APPROVED);

        return documentStatuses;

    }

}
