package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockGrnDto {
    private BigDecimal totalQtyReceivedAlready; // (TRVD) grn done items (install not being considered)
    private BigDecimal currentRequestQty;   // (CRQT)
    private BigDecimal totalQtyInPo;    // (TPQ)
    private String itemCode; // todo list ?
    private boolean isAllowed;
    private BigDecimal maxAllowed;
}