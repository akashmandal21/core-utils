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
public class FilixOracleIntegrationToDto extends AbstractOracleDto {

    @JsonProperty("entityid")
    private String entityId;

    @JsonProperty("date")
    private String date;

    @JsonProperty("transferOrderNumber")
    private String transferOrderNumber;

    @JsonProperty("sourcelocation")
    private String sourceLocation;

    @JsonProperty("destinationlocation")
    private String destinationLocation;

    @JsonProperty("type")
    private String type;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("startDate")
    private String startDate;

    @JsonProperty("endDate")
    private String endDate;

    @JsonProperty("sourceGST")
    private String sourceGST;

    @JsonProperty("destinationGST")
    private String destinationGST;

    @JsonProperty("itemList")
    private List<TOItemDto> itemList;

}
