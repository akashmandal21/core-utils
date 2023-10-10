package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTypeDto {

    @Builder.Default
    private List<String> assignedTo = new ArrayList<>();

    @Builder.Default
    private List<String> updatedBy = new ArrayList<>();

    @Builder.Default
    private List<String> resolvedBy = new ArrayList<>();
}
