package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;
import java.util.List;

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
public class RepairRateMasterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cityUuid;
	private String microMarketUuid;
	private List<EquipmentRateMasterDto> equipmentRateMasterDto;
}
