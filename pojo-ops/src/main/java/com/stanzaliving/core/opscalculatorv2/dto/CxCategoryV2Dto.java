package com.stanzaliving.core.opscalculatorv2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class CxCategoryV2Dto extends CategoryV2Dto {

	public boolean cxApplicable;
	public int costPerBed;

}
