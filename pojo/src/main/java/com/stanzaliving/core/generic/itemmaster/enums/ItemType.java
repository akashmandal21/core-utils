package com.stanzaliving.core.generic.itemmaster.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {
    MATERIAL("Material Buy"),SERVICE("Service"),MATERIAL_RENT("Material Rent");
    private String itemTypeText;
}