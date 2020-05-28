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
public class BookingInvoiceTransactionRecordDto extends BookingRecordDto implements Comparable {
    private Double payableAmount;
    private Double transactionAmount;
    private Double pastPayableAmount;
    private Double pastTransactionAmount;

    @Override
    public int compareTo(BookingInvoiceTransactionRecordDto bookingInvoiceTransactionRecordDto) {
        if (this.bookingUuid == bookingInvoiceTransactionRecordDto.getBookingUuid())
            return 0;
        if(Integer.valueOf(this.bookingUuid) > Integer.valueOf(bookingInvoiceTransactionRecordDto.getBookingUuid())){
            return 1;
        }
            return -1;
    }
}
