package com.stanzaliving.support.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.enums.TicketRaisedForType;
import com.stanzaliving.support.enums.Priority;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequestDto {

    @NotBlank(message = "Sub-category Uuid cannot be blank/null")
    private String subCategoryUuid;

    @NotBlank(message = "Description cannot be blank/null")
    private String description;

    @NotNull(message = "AttachmentUuids key is missing")
    private List<String> attachmentUuids;

    @NotBlank(message = "Raised for user uuid cannot be blank/null")
    private String raisedFor;
    
    private TicketRaisedForType raisedForType;

    private String assignedToUuid;

    private String residenceUuid;

    private List<TagDto> tagDtos;

    private Department department;

    private List<String> applicableSubTicketList;

    private List<String> notApplicableSubTicketList;

    private Priority priority;

    private String complaintAttachmentUuid;

    @Builder.Default
    private String mailChainMessageId = StringUtils.EMPTY;

    @Builder.Default
    private String mailChainSubject = StringUtils.EMPTY;

    private String email;
    private String parentTicketUuid;
    private String serviceProvider;

}
