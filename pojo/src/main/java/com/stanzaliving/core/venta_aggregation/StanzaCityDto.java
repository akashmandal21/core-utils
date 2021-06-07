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
public class StanzaCityDto {

    @JsonSetter(value="uuid")
    private String uuid;

    @JsonSetter(value="stanza_city_name")
    private String stanzaCityName;
}
