package com.stanzaliving.core.generic.validation.dtos;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.stanzaliving.core.generic.validation.enums.TemplateType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UiBaseField {
    private String fieldName;
    private String alias;
    private boolean approved;
    private TemplateType uiPlacement;
    private JsonNode data;
    private JsonNode value;
    private JsonNode skeleton;
}