package com.stanzaliving.core.boq_service.servicemix.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ServiceMixStatus {
    NOT_STARTED("Not Started"),IN_DRAFT("In Draft"),SENT_BACK("Sent Back"),AT_ZONAL_HEAD("Sent for Approval to Zonal Head"),
    AT_DESIGN_HEAD("Sent for Approval to Design Head"),
    AT_TRANSFORMATIONS("Sent for Approval to Nitin"),
    APPROVED("Approved");

    private String text;
}
