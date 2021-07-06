package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenericPOType {

    NON_RENTAL("Non-Rental Items PO", Boolean.TRUE, Boolean.FALSE), // For single & multiple asset in PO
    SERVICE_PO("Service PO", Boolean.TRUE, Boolean.FALSE),
    RENTAL("Rental Items PO", Boolean.TRUE, Boolean.FALSE), // For rental asset in PO
    MATERIAL_TO("Material TO", Boolean.FALSE, Boolean.TRUE),
    SERVICE_TO("Service TO", Boolean.FALSE, Boolean.TRUE);

    private String poTypeText;

    private Boolean isPo;

    private Boolean isTo;

}
