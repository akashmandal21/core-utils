package com.stanzaliving.wanda.venta.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentLineItemResponseDto {
    private String name;
    private Double lineItemAmount;
    private Double lineItemAmountPaid;
}
