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
    THREE_POINT_SEVEN_FIVE("3.75"),
    ZERO_POINT_SEVEN_FIVE("0.75"),
    ONE_POINT_FIVE_ZERO("1.50"),
    TWENTY_POINT_EIGHT("20.80"),
    SEVEN_POINT_FIVE("7.50"),
    ONE_POINT_FIVE("1.50"),
    TWENTY("20");

    private String text;
}
