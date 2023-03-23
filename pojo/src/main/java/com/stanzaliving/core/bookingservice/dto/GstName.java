package com.stanzaliving.core.bookingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GstName {

    CGST("cgst"),
    SGST("sgst"),
    IGST("igst");

    private String gstName;

}