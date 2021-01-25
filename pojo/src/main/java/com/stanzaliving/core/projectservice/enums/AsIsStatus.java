package com.stanzaliving.core.projectservice.enums;

import lombok.Getter;

@Getter
public enum AsIsStatus {
    NOT_STARTED("Not Started","#e5e3e3"),
    IN_DRAFT("In Draft","#e5e3e3"),
    SENT_FOR_APPROVAL("Pending Approval","#FFC300"),
    SENT_BACK("Sent Back","#e5e3e3"),
    APPROVED("Approved","#77baa6");

    private String status, color;

    AsIsStatus(String status, String color){
        this.status=status;
        this.color=color;
    }
}
