package com.stanzaliving.core.venta_aggregation;


import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class StanzaClusterAggregationDto {

    @JsonSetter(value = "uuid")
    private String stanzaClusterUuid;

    @JsonSetter(value = "stanza_city_uuid")
    private String stanzaCityUuid;

    @JsonSetter(value = "stanza_cluster_name")
    private String stanzaClusterName;
}
