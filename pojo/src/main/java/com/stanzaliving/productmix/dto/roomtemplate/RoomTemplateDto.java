package com.stanzaliving.productmix.dto.roomtemplate;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.roomtemplate.consumables.ConsumableTagsDto;
import com.stanzaliving.productmix.enums.PropertyTypeEnum;
import com.stanzaliving.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Note: Any fields modified in this dto has to be modified in
 * com.stanzaliving.productmix.dto.roomtemplate.RoomTemplateDtoWithValidations
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomTemplateDto {
    private String uuid;

    private String templateName;

    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<LabelValueDto<String>> roomFeatures;

    private List<ConsumableTagsDto> consumables;

    private LabelValueDto<TemplateStatus> templateStatus;

//    private Boolean isReset;

    private Boolean isActive;

    private String backgroundColor;

    private String textColor;

    private String templateId;

    private boolean canEdit;

    private boolean canApprove;
}
