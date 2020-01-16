package com.stanzaliving.core.base.enums;

import lombok.Getter;

@Getter
public enum ColorCode {
    BLACK("#000000000");

    private String colorCode;

    ColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

}