package com.stanzaliving.core.asis.enums;

public enum AsIsStatus {
    IN_DRAFT("Pending","#e5e3e3"),
    SENT_FOR_APPROVAL("Uploaded","#FFC300"),
    APPROVED("Approved","#77baa6"),
    SENT_BACK("Pending","#e5e3e3");

    private String statusText;
    private String color;

    AsIsStatus(String statusText, String color){
        this.statusText=statusText;
        this.color=color;
    }
}
