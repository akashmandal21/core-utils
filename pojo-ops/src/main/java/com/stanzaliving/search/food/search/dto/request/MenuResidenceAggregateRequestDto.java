package com.stanzaliving.search.food.search.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuResidenceAggregateRequestDto extends DateRangeRequestDto {

    private Set<String> re
}
