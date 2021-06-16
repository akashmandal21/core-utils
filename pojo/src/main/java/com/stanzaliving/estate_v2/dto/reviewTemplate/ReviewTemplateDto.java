package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.estate_v2.dto.questionTemplate.ApplicableStatusesDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewTemplateDto {
    private String id;
    private String name;
    private String propertyTypeUuid;
    private String templateStatus;
    private List<ApplicableStatusesDto> propertyStatuses;
    private List<OtherInformationDto> otherInformation;
    private List<LayoutDto> layouts;
}
