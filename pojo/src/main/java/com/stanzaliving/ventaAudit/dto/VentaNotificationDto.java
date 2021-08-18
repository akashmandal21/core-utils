package com.stanzaliving.ventaAudit.dto;

import com.stanzaliving.booking.enums.BookingEventEnum;
import com.stanzaliving.core.pojo.AttachmentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VentaNotificationDto {

    String bookingUuid;
    String residentUuid;
    String auditorUuid;
    List<AttachmentDto> attachmentDtos;
    BookingEventEnum eventEnum;
    String message;

}
