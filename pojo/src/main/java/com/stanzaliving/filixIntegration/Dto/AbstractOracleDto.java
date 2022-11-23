package com.stanzaliving.filixIntegration.Dto;
import lombok.*;
import com.stanzaliving.filixIntegration.Enum.EventType;
import com.stanzaliving.filixIntegration.Enum.OracleServiceOwner;
import java.util.HashMap;
import java.util.Map;
import lombok.experimental.SuperBuilder;

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