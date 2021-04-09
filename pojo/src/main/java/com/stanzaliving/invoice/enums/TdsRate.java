package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 09/04/21
 */
@Getter
@AllArgsConstructor
public enum TdsRate {
    OPEX("op");


    private String text;
}
