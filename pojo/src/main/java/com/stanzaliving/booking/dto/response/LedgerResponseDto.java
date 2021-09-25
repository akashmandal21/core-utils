package com.stanzaliving.booking.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include. NON_NULL)
public class LedgerResponseDto {

    private double duesTillDate;

    private double bookingAmount;

    private double duesPaid;

    private double balanceDues;

    private Map<Integer, List<NewLedgerLineItemResponseDto>> ledgerLineItems;

}