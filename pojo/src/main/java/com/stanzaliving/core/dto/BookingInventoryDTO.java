package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingInventoryDTO {

    private int bookingId;

    private Integer bookingType;

    private String agreement;

    private String studentId;

    private String firstName;

    private String lastName;

    private String email;

    private String studentPhone;

    private String phone;

    private Date contractStartDate;

    private Date contractEndDate;

    private String bookingStatus;

    private String residenceName;

    private boolean isAlfredEnabled = Boolean.FALSE;
}