package com.stanzaliving.core.residenceservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OccupanciesFloorsStatusCountSearchDto {
    private List<OptionsDto> occupancies;
    private List<OptionsDto> floors;
    private List<OptionsWithNotesDto> roomStatus;
}
