package com.stanzaliving.generictaskservice.dto;


import com.stanzaliving.core.base.common.dto.AbstractDto;
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

public class AdditionalVarsDto  extends AbstractDto {

    private String variableName;
    private Type type;
    private Map<String, Object> dataStructure;
}
