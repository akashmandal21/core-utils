package com.stanzaliving.operations.dto;

import java.util.List;

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

    private List<ResidentMenuCategoryDetailsDto> menuCategoryWiseResidentDetails;

}
