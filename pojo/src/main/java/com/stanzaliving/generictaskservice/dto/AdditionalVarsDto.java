package com.stanzaliving.generictaskservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdditionalVarsDto {
    private int id;
    private String variableName;
    private String type;
    private String dataStructure;
}
