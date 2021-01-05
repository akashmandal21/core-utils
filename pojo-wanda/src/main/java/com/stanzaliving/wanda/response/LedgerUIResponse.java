package com.stanzaliving.wanda.response;

import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.wanda.venta.response.NewLedgerLineItemResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include. NON_NULL)
public class LedgerUIResponse {
    
    private String duesTillDate;
    private String duesPaid;
    private String balanceDues;
    
    private LinkedHashMap<String, List<NewLedgerLineItemResponseDto>> ledgerLineItems;
}