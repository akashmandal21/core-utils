package com.stanzaliving.wanda.response;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.booking.dto.PaymentDetailsDto;
import com.stanzaliving.wanda.dtos.BankDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDetailsResponseDto {

	private String bookingUuid;

	private LocalDate moveOutDate;

	private LocalDate actualMoveOutDate;

	private Double dues;

	private String actualEndDateNote;

	private String confirmationNote;

	private List<PaymentDetailsDto> paymentDetails;

	private boolean isEligibleForExitInitiation = true;

	private BankDetailsDto bankDetails;
}
