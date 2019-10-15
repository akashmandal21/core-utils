package com.stanzaliving.transformations.pojo;

import java.util.List;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.RateType;
import com.stanzaliving.transformations.enums.UnitType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MasterBOIUIDto {
	
	private String uuid;
	
	private String category;
	
	private String particular;
	
	private RateType rateType;
	
	private RateType defaultRate;
	
	private UnitType unitType;
	
	private String itemCode;
	
	private String specification;

	private List<BrandName> brandNames;
}

