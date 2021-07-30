package com.stanzaliving.booking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.enums.BookingSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)    //  ignore all null fields
public class BookingNeedsAttentionUpdationDto {

    private String bookingId;

    private boolean removeNeedsAttention;

    private BookingSource source;
}
