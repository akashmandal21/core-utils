package com.stanzaliving.core.po.generic.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ImageData {

	private String pathName;
	private String itemCode;
	private String itemUuid;
	private String itemName;
	private GsriOn createdOn;
	private String gsriId;	
	
}
