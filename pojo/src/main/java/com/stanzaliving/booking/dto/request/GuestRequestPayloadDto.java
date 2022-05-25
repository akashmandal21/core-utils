package com.stanzaliving.booking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.enums.BookingType;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GuestRequestPayloadDto {

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String gender;

    private String nationality;

    private Date moveInDate;

    private String parentBookingId;

    private String parentUuid;

    private BookingType bookingType;
    
    private BookingStatus bookingStatus;
}