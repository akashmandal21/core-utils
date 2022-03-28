package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingRequestDto {
    private String groupBy;

    private String propertyUuid;

    private List<ItemType> filterItemsBy;
}
