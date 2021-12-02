package com.stanzaliving.productmix.dto.propertytemplate;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.enums.PropertyTypeEnum;
import com.stanzaliving.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Note: Any fields modified in this class should also be modified in
 * com.stanzaliving.productmix.dto.propertytemplate.PropertyTemplateDtoWithValidations
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateDto {
    private String uuid;

    private String templateName;

    private ApplicableDurationDto applicableDuration;

    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<ZonesDto> zones;

    private LabelValueDto<TemplateStatus> templateStatus;

    private Boolean isActive;

    private String backgroundColor;

    private String textColor;

    private String templateId;

    private String actionedBy;

    private LocalDateTime actionedAt;

    private boolean canEdit;

    private boolean canApprove;
}
