package com.stanzaliving.internet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserStatusUpdateDto {

	@NotBlank(message = "UserId cannot be blank")
	private String userId;

	@NotBlank(message = "Status cannot be blank")
	private String status;

	@NotBlank(message = "Residence Id cannot be blank")
	private String residenceId;
	

}
