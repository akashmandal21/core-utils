package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomInventoryDto {
    private String inventoryUuid;
    private Date fromDate;
    private Date toDate;
}
