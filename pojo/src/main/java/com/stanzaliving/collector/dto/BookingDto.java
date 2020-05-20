package com.stanzaliving.collector.dto;

import com.stanzaliving.collector.enums.BookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    String bookingStatus;
    Date contractStartDate;
    Date contractEndDate;
    String ventaUserUuid;
    String lockIn;
    BookingType bookingType;
}