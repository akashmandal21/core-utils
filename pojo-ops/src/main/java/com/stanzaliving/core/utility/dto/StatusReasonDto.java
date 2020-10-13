package com.stanzaliving.core.utility.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StatusReasonDto {

	private Date time;
	
	@NotBlank(message = "Reason Cannot be blank")
	private String reason;
	
	private ReadingDto reading;
}