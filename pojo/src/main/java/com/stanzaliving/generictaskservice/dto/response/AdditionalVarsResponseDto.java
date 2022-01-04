package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.generictaskservice.enums.Type;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalVarsResponseDto {

    private String variableName;

    private Type type;

    private Map<String, Object> dataStructure;
}
