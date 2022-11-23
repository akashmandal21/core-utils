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
    private String currentRecipeTagUom;
    private List<UIKeyValue> alternateRecipeTagOptions;
    private UIKeyValue alternateRecipeTag;
    @Builder.Default
    private Boolean errorOccurred=false;

    private String errorMsg;
    private List<ItemsMapped> items;
}
