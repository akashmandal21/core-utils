package com.stanzaliving.internet.request;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

	@NotEmpty(message = "userId is a required field")
	private String userId;

	@NotEmpty(message = "residenceId is a required field")
	private String residenceId;

	@NotEmpty(message = "topUpId is a required field")
	private String topUpId;

}
