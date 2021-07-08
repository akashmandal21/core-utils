package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MergeTicketDto {
    @NotBlank(message = "Primary Ticket cannot be null")
    private String primaryTicketUuid;
    @NotNull(message = "Secondary ticket ID's cannot be null")
    private List<String> secondaryTicketUuids;
    @NotBlank(message = "Message cannot be null")
    private String message;
    @JsonSetter("isPrivate")
    private boolean isPrivate;
    private String mergedBy;
}
