package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChecklistProgressDto {
    @NotBlank(message = "Checklist uuid cannot be empty")
    private String checklistUuid;
    @NotNull
    @JsonSetter("isMarkedNa")
    private boolean isMarkedNa;
    @NotNull
    @JsonSetter("isClosed")
    private boolean isClosed;
}
