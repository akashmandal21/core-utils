package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author dhruv.mathur
 * @date 09/04/21
 */
@Getter
@AllArgsConstructor
public enum TdsAmount {
    OPEX("op");


    private String text;
}
