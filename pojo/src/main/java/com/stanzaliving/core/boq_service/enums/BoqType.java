package com.stanzaliving.core.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  BoqType {
    MASTER_BOQ("Master BOQ"),
    EXTRA_BOQ("Extra BOQ");

    private String boqText;
}
