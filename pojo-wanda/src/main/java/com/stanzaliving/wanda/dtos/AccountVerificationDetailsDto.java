package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.stanzaliving.wanda.enums.BankNames;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AccountVerificationDetailsDto {

	@NotEmpty(message = "UserId can't be empty")
	private String userId;

	@NotEmpty(message = "Account number can't be empty")
	@Length(min = 9, max = 18)
	private String accountNumber;

	@NotEmpty(message = "Full name can't be empty")
	private String fullName;

	private BankNames bankName;

	@NotEmpty(message = "Ifsc code can't be empty")
	@Length(min = 11, max = 11)
	private String ifscCode;

	@Builder.Default
	private Boolean isPreferred = Boolean.FALSE;
	
	private Double amount;

}
