package com.stanzaliving.core.operations.dto.people;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class PeopleRequirementCSVDto {

    private String cityName;

    private String micromarketName;

    List<RoleRequirementCSVDto> roleReqiorementCSVDtoList;
}
