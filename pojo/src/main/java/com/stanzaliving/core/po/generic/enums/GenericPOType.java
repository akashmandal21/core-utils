package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenericPOType {

    NON_RENTAL("Non-Rental Items/ Service PO", Boolean.TRUE, Boolean.FALSE),
    RENTAL("Rental Items PO", Boolean.TRUE, Boolean.FALSE),
    MATERIAL_TO("Material TO", Boolean.FALSE, Boolean.TRUE),
    SERVICE_TO("Service TO", Boolean.FALSE, Boolean.TRUE);

    private String poTypeText;

    private Boolean isPo;

    private Boolean isTo;

}
