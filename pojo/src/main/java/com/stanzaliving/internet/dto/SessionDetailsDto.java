package com.stanzaliving.internet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SessionDetailsDto {

	@NotBlank(message = "User Code cannot be blank")
	public String userCode;

	@NotNull(message = "Start Date cannot be null")
	private Date startDate;

	@NotNull(message = "End Date cannot be null")
	private Date endDate;

}
