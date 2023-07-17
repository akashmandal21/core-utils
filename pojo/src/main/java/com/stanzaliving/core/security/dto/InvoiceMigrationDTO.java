package com.stanzaliving.core.security.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceMigrationDTO {

    @JsonSetter(value = "BOOKING_ID")
    private String bookingId;

    @JsonSetter(value = "INVOICE_TYPE")
    private Integer invoiceType;

    @JsonSetter(value = "INVOICE_AMOUNT")
    private Double invoiceAmount;
}
