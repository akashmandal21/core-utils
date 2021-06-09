package com.stanzaliving.core.oracle.integration.dto;


import com.stanzaliving.core.oracle.integration.enums.EventType;
import com.stanzaliving.core.oracle.integration.enums.OracleServiceOwner;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Map;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class AbstractOracleDto implements Serializable {

    private static final long serialVersionUID = -3153893080214645255L;

    private OracleServiceOwner serviceOwner;

    private EventType eventType;

    private Map<String,Object> contextArgs;

}
