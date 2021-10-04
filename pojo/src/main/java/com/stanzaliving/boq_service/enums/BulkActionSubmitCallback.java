package com.stanzaliving.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BulkActionSubmitCallback {
    SUBMIT("Submit"),
    CALLBACK("Call Back");

    private String value;
}
