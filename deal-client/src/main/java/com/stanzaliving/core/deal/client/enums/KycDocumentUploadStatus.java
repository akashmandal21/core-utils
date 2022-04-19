package com.stanzaliving.core.deal.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum KycDocumentUploadStatus {

    PENDING("Pending"), DONE("Done");

    private String name;
}
