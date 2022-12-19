package com.stanzaliving.core.bookingservice.dto.request;

import com.stanzaliving.booking.enums.BookingStatus;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingsForUpsellRequestDto {

    @NotBlank(message = "userUuid cannot be empty")
    private String userUuid;

    private Date fromDate;

    private Date toDate;

    @Builder.Default
    private Set<String> bookingStatusList = BookingStatus.activeStatusesBooking();

    @NotEmpty(message = "residenceUuids cannot be empty")
    private List<String> residenceUuids;
}