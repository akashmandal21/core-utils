package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserBeveragePreferenceCountDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Builder.Default
    private Integer preferenceCount = 0;

    @Builder.Default
    private Integer inputCount = 0;

    private String beveragePreferenceName;

    private String beveragePreference;

    private boolean defaultBeverageItem;

}
