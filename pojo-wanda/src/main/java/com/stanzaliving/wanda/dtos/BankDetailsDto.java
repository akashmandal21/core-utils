package com.stanzaliving.wanda.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.wanda.enums.BankNames;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDetailsDto {

	@NotEmpty
	private String accountNumber;
	
	private BankNames bankNames;
	
	private String bankNameStr;
	
	@NotEmpty
	private String ifscCode;
	
	@NotEmpty
	private String benefeciaryName;
	
	private String fullName;

	private String razorpayId;

	private String razorpayBankAccountId;

	private String userId;

	private boolean isActive;

	private String vpaId;

	private String vpa;

	@Builder.Default
	private Boolean isVerified = false;
	
	@Builder.Default
	private Boolean isPreferred = Boolean.FALSE;
	
	private String residentId;
}
