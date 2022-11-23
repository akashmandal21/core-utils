package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include. NON_NULL)
public class NewLedgerResponseDto {
    
	private double duesTillDate;
    private double duesPaid;
    private double balanceDues;
    
    private Map<Integer, List<NewLedgerLineItemResponseDto>> ledgerLineItems;
}