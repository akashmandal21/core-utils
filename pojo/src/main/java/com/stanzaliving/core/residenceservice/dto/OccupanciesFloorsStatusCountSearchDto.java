package com.stanzaliving.core.residenceservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OccupanciesFloorsStatusCountSearchDto {
    private List<LabelValueDto> occupancies;
    private List<LabelValueDto> floors;
    private List<LabelValueCountDto> roomStatus;
}
