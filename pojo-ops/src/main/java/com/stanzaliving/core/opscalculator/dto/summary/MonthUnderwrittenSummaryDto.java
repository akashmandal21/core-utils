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
    DisplaySummaryDto occupancyRoom;
    DisplaySummaryDto occupancy;
    LocalDate fromDate;     //not filled for AOP when returned finally i.e. during merging
    LocalDate toDate;       //not filled for AOP when returned finally i.e. during merging

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
