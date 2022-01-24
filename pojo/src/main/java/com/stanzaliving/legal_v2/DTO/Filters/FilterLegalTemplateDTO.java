package com.stanzaliving.legal_v2.DTO.Filters;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilterLegalTemplateDTO {

    List<String> propertyType;

    List<String> status;

}
