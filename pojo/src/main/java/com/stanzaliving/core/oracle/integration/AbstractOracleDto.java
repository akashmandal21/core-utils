package com.stanzaliving.core.oracle.integration;


import com.stanzaliving.transformations.enums.EventType;
import com.stanzaliving.transformations.enums.OracleServiceOwner;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class AbstractOracleDto {

    private OracleServiceOwner serviceOwner;
    private EventType eventType;
    private Map<String,Object> contextArgs;
}
