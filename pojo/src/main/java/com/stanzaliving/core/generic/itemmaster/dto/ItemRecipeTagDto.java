package com.stanzaliving.core.generic.itemmaster.dto;

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
    private String itemsMapped;
    private TimeAndDoneByDto lastUpdated;
    private TimeAndDoneByDto createdBy;
    private Boolean enabled;
    private String textColor;
    private String backgroundColor;
}
