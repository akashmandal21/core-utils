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
public class FilterOptionDto {
    private List<ItemTypeCountDto> filterItemsBy;

    private List<GroupByEnum> groupBy;
}
