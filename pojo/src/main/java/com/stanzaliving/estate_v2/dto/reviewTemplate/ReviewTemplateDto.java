package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.estate_v2.dto.KeyValueDto;
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
    private String propertyTypeName;
    private String templateStatus;
    private List<KeyValueDto> roles;
    private List<String> mappedQuestionsUuid;
    private List<KeyValueDto> viewOnlyRoles;
    private List<ApplicableStatusesDto> propertyStatuses;
    private boolean bedCountDetailsVisible;
    private boolean salesReviewVisible;
    private boolean propertyNaming;
    private boolean atlDocumentVisible;
    private boolean l1CallBackVisible;
    private boolean l2CallBackVisible;
    private boolean viewOnly;
    private boolean bypassVisible;
    private boolean dealScoreVisible;
    private boolean questionnaireVisible;
    private boolean isNamedPropertyDetailsEditable;
    private List<OtherInformationDto> otherInformation;
    private List<LayoutDto> layouts;
    private String propertyAction;
    private boolean suggestedLanguageEditable;
}
