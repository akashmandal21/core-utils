package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum ItemMaterial {

    ACP_LIT_SIGNAGE("ACP lit Signage"),
    CLOTH("Cloth"),
    CLOTH_COTTON_FIT("Cloth cotton/jersy/dry/lycra fit"),
    ELECTRONICE("Electronic"),
    FABRIC("Fabric"),
    FIBER("Fiber"),
    FIBER_AND_METAL_STAND("Fabric & Metal Stands"),
    FLEX("Flex"),
    FLEX_AND_FRAME("Flex and Frame"),
    FLEX_ON_FRAME("Flex on Frame"),
    GSB_LIT_FABRIC("GSB LIT - Fabric"),
    GSB_LIT_FLEX("GSB LIT - Flex"),
    GSB_NON_LIT_FABRIC("GSB NON LIT - Fabric"),
    GSB_NON_LIT_FLEX("GSB NON LIT - flex"),
    LABOUR("Labour"),
    METAL_AND_PLASTIC("Metal & Plastic"),
    METAL_FRAME("Metal frame with base stand and pedal"),
    MULTIPLE("Multiple"),
    NYLON_COATED_METAL_AND_PLASTIC("Nylon, Coated Metal & Plastic"),
    PAPER("Paper"),
    PLASTIC("Plastic"),
    POLYPROPELYN("Polypropelyn"),
    POLYSTER("Polyster"),
    SUNBOARD_WITH_VINYL("Sunboard with Vinyl"),
    VINYL_SUNBOARD("Vinyl - Sunboard"),
    VINYL("Vinyl"),
    VINYL_SUNBOARD_WITH_MS_FRAME("Vinyl Sunboard with MS Frame"),
    NA("NA");

    private String itemMaterialText;

    public static Map<String, ItemMaterial> itemMaterialByNameMap = new HashMap<>();

    static {

        for (ItemMaterial itemMaterial : ItemMaterial.values()) {
            itemMaterialByNameMap.put(itemMaterial.getItemMaterialText(), itemMaterial);
        }
    }

    public static ItemMaterial getItemMaterialByName(String itemMaterialTypeName) {
        return itemMaterialByNameMap.get(itemMaterialTypeName);
    }

}
