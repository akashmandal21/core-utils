package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;

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
public class NucleusRateMasterDataConfig implements Serializable  {
		
	private static final long serialVersionUID = 1L;
	
	private String cityUuid;
	
	private String microMarketUuid;
	
	private PersonnelRateMasterDto personnelRateMasterDto;
	
	private RepairRateMasterDto repairRateMasterDto;
	
	private BuildMaintenanceRateMasterDto buildMaintenanceRateMasterDto;
	
	private LaundryRateMasterDto laundryRateMasterDto;
	
	private UniformRateMasterDto uniformRateMasterDto;
	
	private AuditRateMasterDto auditRateMasterDto;
	
	private EquipmentRentalRateMasterDto equipmentRentalRateMasterDto;
	
}
