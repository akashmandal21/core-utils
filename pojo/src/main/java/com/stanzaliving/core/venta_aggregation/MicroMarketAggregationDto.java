package com.stanzaliving.core.venta_aggregation;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MicroMarketAggregationDto {

    @JsonSetter(value = "uuid")
    private String microMarketId;

    @JsonSetter(value = "micromarket_name")
    private String microMarketName;

    @JsonSetter(value = "city_id")
    private Integer cityId;

    @JsonSetter(value = "stanza_cluster_uuid")
    private String stanzaClusterUuid;


}
