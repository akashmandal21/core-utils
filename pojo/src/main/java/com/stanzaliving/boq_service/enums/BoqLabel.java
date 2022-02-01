package com.stanzaliving.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoqLabel {
    CAPEX("Capex"),
    OPEX("Opex");

    private String boqLabelText;
}
