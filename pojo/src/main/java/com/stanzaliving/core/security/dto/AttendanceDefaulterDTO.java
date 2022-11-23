package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.ActionStatus;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDefaulterDTO {

    private String uuid;

    @NotNull
    @NotEmpty(message = "Resident UUID cannot be empty")
    private String residentUuid;

    @NotNull
    @NotEmpty(message = "Residence UUID cannot be empty")
    private String residenceUuid;

    @NotNull(message = "date cannot be null")
    private LocalDate date;

    private String markedBy;

    private LocalDateTime markedAt;

    private ActionStatus actionStatus;

    private boolean isResolved;

    private boolean isNodalActionTaken;

    private ResidentDTO resident;

    private List<@Valid AttendanceDefaulterActionDTO> actions;

    private StatusCardDTO statusCard;

    private Date createdAt;

    private LocalTime cutOffTimeRc;

    private LocalTime cutOffTimeNodal;

    private LocalTime cutOffTimeQrt;
}
