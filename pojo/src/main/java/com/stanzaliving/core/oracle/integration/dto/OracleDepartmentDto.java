package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public class OracleDepartmentDto extends AbstractOracleDto {

    @JsonProperty("entityid")
    String entityId;

    String name;

}
