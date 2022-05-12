package com.stanzaliving.core.bookingservice.dto.response;

import java.util.Date;
import java.util.List;

public class SoldBookingDto {
    private String residenceUuid;
    private String bookingUuid;
    private String bookingType;
    private Date lockInStart;
    private Date lockInEnd;

    private List<String> bookingUuidd;
}
