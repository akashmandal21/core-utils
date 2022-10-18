package com.stanzaliving.operations.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidenceMirSummaryDto {

    private String residenceUuid;
    private Map<String, List<ResidentMenuCategoryDetailsDto>> menuCategoryWiseResidentDetails;

}
