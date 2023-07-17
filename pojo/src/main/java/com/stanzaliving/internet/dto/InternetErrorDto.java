package com.stanzaliving.internet.dto;

import java.time.LocalDate;

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
public class InternetErrorDto {

	private String studentId;

	private String propertyId;

	private LocalDate startDate;

	private LocalDate endDate;

	private String eventName;

	private String exception;

	private String message;

}
