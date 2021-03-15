package com.stanzaliving.website.dto.ui;

import java.util.List;

import com.stanzaliving.website.enums.EnumFilterType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class FilterComponentUIDto extends FilterBaseUIDto{

	private Integer cityId;
	
	private EnumFilterType filterType;
	
	private List<FilterBaseUIDto> value;
}
