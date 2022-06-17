package com.stanzaliving.core.opscalculator.V2.dto;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class CxCategoryV2Dto extends CategoryDto{

    public int costPerBed;

}
