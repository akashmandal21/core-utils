package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.core.ventaaggregationservice.dto.BookingAggregationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceGenerationRequestDto {
    private String bookingUuid;
    private List<BookingAggregationDto> bookingAggregationDtoList;
}
