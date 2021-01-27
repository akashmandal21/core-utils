package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class MonthUnderwrittenSummaryDto extends CategorySummaryDto {
    String monthYear;
    DisplaySummaryDto occupancy;
    LocalDate fromDate;
    LocalDate toDate;

    FoodSummaryDto foodSummaryDto;
    UtilitiesSummaryDto utilitiesSummaryDto;
    SecuritySummaryDto securitySummaryDto;
    InternetSummaryDto internetSummaryDto;
    HouseKeepingSummaryDto houseKeepingSummaryDto;
    LaundrySummaryDto laundrySummaryDto;
    RepairAndMaintenanceSummaryDto repairAndMaintenanceSummaryDto;
    EquipmentRentalSummaryDto equipmentRentalSummaryDto;
    SuppliesSummaryDto suppliesSummaryDto;
    TransportSummaryDto transportSummaryDto;
    AuditSummaryDto auditSummaryDto;
    UniformSummaryDto uniformSummaryDto;
    PersonnelSummaryDto personnelSummaryDto;
}
