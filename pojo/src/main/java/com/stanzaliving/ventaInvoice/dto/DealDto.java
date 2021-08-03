package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DealDto {
    private String dealBillFromUuid;
    private Date contractStartDate;
    private Date contractEndDate;
    private String dealName;
    private String dealType;
    private List<String> residencesApplicable;

}
