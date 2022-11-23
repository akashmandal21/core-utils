package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyLevelBoqActionsDto {
    private boolean allApproved;

    private boolean allRejected;

    private List<String> approvedBoqs;

    private List<String> rejectedBoqs;
}
