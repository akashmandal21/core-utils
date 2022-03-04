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
public class NotifyUser {
	@NotEmpty(message = "userCode is a required field")
	private String userCode;

	@NotEmpty(message = "residenceId is a required field")
	private String residenceId;


}
