package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilterDto {
    private String searchKey;
    private String documentType;
    private List<String> residenceId;
    private List<String> cityId;
    private List<String> microMarketId;
    private List<String> categoryId;
    private List<String> contractId;
    private DurationDTO issueDate;
    private DurationDTO applicabilityDuration;
}