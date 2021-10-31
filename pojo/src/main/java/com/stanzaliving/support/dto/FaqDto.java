package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.ApprovalStatus;
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

    private String question;
    private String answer;
    private String uuid;
    private Integer sequence;
    private String categoryUuid;
    private String categoryName;
    private Date createdAt;
    private String createdBy;
    private TemplateStatus faqStatus;
    private ApprovalStatus approvalStatus;
    private String updatedBy;
    private Date updatedAt;
    private int maxApprovalLevel;
    private List<TemplateActionDto> actions;
    private String faqName;
}