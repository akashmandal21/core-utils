package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentResponseDto {
    private String installmentNo;
    private String fromDate;
    private String toDate;
    private Double invoiceAmount;
    private Double amountPaid;
    private List<InstallmentLineItemResponseDto> installmentLineItemResponseDtoList;
}
