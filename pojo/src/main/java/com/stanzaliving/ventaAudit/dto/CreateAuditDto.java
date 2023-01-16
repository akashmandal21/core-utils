package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAuditDto {

    private String auditUuid;
    @NotBlank(message = "auditorUuid Is Required")
    private String auditorUuid;
    private LocalDateTime auditedOn;
    @NotBlank(message = "auditScheduledAt Is Required")
    private LocalDate auditScheduledOn;
    @NotBlank(message = "auditorName Is Required")
    private String auditorName;
    @NotBlank(message = "BookingUuid Is Required")
    private String bookingUuid;
    @NotBlank(message = "ResidentUuid Is Required")
    private String residentUuid;
    @NotBlank(message = "ResidentId Is Required")
    private String residentId;
    @NotBlank(message = "ResidentName Is Required")
    private String residentName;
    @NotBlank(message = "Resident's room no. Is Required")
    private String roomNumber;
    @NotBlank(message = "Resident's room uuid Is Required")
    private String roomUuid;
    @NotNull(message = "City id is required")
    private String cityUuid;
    @NotNull(message = "MicroMarket id Is required")
    private String microMarketUuid;
    @NotBlank(message = "Society Uuid Is required")
    private String societyUuid;
    @NotBlank(message = "Entity Uuid Is required")
    private String entityUuid;
    @NotBlank(message = "Entity Name Is required")
    private String entityName;
    @NotBlank(message = "Stanza Uuid Is required")
    private String stanzaCityUuid;
    @NotBlank(message = "StanzaCluster UUid Is required")
    private String stanzaClusterUuid;
    @NotEmpty(message = "Audit Item's details are required")
    private List<AuditDetailsDto> auditDetailsDto;
}






