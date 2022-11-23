package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.generic.itemmaster.enums.ItemMetaInfoTypes;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ItemMetaUpdateDto {
    private ItemMetaInfoTypes updateType;
    private ItemMetaDto metaDto;
}
