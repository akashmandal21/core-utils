package com.stanzaliving.venta;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BookingAggElasticDto extends PaginationRequest {
    private long startDate;
    private long finalDate;
    private boolean completeSync;
}