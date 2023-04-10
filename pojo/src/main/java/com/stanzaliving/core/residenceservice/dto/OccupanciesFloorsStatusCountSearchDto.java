package com.stanzaliving.core.residenceservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OccupanciesFloorsStatusCountSearchDto {

    private List<OptionsWithNotesDto> floors;
    private List<OptionsWithNotesDto> gender;
    private List<OptionsWithNotesDto> roomStatus;
    private List<OptionsWithNotesDto> occupancies;

}