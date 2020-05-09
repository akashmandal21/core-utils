package com.stanzaliving.transformations.pojo;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.transformations.enums.AreaType;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.RateType;
import com.stanzaliving.transformations.enums.UnitType;
import com.stanzaliving.transformations.enums.UseType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import com.stanzaliving.transformations.enums.WorkType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MasterBOIUIDto {

	private String uuid;

	@NotBlank(message = "Category is Mandatory for BOI Specification")
	private String category;

	@NotBlank(message = "Category Particular is Mandatory for BOI Specification")
	private String particular;
	
	private String categoryCode;

	@NotNull(message = "Rate Type is Mandatory for BOI Specification")
	private RateType rateType;

	@NotNull(message = "Default Rate Type is Mandatory for BOI Specification")
	private RateType defaultRate;
	
	private boolean rentalAvailable;
	
	private UnitType unitType;

	private String itemCode;

	@NotBlank(message = "Specification is Mandatory for BOI")
	private String specification;

	private List<BrandName> brandNames;

	private WorkType workType;

	private AreaType areaType;

	private UseType useType;
	
	private String dimension;
	
	private String brandName;
	
	private String subBrandName;
	
	private AreaOfUse areaOfUse;
	
	private List<String> areaOfUseList;
	
	private int slQty;
	
	private int llQty;
	
	private String image;
}