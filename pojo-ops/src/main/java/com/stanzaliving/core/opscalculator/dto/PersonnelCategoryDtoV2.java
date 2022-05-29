package com.stanzaliving.core.opscalculator.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class PersonnelCategoryDtoV2 extends CategoryDto{

    private int hk12HrCount;
    private String hkType;
    private int hk12HrRate;
    private int sgCount;
    private String sgType;
    private int sgRate;
    private int jrRcCount;
    private int jrRcRate;
    private int rcCount;
    private int rcRate;
    private double releiverJrRc;

}
