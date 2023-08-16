package com.stanzaliving.booking.dto.request;

import com.stanzaliving.core.bookingservice.dto.response.BookingDurationResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreationDto implements Serializable {

    private String bundleId;
    private List<String> postpaidAddOnBillingIds;
    private BookingDurationResponseDto bookingDurationResponseDto;
}
