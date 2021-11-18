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
public class RewardsFilterDto {
    private String name;
    private Integer pointScored;
    private PaginationRequest pageRequest;
}
