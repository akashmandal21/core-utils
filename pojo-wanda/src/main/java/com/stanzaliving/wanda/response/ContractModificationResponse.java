package com.stanzaliving.wanda.response;

import com.stanzaliving.agreement.dto.response.AgreementDto;
import com.stanzaliving.booking.dto.response.ModifyContractCommercialsResponseDto;
import com.stanzaliving.booking.dto.response.PaymentPlanResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractModificationResponse {
	private ModifyContractCommercialsResponseDto modifyContractCommercialsResponseDto;
	private PaymentPlanResponseDto paymentPlanResponseDto;
	private AgreementDto agreementDto;
}
