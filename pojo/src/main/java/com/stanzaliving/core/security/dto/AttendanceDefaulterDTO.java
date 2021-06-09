package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.ActionStatus;
import com.stanzaliving.core.security.enums.DefaulterActionType;
import com.stanzaliving.core.security.enums.UserActionType;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDefaulterDTO {

    private Long id;

    private String uuid;

    @NotNull @NotEmpty private String residentUuid;

    @NotNull @NotEmpty private String residenceUuid;

    @NotNull private LocalDate date;

    private String markedBy;

    private LocalDateTime markedAt;

    private ActionStatus actionStatus;

    private boolean isResolved;

    private ResidentDTO resident;

    private DefaulterActionType actionType;

    private UserActionType userActionType;

    private List<@Valid AttendanceDefaulterActionDTO> actions;
}
