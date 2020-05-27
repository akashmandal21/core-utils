package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BookingInvoiceTransactionRecordDto extends BookingRecordDto {
    private Double payableAmount;
    private Double transactionAmount;
    private Double pastPayableAmount;
    private Double pastTransactionAmount;
}
