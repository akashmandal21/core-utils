package com.stanzaliving.core.opscalculatorv2.dto;

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
public class NucleusRateMasterDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private NucleusRateMasterData nucleusRateMasterData;

	protected boolean active;

}
