package com.stanzaliving.core.boq_service.dtos;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoResponseDto {
    Map<ItemType,List<BoqLineItemDto>> masterBoqInfo;
    List<Map<ItemType,List<BoqLineItemDto>>> extraBoqInfo;
}
