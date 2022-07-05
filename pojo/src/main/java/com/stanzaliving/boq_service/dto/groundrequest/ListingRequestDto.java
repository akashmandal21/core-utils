package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.boq_service.enums.GroupByEnum;
import com.stanzaliving.item_master.enums.ItemType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingRequestDto {

    @Builder.Default
    private GroupByEnum groupBy = GroupByEnum.SUBCATEGORY;

    private String propertyUuid;

    private List<ItemType> filterItemsBy;

    private String searchKeyword;
}
