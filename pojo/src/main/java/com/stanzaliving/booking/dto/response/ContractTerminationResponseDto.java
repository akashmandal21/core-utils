package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractTerminationResponseDto {

    private List<CNForContractTerminationResponseDto> creditNoteList;
    private Double securityDepositAvailable;
    private Double advanceRentalAvailable;
    private Double ledgerBalance;
    private Double upcomingDues;
    private Double totalPendingDues;
    private Double totalRefundAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate auditDate;
}
