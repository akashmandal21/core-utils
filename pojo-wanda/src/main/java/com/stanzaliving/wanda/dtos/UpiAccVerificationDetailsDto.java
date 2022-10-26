package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpiAccVerificationDetailsDto {
	
	  @NotEmpty(message = "UserId can't be empty")
	    private String userId;

	    @NotEmpty(message = "vpa can't be empty")
	    private String vpa;

}
