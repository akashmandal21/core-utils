package com.stanzaliving.core.paymentPlan.dto;

import com.stanzaliving.booking.enums.ReferenceType;
import com.stanzaliving.core.paymentPlan.enums.LineItemValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountBookDto {

    private LocalDate fromDate;

    private LocalDate toDate;

    private LocalDate executionDate;

    private Double amount;

    private String referenceId;

    private ReferenceType referenceType;

    private LineItemValue lineItemValue;

    private String source;

    private Map<String, String> metaData;

    private boolean visibleToResident;

    private boolean eligibleToInvoice;
}
