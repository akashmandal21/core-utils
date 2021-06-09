package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.food.v2.category.constant.CategorySearchSortingField;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.constants.SortingType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
    private CategoryStatus categoryStatus;
    private ApprovalStatus approvalStatus;
    private String name;
    private List<String> tagId;
    private String cityId;
    private String vendorId;
    private SortingType sortingType;
    private CategorySearchSortingField sortingField;
    private Boolean published;
    private boolean isDetailed;
    private boolean approvalDataRequired=true;
    private Boolean approvalDashBoard;
}
