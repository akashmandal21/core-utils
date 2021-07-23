package com.stanzaliving.productmix.dto.propertytemplate;

import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateDto {
    private String uuid;

    private String templateName;

    private ApplicableDurationDto applicableDuration;

    private List<LabelValueDto> propertyType;

    private List<LabelValueDto> propertyBrand;

    private List<ZonesDto> zones;

    private LabelValueDto status;

    private String reasonToReject;

    private Boolean isReset;
}
