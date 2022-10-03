package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.support.enums.ApprovalStatus;
import com.stanzaliving.support.enums.FaqStatus;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaqDto extends AbstractDto {
    private List<String> residenceUuid;
    private String complaintGroupUuid;
    private String categoryUuid;
    private FaqStatus faqStatus;
    private ApprovalStatus approvalStatus;
    private int maxApprovalLevel;
    private List<FaqActionDto> actions;
    private List<FaqDetailDto> faqDetail;
    private String complaintGroupName;
    private String categoryName;
    private BookingResidenceType residenceType;
}