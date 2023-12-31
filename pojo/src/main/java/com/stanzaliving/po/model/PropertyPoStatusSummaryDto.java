package com.stanzaliving.po.model;

import com.stanzaliving.po.enums.POSummaryStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PropertyPoStatusSummaryDto {
    PoType poType;
    POSummaryStatus poSummaryStatus;
}
