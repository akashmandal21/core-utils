package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.ApprovalStatus;
import com.stanzaliving.support.enums.FaqStatus;
import com.stanzaliving.support.enums.TemplateStatus;
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
public class FaqDto {

    @NotBlank(message = "Faq name cannot be null")
    private String faqName;
//    @NotBlank(message = "Question cannot be null")
//    private String question;
//    @NotBlank(message = "Answer cannot be null")
//    private String answer;
    private String uuid;
    private Integer sequence;
    private boolean visible;
    private String residenceUuid;
    private Date createdAt;
    private String createdBy;
    private FaqStatus faqStatus;
    private ApprovalStatus approvalStatus;
    private String updatedBy;
    private Date updatedAt;
    private int maxApprovalLevel;
    private List<FaqActionDto> actions;
    private List<FaqDetailDto> faqDetail;
}