package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.gamificationservice.enums.ContestTaskNameType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestTaskRequestDto {
    @NotBlank(message = "ContestsUuid is Mandatory.")
    private String contestsUuid;

    private String taskProgress;

    private String completedTask;

    private String totalTask;

    private ContestTaskNameType taskName;
}
