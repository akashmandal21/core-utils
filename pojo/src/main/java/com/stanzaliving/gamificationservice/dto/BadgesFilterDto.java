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
public class BadgesFilterDto {
    private String type;
    private String badgeName;
    private String badgeType;
    private PaginationRequest pageRequest;
}
