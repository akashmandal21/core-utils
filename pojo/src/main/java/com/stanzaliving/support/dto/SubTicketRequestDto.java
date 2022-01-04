package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubTicketRequestDto {
    @NotBlank(message = "Task type uuid should not be blank")
    private String taskTypeUuid;
//    @NotBlank(message = "Team uuid should not be blank")
//    private String teamUuid;
    @NotBlank(message = "Assigned to should not be blank")
    private String assignedTo;
    @NotNull(message = "SLA time should not be null")
    private Long slaTime;
    @NotBlank(message = "Comments cannot be blank")
    private String comments;
}
