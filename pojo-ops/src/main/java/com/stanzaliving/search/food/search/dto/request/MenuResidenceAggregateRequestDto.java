package com.stanzaliving.search.food.search.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuResidenceAggregateRequestDto extends DateRangeRequestDto {

    private Set<String> residenceIds;
}
