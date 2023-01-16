package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.estate_v2.dto.propertyOnboarding.PropertyNameDto;
import com.stanzaliving.estate_v2.dto.questionTemplate.ApplicableStatusesDto;
import com.stanzaliving.estate_v2.enumeration.Status;
import lombok.*;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewTemplateResponseDto {
    private String name;
    private PropertyNameDto finalName;
    private String propertyStatus;
    private String id;
    private String propertyTypeUuid;
    private Status templateStatus;
    private List<ApplicableStatusesDto> propertyStatuses;
    private BasicInformationResponse basicInformation;
    private List<OtherInformationResponse> otherInformation;
    private List<String> mappedQuestionsUuid;
    private boolean atlDocumentVisible;
    private boolean bedCountDetailsVisible;
    private boolean salesReviewVisible;
    private boolean propertyNaming;
    private boolean l1CallBackVisible;
    private boolean l2CallBackVisible;
    private boolean bypassVisible;
    private boolean dealScoreVisible;
    private boolean questionnaireVisible;
    private boolean isNamedPropertyDetailsEditable;
    private boolean viewOnly;
    private BedCountInfoDto bedCountInformation;
    private List<LayoutResponse> layouts;
    private String propertyAction;
    private boolean suggestedLanguageEditable;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date propertyApprovalTime;
    private Boolean cmNameVisible;
    private String salesReviewSubmittedBy;
    private Date salesReviewSubmittedOn;
    private boolean isMigrated;

}
