package com.stanzaliving.core.po.generic.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ImageData {

	private String pathName;
	private String itemCode;
	private String itemUuid;
	private String itemName;
	private GsriOn createdOn;
	private String gsriId;	
	
}
