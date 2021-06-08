package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.item_master.enums.SortDirection;
import com.stanzaliving.item_master.enums.SortSpecs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FilterItemRecipeTagDto {

    //To send for front end
    private List<UIKeyValue> recipeTagStatusOptions;
    private List<UIKeyValue> recipeUomOptions;

    //To get form front end
    private List<UIKeyValue> recipeTagStatus;
    private List<UIKeyValue> recipeUom;

    @Valid
    @NotNull
    private Department department;

    //Sort
    private SortSpecs sortSpecs;
    private SortDirection sortDirection;

    //SearchKey should be a string or UIKeyValue?
    private String searchKey;
}
