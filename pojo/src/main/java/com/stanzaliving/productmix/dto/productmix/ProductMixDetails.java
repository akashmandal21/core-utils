package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
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

    @NotBlank(message = "Product mix uuid cannot be blank")
    private String uuid;

    @NotBlank(message = "Property uuid cannot be blank")
    private String propertyUuid;

    @NotBlank(message = "Product mix name cannot be blank")
    private String productMixName;

    private ApplicableDurationDto applicableDuration;

    private int noOfRooms;

    private List<String> uploadCsv;

    @NotNull
    @Valid
    private LabelValueDto<TemplateStatus> mixStatus;

    private boolean isActive;

    private String backgroundColor;

    private String textColor;

    private String templateId;

    private String actionedBy;

    private LocalDateTime actionedAt;

    private boolean canEdit;

    private boolean canApprove;
}
