package com.stanzaliving.support.dto;

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
    private String updatedBy;
    private Date updatedAt;
    private List<UserDetails> approvedBy;

    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserDetails {
        private String userLevel;
        private String name;
        private Date approvedAt;
        private TemplateStatus userApprovalStatus;
    }

}
