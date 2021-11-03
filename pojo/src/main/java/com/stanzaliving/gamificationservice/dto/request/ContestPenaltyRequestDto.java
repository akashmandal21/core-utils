package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestPenaltyRequestDto extends AbstractDto {
    @NotBlank(message = "ContestTitle is Mandatory.")
    private String contestTitle;

    @NotBlank(message = "AssociateName is Mandatory.")
    private String associateName;

    private String description;

    @NotNull(message = "PenaltyPoints is Mandatory.")
    private int penaltyPoints;

}
