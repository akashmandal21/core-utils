package com.stanzaliving.projectplanningservice.dto.response;

import com.stanzaliving.projectplanningservice.dto.SectionDetailsDto;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionDetailsByInputDto {

    private String type;

    private Map<String,List<SectionDetailsDto>> sectionsTaskSubtasksList;


}
