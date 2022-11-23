package com.stanzaliving.core.generic.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PoStatusEnum {

	IN_DRAFT("In Draft","#7A7D7E","#E6E9EA"),
	L1_APPROVAL("L1 Approval Due", "#FFB701","#FFEAB6"),
	L2_APPROVAL("L2 Approval Due", "#FFB701","#FFEAB6"),
	L3_APPROVAL("L3 Approval Due", "FFB701", "FFEAB6"),
	L1_SENT("L1 Sent Back", "#F55F71", "#FBC9CF"),
	L2_SENT("L2 Sent Back", "#F55F71", "#FBC9CF"),
	L3_SENT("L3 Sent Back", "#F55F71", "#FBC9CF");
	
	private String name;
	private String color;
	private String backGroundColor;
	
}
