package com.stanzaliving.core.generic.itemmaster.enums;

import com.stanzaliving.core.generic.itemmaster.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 01/04/21
 */
@AllArgsConstructor
@Getter
public enum InventoryType {
    INVENTORY,
    NON_INVENTORY,
    SERVICE,
    OTHER_CHARGE;

}
