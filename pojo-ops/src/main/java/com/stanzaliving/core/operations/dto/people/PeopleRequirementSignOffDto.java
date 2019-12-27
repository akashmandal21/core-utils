package com.stanzaliving.core.operations.dto.people;


import java.util.List;

import com.stanzaliving.core.operations.dto.OpsDashboardDataDto;

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
public class PeopleRequirementSignOffDto  extends OpsDashboardDataDto {

    private List<SignOffRequirementDto> signOffRequirementDto;
}
