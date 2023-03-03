package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDurationDto {

    private Date contractStartDate;

    private Date contractEndDate;

    private Date expectedMoveInDate;

    private Date moveInDate;

    private Date maxMoveInDate;

    private Date minMoveInDate;

    private Date checkInDate;

    private Date checkoutDate;

    private Date lockInDate;

    private String contractTenure;

    private String lockInTenure;
}
