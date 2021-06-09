package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.DefaulterActionType;
import com.stanzaliving.core.security.enums.UserActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDefaulterActionDTO {
    private Long id;

    private String uuid;

    private UserActionType userActionType;

    @NotNull private DefaulterActionType actionType;

    @NotNull @NotEmpty private String description;

    private String comment;

    private LocalDateTime creationTime;
}
