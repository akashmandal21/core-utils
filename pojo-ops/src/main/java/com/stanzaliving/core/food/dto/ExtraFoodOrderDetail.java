package com.stanzaliving.core.food.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtraFoodOrderDetail {

    @NotEmpty(message = "name can't be empty")
    private String name;

    @NotEmpty(message = "mobileNumber can't be empty")
    private String mobileNumber;

    private Map<MealType, Boolean> mealType;

}

