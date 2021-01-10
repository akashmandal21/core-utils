package com.stanzaliving.core.generic.validation.dtos;


import com.stanzaliving.core.generic.validation.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TemplateField {
    private String fieldName;
    private boolean mandatory;
    private boolean editable;
    private Integer editableOrder;
    private String alias;
    private Object defaultValue;
    private FieldType fieldType;
    private FieldType fieldSubType;
    private TemplateType templateType;
    private boolean approvable;
    private List<Integer> approvalLevels;
    private ApprovalDepth approvalDepth;
    private UIFieldType uiType;
    private String valueClass;
    private String sectionClass;
    private FieldOptionProvider optionProvider;
    private Validator validator;
    private String regex;
    private String defaultErrorMsgValidation;
    private List<String> allowedExtensions;
    private List<Object> options;
    private Boolean isMultiSelect;
    private ApprovalMetaInfo approvalDetails;
}