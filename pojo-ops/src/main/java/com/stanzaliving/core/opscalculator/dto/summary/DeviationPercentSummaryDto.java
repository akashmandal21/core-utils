package com.stanzaliving.core.opscalculator.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@SuperBuilder
public class DeviationPercentSummaryDto extends MonthUnderwrittenSummaryDto {
    String foodCommentUuid;
    @Builder.Default
    String foodCategoryName = "food";
    String utilitiesCommentUuid;
    @Builder.Default
    String utilitiesCategoryName = "utilities";
    String securityCommentUuid;
    @Builder.Default
    String securityCategoryName = "security";
    String internetCommentUuid;
    @Builder.Default
    String internetCategoryName = "internet";
    String houseKeepingCommentUuid;
    @Builder.Default
    String houseKeepingCategoryName = "hk";
    String laundryCommentUuid;
    @Builder.Default
    String laundryCategoryName = "laundry";
    String repairAndMaintenanceCommentUuid;
    @Builder.Default
    String repairAndMaintenanceCategoryName = "repairAndMaintenance";
    String equipmentRentalCommentUuid;
    @Builder.Default
    String equipmentRentalCategoryName = "equipmentRental";
    String suppliesCommentUuid;
    @Builder.Default
    String suppliesCategoryName = "supplies";
}
