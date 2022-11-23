package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ConsumableTagResponse {
    String consumableTag;
    UIKeyValue itemCategory;
}
