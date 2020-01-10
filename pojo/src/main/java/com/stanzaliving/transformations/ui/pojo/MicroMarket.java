package com.stanzaliving.transformations.ui.pojo;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MicroMarket {

	private String microMarketName;
	
	private Long id;
	
	private String uuid;
}
