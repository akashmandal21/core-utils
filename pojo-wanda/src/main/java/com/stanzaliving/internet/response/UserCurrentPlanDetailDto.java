package com.stanzaliving.internet.response;

import java.time.LocalDate;

import com.stanzaliving.core.enums.DataUnit;


import lombok.AllArgsConstructor;
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
public class UserCurrentPlanDetailDto {

    private Double planData;

    private Double usedData;

    private Double availableData;

    private DataUnit dataUnit;

    private LocalDate planExpiryDate;

    private boolean boosterPackActive;

    private Double boosterPackData;

}