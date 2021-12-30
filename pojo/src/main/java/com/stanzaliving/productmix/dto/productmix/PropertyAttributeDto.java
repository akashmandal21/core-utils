package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.propertytemplate.ZonesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyAttributeDto {
    @NotNull(message = "Property template cannot be null")
    @Valid
    private LabelValueDto<String> propertyTemplate;

    private List<LabelValueDto<String>> propertyTemplateOptions;

    private Map<String, List<ZonesDto>> propertyTemplateOptionsData;

    private String errorMsg;

    private boolean errorOccurred;
}
