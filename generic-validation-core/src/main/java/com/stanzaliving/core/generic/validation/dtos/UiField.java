package com.stanzaliving.core.generic.validation.dtos;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.stanzaliving.core.generic.validation.enums.Validator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UiField extends UiParentField {
    private Validator validator;
    private String regex;
    private String defaultErrorMsgValidation;
    private List<String> allowedExtensions;
    private List<Object> options;
    private Boolean isMultiSelect;
    private String errorMsg;

}