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

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateListingFilterDto {

    private List<LabelValueDto<TemplateStatus>> templateStatus;

    private List<LabelValueDto<String>> createdBy;

    private List<LabelValueDto<String>> actionedBy;

    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<ZonesDto> zones;

    private ApplicableDurationDto applicableDuration;

    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 20;

    @Builder.Default
    private String sortBy = "updatedAt";

    @Builder.Default
    private String sortOrder = "asc";
}
