package com.stanzaliving.ventaAudit.dto;


import com.stanzaliving.booking.enums.BookingResidenceType;
import com.stanzaliving.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditDetailsResponseDto {
    private String residentName;
    private String residentId;
    private BookingResidenceType propertyType;
    private String residentImageUrl;
    private StayLocationDto stayLocationDto;
    private String auditorName;
    private String auditorNumber;
    private LocalDate auditedOn;
    private AuditStatus auditStatus;
    private Double itemMissingAmount;
    private Double majorDamageAmount;
    private Double minorDamageAmount;
    private Double totalDamageAmount;
    private List<AuditItemsResponseDto> auditItemsResponseDtos;




}
