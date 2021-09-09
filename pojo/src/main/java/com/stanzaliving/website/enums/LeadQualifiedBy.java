package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadQualifiedBy {
    SELF("Self Qualification"), PRE_SALES("Pre-Sales"), FIELD_SALES("Field Sales");

    private String statusDescription;
}