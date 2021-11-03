package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestPenaltyResponseDto extends AbstractDto {
    private String contestTitle;

    private String associateName;

    private String description;

    private int penaltyPoints;

}
