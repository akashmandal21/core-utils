package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FilixOracleIntegrationAdjustInventoryDto extends AbstractOracleDto {

    @JsonProperty("date")
    private String date;

    @JsonProperty("stanzaId")
    private String stanzaId;

    @JsonProperty("postingPeriod")
    private String postingPeriod;

    @JsonProperty("itemList")
    private List<AdjustInventoryItemDto> itemList;

}
