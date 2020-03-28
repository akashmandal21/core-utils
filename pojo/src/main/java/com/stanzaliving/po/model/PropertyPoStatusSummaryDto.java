package com.stanzaliving.po.model;

import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.po.enums.POSummaryStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyPoStatusSummaryDto {
    PoType poType;
    POSummaryStatus poSummaryStatus;
}
