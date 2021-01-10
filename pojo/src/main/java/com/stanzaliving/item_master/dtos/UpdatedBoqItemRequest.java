package com.stanzaliving.item_master.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatedBoqItemRequest {
    private String itemUuid;
    private boolean status;
    private Date lastUpdatedAt;
    private Double rate;
}
