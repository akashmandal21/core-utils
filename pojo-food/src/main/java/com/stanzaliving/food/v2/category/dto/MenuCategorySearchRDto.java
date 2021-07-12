package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.vendor.enums.VendorType;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategorySearchRDto extends AbstractDto {
    private String vendorName;
    private String versionId;
    private VendorType vendorType;
    private String categoryId;
    private MenuType menuType;
    private FoodServeType foodServeType;
    private CategoryStatus categoryStatus;
    private ApprovalStatus approvalStatus;
    private String mealWiseName;
    private String fullName;
    private Double mealPrice;
    private Long noOfResidenceServed;
    private List<ResidenceRDto> residences;
    private List<String> pendingApprovers;
    private List<ListingDto> tags;
}
