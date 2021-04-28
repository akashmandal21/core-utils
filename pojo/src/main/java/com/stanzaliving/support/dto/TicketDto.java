package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    @NotBlank(message = "Sub-category Uuid cannot be blank/null")
    private String subCategoryUuid;

    private Date sla;

    @Valid
    private UserResidenceDto userResidenceDto;

    @NotBlank(message = "Description cannot be blank/null")
    private String description;

    private List<String> attachmentUuids;

    @NotBlank(message = "User uuid cannot be blank/null")
    private String createdBy;

    private Long id;

    private String uuid;

    private String assignedTo;
}
