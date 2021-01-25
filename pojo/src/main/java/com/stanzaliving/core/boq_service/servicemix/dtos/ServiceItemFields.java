package com.stanzaliving.core.boq_service.servicemix.dtos;

import com.stanzaliving.core.boq_service.servicemix.enums.FieldType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class ServiceItemFields {
    private String fieldName;
    private String alias;
    private String defaultValue;
    private FieldType fieldType;
    private List<String> fieldOptions;
    private Boolean isMultiSelect;
}
