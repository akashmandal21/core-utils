package com.stanzaliving.productmix.dto.meta;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.enums.PropertyTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropDownsDto {
    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<LabelValueDto<String>> roomFeatures;

}
