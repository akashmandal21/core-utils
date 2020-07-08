package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemMaterial {

    PAPER("Paper"),
    FLEX("Flex"),
    FABRIC("Fabric"),
    VINYL_SUNBOARD_WITH_MS_FRAME("Vinyl Sunboard with MS Frame"),
    FLEX_AND_FRAME("Flex and Frame"),
    POLYPROPELYN("Polypropelyn"),
    SUNBOARD_WITH_VINYL("Sunboard with Vinyl"),
    FIBER("Fiber"),
    FIBER_AND_METAL_STAND("Fabric & Metal Stands"),
    POLYSTER("Polyster"),
    GSB_LIT_FLEX("GSB LIT - Flex"),
    GSB_LIT_FABRIC("GSB LIT - Fabric"),
    GSB_NON_LIT_FLEX("GSB NON LIT - flex"),
    GSB_NON_LIT_FABRIC("GSB NON LIT - Fabric"),
    ACP_LIT_SIGNAGE("ACP lit Signage"),
    ELECTRONICE("Electronic"),
    METAL_FRAME("Metal frame with base stand and pedal"),
    VINYL_SUNBOARD("Vinyl - Sunboard"),
    VINYL("Vinyl"),
    FLEX_ON_FRAME("Flex on Frame"),
    CLOTH_COTTON_FIT("Cloth cotton/jersy/dry/lycra fit"),
    CLOTH("Cloth"),
    PLASTIC("Plastic"),
    MULTIPLE("Multiple"),
    METAL_AND_PLASTIC("Metal & Plastic"),
    NYLON_COATED_METAL_AND_PLASTIC("Nylon, Coated Metal & Plastic"),
    LABOUR("Labour");

    private String itemMaterialText;

}
