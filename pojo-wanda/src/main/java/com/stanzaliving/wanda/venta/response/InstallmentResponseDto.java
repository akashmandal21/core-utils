package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentResponseDto {
   
	private Set<String> ids;
	private String installmentNo;
	@Deprecated
    private String fromDate;
	@Deprecated
    private String toDate;
    private Double invoiceAmount;
    private Double amountPaid;
    private Double amountDue;
    private String dueDateStr;
    private Boolean discountApplied;
    private List<InstallmentLineItemResponseDto> installmentLineItemResponseDtoList;
    private String type;
    private String period;
}
