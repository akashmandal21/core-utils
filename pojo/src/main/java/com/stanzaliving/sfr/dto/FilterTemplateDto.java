package com.stanzaliving.sfr.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilterTemplateDto {
    List<String> propertyType;
    List<String> status;
}
