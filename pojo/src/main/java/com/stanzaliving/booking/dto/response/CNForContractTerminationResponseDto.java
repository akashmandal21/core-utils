package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CNForContractTerminationResponseDto {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String invoiceType;
    private Double invoiceAmount;
    private Double creditNoteAmount;
}
