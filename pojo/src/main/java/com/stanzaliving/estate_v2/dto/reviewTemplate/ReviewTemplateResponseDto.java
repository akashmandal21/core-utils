package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.estate_v2.dto.propertyOnboarding.PropertyNameDto;
import com.stanzaliving.estate_v2.dto.questionTemplate.ApplicableStatusesDto;
import com.stanzaliving.estate_v2.enumeration.Status;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewTemplateResponseDto {
    private String name;
    private PropertyNameDto finalName;
    private String id;
    private String propertyTypeUuid;
    private Status templateStatus;
    private List<ApplicableStatusesDto> propertyStatuses;
    private BasicInformationResponse basicInformation;
    private List<OtherInformationResponse> otherInformation;
    private boolean bedCountDetailsVisible;
    private boolean salesReviewVisible;
    private boolean propertyNaming;
    private BedCountInfoDto bedCountInformation;
    private List<LayoutResponse> layouts;

}
