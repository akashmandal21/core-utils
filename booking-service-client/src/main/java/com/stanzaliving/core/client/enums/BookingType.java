package com.stanzaliving.core.client.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingType {

    PROFESSIONAL("Working Professional"),
    SCHOLAR("Student");

    private String type;
}