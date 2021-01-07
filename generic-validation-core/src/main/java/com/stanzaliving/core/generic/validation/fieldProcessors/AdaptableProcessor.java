package com.stanzaliving.core.generic.validation.fieldProcessors;

import com.stanzaliving.core.generic.validation.dtos.ErrorInfo;
import com.stanzaliving.core.generic.validation.dtos.TemplateField;
import com.stanzaliving.core.generic.validation.dtos.UiBaseField;
import com.stanzaliving.core.generic.validation.dtos.UiField;

import java.util.Map;

public interface AdaptableProcessor {
    Object updateApprovalData(UiBaseField uiBaseField, TemplateField field, Object val, Map<String, Object> additionalData, ErrorInfo errorInfo);
    Object convertToUIValue(TemplateField field, UiField uiField, Object val, Map<String, Object> additionalData);
    void convertFromUIValue(TemplateField field, UiField uiField, Object val, Map<String, Object> additionalData, ErrorInfo errorInfo);
}
