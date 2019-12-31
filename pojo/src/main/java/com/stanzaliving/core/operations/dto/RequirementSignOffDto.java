package com.stanzaliving.core.operations.dto;


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
public class RequirementSignOffDto extends OpsDashboardDataDto {

    private SignOffRequirementDto signOffRequirementDto;

}
