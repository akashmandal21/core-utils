package com.stanzaliving.collector.dto;

import com.stanzaliving.dashboard.dto.RecordDto;
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
public abstract class BookingRecordDto extends RecordDto {
    String bookingUuid;
}
