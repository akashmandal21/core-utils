package com.stanzaliving.productmix.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateAction {
    APPROVE,
    REJECT,
    DELETE,
    MARK_INACTIVE,
    MARK_ACTIVE;
}
