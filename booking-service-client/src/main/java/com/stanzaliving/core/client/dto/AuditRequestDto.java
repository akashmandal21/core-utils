package com.stanzaliving.core.client.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditRequestDto {

    private String bookingUuid;

    private String residenceUuid;

    private LocalDate auditDate;

    private String userUuid;

    private String roomNumber;

    private String residentId;

    private String roomUuid;
}
