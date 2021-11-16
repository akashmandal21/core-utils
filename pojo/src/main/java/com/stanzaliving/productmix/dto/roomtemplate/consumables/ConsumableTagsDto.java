package com.stanzaliving.productmix.dto.roomtemplate.consumables;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumableTagsDto {
    private LabelValueDto<String> category;

    private String consumableTag;

    private String uniqueKey;

    private Integer quantity;
}
