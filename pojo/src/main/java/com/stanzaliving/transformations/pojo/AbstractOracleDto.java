package com.stanzaliving.transformations.pojo;


import com.stanzaliving.transformations.enums.EventType;
import lombok.*;

import java.util.Map;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AbstractOracleDto {

    private String serviceOwner;
    private EventType eventType;
    private Map<String,Object> contextArgs;
}
