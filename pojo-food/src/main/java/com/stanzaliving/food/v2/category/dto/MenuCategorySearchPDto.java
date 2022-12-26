package com.stanzaliving.food.v2.category.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.food.v2.category.constant.CategorySearchSortingField;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.constant.SortingType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategorySearchPDto implements Serializable {

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<String> residenceIds;
    private List<CategoryStatus> categoryStatus;
    private List<ApprovalStatus> approvalStatus;
    private String name;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<String> tagIds;
    private String cityId;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<String> vendorId;
    private SortingType sortingType;
    private CategorySearchSortingField sortingField;
    private Boolean published;
    private Boolean detailsRequired;
    private Boolean grammageVariationRequired;
    private Boolean approvalDataRequired;
    private Boolean approvalDashBoard;
    private Boolean clonable;
    private Boolean menuSubmitted;
    private FoodServeType serveType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private String categoryVersionId;

}

