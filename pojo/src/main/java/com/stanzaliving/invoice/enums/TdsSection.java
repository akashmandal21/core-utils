package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 06/04/21
 */
@Getter
@AllArgsConstructor
public enum TdsSection {
    OPEX("OP");

    private String text;
}

