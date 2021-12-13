package com.stanzaliving.gamificationservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class WallOfFameFilterDto {
    private String teamMember;
    private Integer pointsEarned;
    private PaginationRequest pageRequest;
}
