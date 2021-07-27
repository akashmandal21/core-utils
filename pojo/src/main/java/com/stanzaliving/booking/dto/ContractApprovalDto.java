package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractApprovalDto {

    LocalDate fromDate;
    LocalDate toDate;
    String contractUuid;
    Object contractStatus;
    Set<String> roomUuid;
}
