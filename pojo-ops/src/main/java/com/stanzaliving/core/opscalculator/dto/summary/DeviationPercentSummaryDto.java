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
    String foodCategoryName = null;
    String utilitiesCommentUuid;
    @Builder.Default
    String utilitiesCategoryName = null;
    String securityCommentUuid;
    @Builder.Default
    String securityCategoryName = null;
    String internetCommentUuid;
    @Builder.Default
    String internetCategoryName = null;
    String houseKeepingCommentUuid;
    @Builder.Default
    String houseKeepingCategoryName = null;
    String laundryCommentUuid;
    @Builder.Default
    String laundryCategoryName = null;
    String repairAndMaintenanceCommentUuid;
    @Builder.Default
    String repairAndMaintenanceCategoryName = null;
    String equipmentRentalCommentUuid;
    @Builder.Default
    String equipmentRentalCategoryName = null;
    String suppliesCommentUuid;
    @Builder.Default
    String suppliesCategoryName = null;
}
