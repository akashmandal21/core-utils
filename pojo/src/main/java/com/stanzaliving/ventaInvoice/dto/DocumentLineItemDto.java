package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.booking.enums.PaymentPlanType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentLineItemDto {
    private String lineItemDescription;
    private Double lineAmount;
    private PaymentPlanType callerServiceCategory;
    private String categoryUuid;
    private String subCategoryUuid;
    private String categoryName;
    private String subCategoryName;
    private float cgstAmount;
    private float sgstAmount;
    private float igstAmount;
    private float cgstPercentage;
    private float sgstPercentage;
    private float igstPercentage;
    private String hsnCode;
    private LocalDate fromDate;
    private LocalDate toDate;
}