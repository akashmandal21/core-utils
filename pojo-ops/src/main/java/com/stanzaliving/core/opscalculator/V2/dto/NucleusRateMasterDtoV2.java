package com.stanzaliving.core.opscalculator.V2.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class NucleusRateMasterDtoV2 extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private NucleusRateMasterDataV2 nucleusRateMasterDataV2;

	protected boolean active;
			
}
