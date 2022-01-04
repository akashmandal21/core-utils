package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.boq_service.enums.GroupByEnum;
import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListingRequestDto {
    private String propertyUuid;

    private GroupByEnum groupBy;

    private List<ItemType> filterItemsBy;
}
