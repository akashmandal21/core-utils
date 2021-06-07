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
public class ServiceMixDto {
    @JsonSetter(value = "service_mix_status")
    private String status;

    @JsonSetter(value = "residence_id")
    private String residenceUuid;

}
