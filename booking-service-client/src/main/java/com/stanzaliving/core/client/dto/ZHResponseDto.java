package com.stanzaliving.core.client.dto;


import java.time.LocalDate;

import com.stanzaliving.core.enums.ApprovalStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZHResponseDto {

    private ApprovalStatus approvalStatus;
    private LocalDate contractTerminationDate;
    private String zonalHeadRemark; //todo: add validation
    private String bookingUuid;
    private String bookingStatus;
}
