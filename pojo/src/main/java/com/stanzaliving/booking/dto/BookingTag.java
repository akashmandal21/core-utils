package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingTag {

    private String name;

    private String icon;

    private String colorCode;

    private String textColor;
}
