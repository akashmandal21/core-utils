package com.stanzaliving.booking.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.core.user.enums.Gender;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GuestRequestPayloadDto {

    @NotNull(message = "firstName cannot be null or blank")
    private String firstName;

    @NotNull(message = "lastName cannot be null or blank")
    private String lastName;

    @NotNull(message = "phone cannot be null or blank")
    private String phone;

    @NotNull(message = "email cannot be null or blank")
    private String email;

    @NotNull(message = "gender cannot be null or blank")
    private String gender;

    @NotNull(message = "nationality cannot be null or blank")
    private String nationality;

    @NotNull(message = "moveInDate cannot be null or blank")
    private Date moveInDate;

    @NotNull(message = "parentBookingId cannot be null or blank")
    private String parentBookingId;

    @NotNull(message = "parentUuid cannot be null or blank")
    private String parentUuid;

    @NotNull(message = "bookingType cannot be null or blank")
    private BookingType bookingType;

    @NotNull(message = "bookingStatus cannot be null or blank")
    private String bookingStatus;
}