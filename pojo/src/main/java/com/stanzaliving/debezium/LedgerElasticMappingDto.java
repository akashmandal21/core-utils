package com.stanzaliving.debezium;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LedgerElasticMappingDto {

    private String bookingUuid;
    private String referenceType;
    private Double totalLedgerBalance;
    private String ledgerStatus;
}
