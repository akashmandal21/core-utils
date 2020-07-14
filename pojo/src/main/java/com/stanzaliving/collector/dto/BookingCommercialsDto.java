package com.stanzaliving.collector.dto;

import com.stanzaliving.collector.enums.MaintenanceFeeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCommercialsDto {
    Double maintenanceFeeAmount;
    MaintenanceFeeType maintenanceFeeType;
    Double securityDeposit;
}
