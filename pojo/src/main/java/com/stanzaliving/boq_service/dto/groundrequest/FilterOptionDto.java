package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.boq_service.dto.LabelValueCountDto;
import com.stanzaliving.boq_service.dto.LabelValueDto;
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
    private List<LabelValueCountDto<ItemType>> filterItemsBy;

    private List<LabelValueDto<GroupByEnum>> groupBy;
}
