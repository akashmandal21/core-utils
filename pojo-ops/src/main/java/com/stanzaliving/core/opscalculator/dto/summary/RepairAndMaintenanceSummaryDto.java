package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class RepairAndMaintenanceSummaryDto extends CategorySummaryDto{;
	DisplaySummaryDto buildingMaintenance;
	DisplaySummaryDto pestControl;
	DisplaySummaryDto floorCleaning;
	DisplaySummaryDto overheadTankCleaning;
	DisplaySummaryDto undergroundTankCleaning;
	DisplaySummaryDto facadeCleaning;
	DisplaySummaryDto upholsteryCleaning;
	DisplaySummaryDto fumigationBedbugs;
	DisplaySummaryDto garbageCollection;

	DisplaySummaryDto repairMaintenance;
	DisplaySummaryDto amcCost;
	DisplaySummaryDto manpower;
	DisplaySummaryDto materialCost;
}
