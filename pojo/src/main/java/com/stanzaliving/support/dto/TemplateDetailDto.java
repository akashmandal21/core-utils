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
@AllArgsConstructor
@NoArgsConstructor
public class TemplateDetailDto {

    @NotBlank(message = "Template name cannot be null")
    private String templateName;
    @NotBlank(message = "Template description cannot be null")
    private String templateDescription;
    private String uuid;
    private Date createdAt;
    private String createdBy;
    private TemplateStatus templateStatus;
    private ApprovalStatus approvalStatus;
    private String updatedBy;
    private Date updatedAt;
    private int maxApprovalLevel;
    private List<TemplateActionDto> actions;

}
