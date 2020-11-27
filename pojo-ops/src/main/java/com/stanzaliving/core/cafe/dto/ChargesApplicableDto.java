package com.stanzaliving.core.cafe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ChargesApplicableDto {

	@Valid
	private ApplicableChargesDto chargesDto;
	
	private boolean mandatory;
	
	private Double chargeValue;

}
