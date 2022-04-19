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

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Note: Any fields modified in this dto has to be modified in
 * com.stanzaliving.productmix.dto.roomtemplate.RoomTemplateDto
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomTemplateDtoWithValidations {
    private String uuid;

    @NotBlank(message = "Template name should not be blank")
    @Size(max = 255, message = "Size of template name exceeds size limit of 255 characters")
    private String templateName;

    @Valid
    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    @Valid
    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    @Valid
    private List<LabelValueDto<String>> roomFeatures;

    @Valid
    private List<ConsumableTagsDto> consumables;

    @Valid
    private LabelValueDto<TemplateStatus> templateStatus;

//    @NotNull(message = "Reset status cannot be null")
//    private Boolean isReset;

    private Boolean isActive;

    private String backgroundColor;

    private String textColor;

    private String templateId;

    private boolean canEdit;

    private boolean canApprove;
}
