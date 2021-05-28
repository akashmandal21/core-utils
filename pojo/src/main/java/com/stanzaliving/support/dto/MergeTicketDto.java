package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MergeTicketDto {
    private String primaryTicketUuid;
    private List<String> secondaryTicketUuids;
    private String message;
    private String messagedBy;
    @JsonSetter("isPrivate")
    private boolean isPrivate;
}
