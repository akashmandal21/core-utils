package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
public class MenuCategorySearchRDto extends AbstractDto {
    private String categoryId;
    private MenuType menuType;
    private CategoryStatus categoryStatus;
    private ApprovalStatus approvalStatus;
    private String mealName;
    private String fullName;
    private Double mealPrice;
    private Long noOfResidenceServed;
    private List<ResidenceRDto> residences;
    private List<String> pendingApprovers;
}
