package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.BrandName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterItemRequest {

	private long cityId;

	private String categoryName;

	private BrandName brandName;

	private String searchParam;

	private int pageNum;

	private int pageSize;
}