package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.UpdatedCategoryDto;
import com.stanzaliving.core.food.dto.request.CategoryApprovalUpdatedRuleDto;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryApprovalResponseDto {

    String foodMenuCategoryUuid;
    String foodMenuCategoryApprovalUuid;
    String categoryName;
    Double publishedCostPerDay;
    Double updatedCostPerDay;
    boolean isCostUpdated;
    boolean isNew;
    List<UpdatedCategoryDto> mealCostTiming;
    List<CategoryApprovalUpdatedRuleDto> updatedWeeklyComposition;
    List<CategoryApprovalUpdatedRuleDto> publishedWeeklyRulesComposition;
    int residenceCount;
    List<String> residenceNames;
    String cityUuid;
    String cityName;
    String micromarketUuid;
    String micromarketName;
}
