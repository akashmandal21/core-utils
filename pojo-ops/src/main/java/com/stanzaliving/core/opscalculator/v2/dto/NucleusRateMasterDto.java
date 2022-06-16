package com.stanzaliving.core.opscalculator.v2.dto;

import java.util.List;

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
public class NucleusRateMasterDto extends AbstractDto  {

	private static final long serialVersionUID = 1L;
		
	private List<PersonnelRateMasterDto> personnelRateMasterDto;
	
	private List<RepairRateMasterDto> repairRateMasterDto;
	
	private List<BuildMaintenanceRateMasterDto> buildMaintenanceRateMasterDto;
	
	private List<LaundryRateMasterDto> laundryRateMasterDto;
	
	private List<UniformRateMasterDto> uniformRateMasterDto;
	
	private List<AuditRateMasterDto> auditRateMasterDto;
	
}
