package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlternateRecipeTagDto {

    private String currentRecipeTagUuid;
    private String currentRecipeTagName;
    private UIKeyValue currentRecipeTagUom;
    private List<UIKeyValue> alternateRecipeTagOptions;
    private UIKeyValue alternateRecipeTag;
    private Boolean errorOccurred;
    private String errorMessage;
    private List<ItemsMapped> items;
}
