package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BookingInvoiceTransactionDateRecordDto extends BookingRecordDto {
    private Double payableAmount;
    private Double transactionAmount;
    LocalDate date;
}
