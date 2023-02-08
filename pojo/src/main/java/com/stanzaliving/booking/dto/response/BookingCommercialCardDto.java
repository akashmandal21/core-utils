package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCommercialCardDto {

    private Date fromDate;

    private Date toDate;

    private String commercialCardUuid;

    private String bookingUuid;

    private Boolean isPriceStrategy;

    private Double monthlyRent;
}
