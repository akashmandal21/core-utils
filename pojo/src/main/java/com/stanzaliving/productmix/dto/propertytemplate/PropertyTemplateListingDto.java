package com.stanzaliving.productmix.dto.propertytemplate;

import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateListingDto {

    private String templateId;

    private String templateUuid;

    private String templateName;

    private ApplicableDurationDto applicableDuration;

    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;

    private LocalDateTime updatedAt;

    private String actionedBy;

    private LocalDateTime actionedAt;

    private String templateStatus;

    private String backgroundColor;

    private String textColor;
}
