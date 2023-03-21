package com.stanzaliving.food.v2.category.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class DayWiseMenuDetailsDto implements Serializable {
    private List<DayWiseMenuDto> dayWiseMenuDtoList;
    @Builder.Default
    private boolean isBeverageRuleSatisfied = true;
}
