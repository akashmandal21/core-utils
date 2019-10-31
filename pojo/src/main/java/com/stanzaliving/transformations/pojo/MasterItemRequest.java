package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.BrandName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MasterItemRequest {

	private String categoryName;
	
	private BrandName brandName;
	
	private int pageNum;
	
	private int pageSize;
}
