package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.support.enums.ApprovalStatus;
import com.stanzaliving.support.enums.FaqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaqDto {

    private List<String> residenceUuid;
    private String complaintGroupUuid;
    private String categoryUuid;
    private FaqStatus faqStatus;
    private List<FaqActionDto> actions;
    private List<FaqDetailDto> faqDetail;
}