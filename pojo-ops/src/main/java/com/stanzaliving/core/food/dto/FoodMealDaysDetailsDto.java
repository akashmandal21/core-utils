package com.stanzaliving.core.food.dto;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodMealDaysDetailsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Builder.Default
    private Integer days = 0;

    private String startTime;

    private String endTime;

    private List<DayOfWeek> daysName;

}
