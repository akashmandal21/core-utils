package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.ApplicableDurationDto;
import com.stanzaliving.productmix.dto.LabelValueDto;
import com.stanzaliving.productmix.dto.propertytemplate.RoomRequestDto;
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
public class ProductMixRequestDto {

    private String uuid;

    private String productMixName;

    private ApplicableDurationDto applicableDuration;

    //todo: bed count and room count from API or can skip these?

    private List<RoomRequestDto> rooms;

    private String propertyTemplateUuid;

    private LabelValueDto<TemplateStatus> mixStatus;

    private boolean isActive;
}
