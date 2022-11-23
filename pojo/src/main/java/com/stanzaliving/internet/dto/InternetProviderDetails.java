package com.stanzaliving.internet.dto;

import com.stanzaliving.internet.enums.InternetVendor;
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

public class InternetProviderDetails {
	
	private boolean active;
	private String planId;
	private InternetVendor vendor;
	private int devices;
}
