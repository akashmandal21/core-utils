package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.enums.PropertyTypeEnum;
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
public class ProductMixListingFilterDto {
    private String uuid;

    private List<LabelValueDto<TemplateStatus>> productMixStatus;

    private List<LabelValueDto<String>> createdBy;

    private List<LabelValueDto<String>> updatedBy;

    private List<LabelValueDto<String>> actionedBy;

    private List<LabelValueDto<String>> roomFeatures;

    private List<LabelValueDto<String>> consumables;

    private List<LabelValueDto<String>> zones;

    private List<LabelValueDto<String>> attributes;

    private ApplicableDurationDto applicableDuration;

    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 20;

    @Builder.Default
    private String sortBy = "UpdatedAt";

    @Builder.Default
    private String sortOrder = "desc";

}
