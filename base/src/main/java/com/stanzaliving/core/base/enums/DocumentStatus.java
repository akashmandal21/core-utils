package com.stanzaliving.core.base.enums;

import java.util.HashSet;
import java.util.Set;

public enum DocumentStatus {

    ALL("ALL"),
    NOTUPLOADED("Not Uploaded Documents"),
    PENDING("Pending Verification"),
    REJECTED("Rejected Verification"),
    APPROVED("Approved Verification");

    String name;

    private DocumentStatus(String name){
        this.name = name;
    }

}
