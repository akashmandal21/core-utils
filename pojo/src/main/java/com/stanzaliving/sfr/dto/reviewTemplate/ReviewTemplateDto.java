package com.stanzaliving.sfr.dto.reviewTemplate;

import com.stanzaliving.sfr.dto.KeyValueDto;
import com.stanzaliving.sfr.dto.questionTemplate.ApplicableStatusesDto;
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
    private String propertyTypeName;
    private String templateStatus;
    private List<KeyValueDto> roles;
    private List<ApplicableStatusesDto> propertyStatuses;
    private boolean bedCountDetailsVisible;
    private boolean salesReviewVisible;
    private boolean propertyNaming;
    private boolean atlDocumentVisible;
    private boolean l1CallBackVisible;
    private boolean l2CallBackVisible;
    private boolean bypassVisible;
    private List<OtherInformationDto> otherInformation;
    private List<LayoutDto> layouts;
    private String propertyAction;
    private String moduleName;
}
