package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

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

    private String assignedToUuid;

    private List<TagDto> tagDtos;
}
