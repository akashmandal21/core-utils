package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingTag implements Serializable {

    private String name;

    private String icon;

    private String colorCode;

    private String textColor;
}
