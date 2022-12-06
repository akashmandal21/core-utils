package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectionTransforamtionDto {

    private List<SectionBoqTempDto> sectionBoqTempDtoList;

    private Map<String, SectionalBoqCapexDto> sectionBoqCapexMap;

    private Map<String, Integer> sectionRoomCountMap;

    private Map<String, Integer> sectionBedCountMap;
}
