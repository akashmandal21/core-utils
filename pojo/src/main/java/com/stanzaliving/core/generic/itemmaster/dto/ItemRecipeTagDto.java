package com.stanzaliving.core.generic.itemmaster.dto;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemRecipeTagDto {

    private String uuid;
    private String recipeTagName;
    private UnitType recipeTagUom;
    private long itemsMapped;
    private TimeAndDoneByDto lastUpdated;
    private TimeAndDoneByDto createdBy;
    private Boolean enabled;
    private String textColor;
    private String backgroundColor;
}
