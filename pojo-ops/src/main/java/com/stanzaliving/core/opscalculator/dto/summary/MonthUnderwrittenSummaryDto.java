package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class MonthUnderwrittenSummaryDto extends CategorySummaryDto {
    String monthYear;
    DisplaySummaryDto occupancy;

    FoodSummaryDto foodSummaryDto;
    UtilitiesSummaryDto utilitiesSummaryDto;
    SecuritySummaryDto securitySummaryDto;
    InternetSummaryDto internetSummaryDto;
    HouseKeepingSummaryDto houseKeepingSummaryDto;
    LaundrySummaryDto laundrySummaryDto;
    RepairAndMaintenanceSummaryDto repairAndMaintenanceSummaryDto;
    EquipmentRentalSummaryDto equipmentRentalSummaryDto;
    SuppliesSummaryDto suppliesSummaryDto;
}
