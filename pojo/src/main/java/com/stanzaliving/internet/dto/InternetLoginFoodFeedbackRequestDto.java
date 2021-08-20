package com.stanzaliving.internet.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class InternetLoginFoodFeedbackRequestDto {

	@NotEmpty(message = "Property Ids are mandatory")
	private List<String> proprtyIds;

	@NotNull(message = "Start Date is Mandatory")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "Asia/Kolkata")
	private Date startDate;

	@NotNull(message = "End Date is Mandatory")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "Asia/Kolkata")
	private Date endDate;

}
