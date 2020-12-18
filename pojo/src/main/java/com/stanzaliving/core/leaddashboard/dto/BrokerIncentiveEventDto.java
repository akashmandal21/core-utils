package com.stanzaliving.core.leaddashboard.dto;

import com.stanzaliving.core.leaddashboard.enums.BrokerIncentiveEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BrokerIncentiveEventDto {
    private String incentiveToBrokerId;
    private String incentiveToBrokerMobile;
    private String incentiveFromId;
    private String incentiveFromMobile;
    private BrokerIncentiveEnum incentiveType;
}