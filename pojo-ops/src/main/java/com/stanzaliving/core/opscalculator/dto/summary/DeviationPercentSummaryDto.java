package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.constants.UnderwrittenCalculatorCategory;
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
    String foodCategoryName = UnderwrittenCalculatorCategory.FOOD.toString();
    String utilitiesCommentUuid;
    @Builder.Default
    String utilitiesCategoryName = UnderwrittenCalculatorCategory.UTILITIES.toString();
    String securityCommentUuid;
    @Builder.Default
    String securityCategoryName = UnderwrittenCalculatorCategory.SECURITY.toString();
    String internetCommentUuid;
    @Builder.Default
    String internetCategoryName = UnderwrittenCalculatorCategory.INTERNET.toString();
    String houseKeepingCommentUuid;
    @Builder.Default
    String houseKeepingCategoryName = UnderwrittenCalculatorCategory.HK.toString();
    String laundryCommentUuid;
    @Builder.Default
    String laundryCategoryName = UnderwrittenCalculatorCategory.LAUNDRY.toString();
    String repairAndMaintenanceCommentUuid;
    @Builder.Default
    String repairAndMaintenanceCategoryName = UnderwrittenCalculatorCategory.REPAIR.toString();
    String equipmentRentalCommentUuid;
    @Builder.Default
    String equipmentRentalCategoryName = UnderwrittenCalculatorCategory.EQUIPMENT.toString();
    String suppliesCommentUuid;
    @Builder.Default
    String suppliesCategoryName = UnderwrittenCalculatorCategory.SUBSCRIPTION.toString();
    String transportCommentUuid;
    @Builder.Default
    String transportCategoryName = UnderwrittenCalculatorCategory.TRANSPORT.toString();
    String auditCommentUuid;
    @Builder.Default
    String auditCategoryName = UnderwrittenCalculatorCategory.AUDIT.toString();
    String uniformCommentUuid;
    @Builder.Default
    String uniformCategoryName = UnderwrittenCalculatorCategory.UNIFORM_COSTS.toString();
    String personnelCommentUuid;
    @Builder.Default
    String personnelCategoryName = UnderwrittenCalculatorCategory.PERSONNEL.toString();
}
