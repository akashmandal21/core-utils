package com.stanzaliving.internet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetDetails {

	private boolean status;
	private String message;
	private String id;
	private String errorCode;
	private InternetProviderDetails data;
	private int httpStatusCode;

}
