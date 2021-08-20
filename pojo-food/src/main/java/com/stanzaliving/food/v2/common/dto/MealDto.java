package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String mealId;
    private MealType mealType;
    private String name;
    private String code;
    private String mealGroupId;
    private String mealGroup;
    private String imageUri;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer sequence;
}
