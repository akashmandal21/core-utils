package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OracleGrnRequestDto extends AbstractOracleDto {

    private String purchaseOrderNumber;
    private String stanzaId;
    private String transferOrder;
    private String installationLocationType;
    private String installationLocation;
    private String receivingLocationType;
    private String receivingLocation;
    private String date;
    Collection<OracleItemDetailsDto> itemList;

}
