package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {

    BOI("BOI"),
    GC("GC"),
    ASIS("As-Is"),
    COLLATERAL("Collateral"),
    BRANDING("Branding"),
    TRANSIT_MEDIA("Transit Media"),
    MERCHANDISE("Merchandise"),
    MANPOWER("Manpower"),
    MATERIAL_TRANSPORTATION("Material Transportation"),
    FACILITATION_CHARGES("Facilitation Charges"),
    OTHER("Others");

    private String typeText;
}
