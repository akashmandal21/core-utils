package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.food.v2.category.constant.CategorySearchSortingField;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.constant.SortingType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategorySearchPDto implements Serializable {
    private List<String> residenceIds;
    private List<CategoryStatus> categoryStatus;
    private List<ApprovalStatus> approvalStatus;
    private String name;
    private List<String> tagId;
    private String cityId;
    private List<String> vendorId;
    private SortingType sortingType;
    private CategorySearchSortingField sortingField;
    private Boolean published;
    private boolean isDetailed;
    @Builder.Default
    private boolean isGrammageVariation=false;
    @Builder.Default
    private boolean approvalDataRequired=true;
    private Boolean approvalDashBoard;
    private Boolean clonable;
}
