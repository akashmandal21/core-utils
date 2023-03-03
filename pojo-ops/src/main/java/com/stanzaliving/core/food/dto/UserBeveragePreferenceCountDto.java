package com.stanzaliving.core.food.dto;

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
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserBeveragePreferenceCountDto {

    @Builder.Default
    private Integer preferenceCount = 0;

    @Builder.Default
    private Integer inputCount = 0;

    private String beveragePreferenceName;

    private String beveragePreference;

    private boolean defaultBeverageItem;

}
