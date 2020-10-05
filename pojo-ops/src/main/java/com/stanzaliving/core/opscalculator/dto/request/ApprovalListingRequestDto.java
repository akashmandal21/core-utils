package com.stanzaliving.core.opscalculator.dto.request;

import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalListingRequestDto {
    private List<String> residenceUuids = new ArrayList<>();
    private int start;
    private int size;
    private String role;
    private List<ApprovalStatus> approvalStatusList;
}
