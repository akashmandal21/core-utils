package com.stanzaliving.productmix.dto.response.propertytemplate;

import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateResponseDto {
    @NotBlank(message = "Template uuid should not be blank")
    private String uuid;

    @NotBlank(message = "Template name should not be blank")
    @Size(max = 255, message = "Size of template name exceeds size limit of 255 characters")
    private String templateName;

    @Valid
    private ApplicableDurationDto applicableDuration;

    @Valid
    private List<LabelValueDto> propertyType;

    @Valid
    private List<LabelValueDto> propertyBrand;

    @Valid
    private List<ZonesDto> zones;

    @Valid
    private LabelValueDto status;

    private String reasonToReject;

    @NotNull(message = "Reset status cannot be null")
    private Boolean isReset;
}
