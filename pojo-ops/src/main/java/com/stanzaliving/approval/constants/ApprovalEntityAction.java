package com.stanzaliving.approval.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ApprovalEntityAction {
    UPDATE("Update"),
    DELETE("Delete");
    private final String action;
}
