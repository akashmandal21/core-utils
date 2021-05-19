package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dhruv.mathur
 * @date 06/04/21
 */
@Getter
@AllArgsConstructor
public enum ExpenseType {
    BS("BS"),
    DIRECT("Direct Expense"),
    INDIRECT("Indirect"),
    PRIMARY("Direct Incomes");

    private String text;
}
