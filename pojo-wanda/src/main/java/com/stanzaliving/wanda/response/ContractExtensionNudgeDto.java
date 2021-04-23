package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContractExtensionNudgeDto {

	private String text1;
	private String text2;
	private String ctaText;
	private String addendumLink;
	private boolean blockerScreen;
	private boolean status;
	private String nudgeType;
	private String agreementLink;
	private String link;

}
