package com.stanzaliving.internet.dto;

import com.stanzaliving.internet.enums.InternetVendor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class IonLoginSummaryDto {

	private String studentId;
	private String residenceId;
	private InternetVendor internetVendor;

}