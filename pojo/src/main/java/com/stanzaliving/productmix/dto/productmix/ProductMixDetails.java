package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.propertytemplate.RoomRequestDto;
import com.stanzaliving.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixDetails {

    @NotBlank
    private String uuid;

    @NotBlank
    private String propertyUuid;

    @NotBlank
    private String productMixName;

    @NotNull @Valid
    private ApplicableDurationDto applicableDuration;

    //todo: bed count and room count from API or can skip these?

    @NotNull @Valid
    private LabelValueDto<TemplateStatus> mixStatus;

    @NotNull
    private boolean isActive;

    @NotBlank
    private String backgroundColor;

    @NotBlank
    private String textColor;

    @NotBlank
    private String templateId;

    @NotBlank
    private String actionedBy;

    @NotNull
    private LocalDateTime actionedAt;

    @NotNull
    private boolean canEdit;

    @NotNull
    private boolean canApprove;
}
