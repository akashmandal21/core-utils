package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DealDto {
    private String dealBillFromUuid;
    private LocalDate dealContractStartDate;
    private LocalDate dealContractEndDate;
    private String dealName;
    private String dealType;
    private List<String> residencesApplicable;

}
