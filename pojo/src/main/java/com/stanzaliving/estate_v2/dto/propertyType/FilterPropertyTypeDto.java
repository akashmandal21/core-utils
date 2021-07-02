package com.stanzaliving.estate_v2.dto.propertyType;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilterPropertyTypeDto {
    List<String> propertyType;
    List<String> status;
}
