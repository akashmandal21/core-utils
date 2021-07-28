package com.stanzaliving.productmix.dto.propertytemplate;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.leaddashboard.enums.PropertyTypeEnum;
import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Note: Any fields modified in this class should also be modified in
 * com.stanzaliving.productmix.dto.propertytemplate.PropertyTemplateDto
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateDtoWithValidations {
    @NotBlank(message = "Template uuid should not be blank")
    private String uuid;

    @NotBlank(message = "Template name should not be blank")
    @Size(max = 255, message = "Size of template name exceeds size limit of 255 characters")
    private String templateName;

    @Valid
    private ApplicableDurationDto applicableDuration;

    @Valid
    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    @Valid
    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    @Valid
    private List<ZonesDto> zones;

    @Valid
    private LabelValueDto<TemplateStatus> templateStatus;

//    @NotNull(message = "Reset status cannot be null")
//    private Boolean isReset;

    private Boolean isActive;

    private String backgroundColor;

    private String textColor;

    private String templateId;
}
