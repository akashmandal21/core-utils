package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotEmpty;

import com.stanzaliving.wanda.enums.BankNames;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
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
	
	private String userId;
	
	@Builder.Default
	private Boolean isVerified = false;
	
	@Builder.Default
	private Boolean isPreferred = Boolean.FALSE;
}
