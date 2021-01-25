package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ColorCode {

	//Please Refer this URL( https://www.colorhexa.com/ ) for finding Color Name from HexCode
	BLACK("#000000"),
	RED("#F1C0C6"),
	LIGHT_RED("#FF506E"),
	GREEN("#B8E986"),
	MODERATE_CYAN("#60C3AD"),
	WHITE("#FFFFFF"),
	PALE_ORANGE("#FFEAB6"),
	VIVID_ORANGE("#FFB701"),
	VERY_PALE_MOSTLY_WHITE_RED("#FFF1F1"),
	SOFT_RED("#F55F71"),
	BLUE("#0000ff"),
	SOFT_BLUE("#5FC4F5"),
	SOFT_GREEN("#EDFFF5"),
	GREEN_CYAN("#60C3AD");


	private String colorCode;

}