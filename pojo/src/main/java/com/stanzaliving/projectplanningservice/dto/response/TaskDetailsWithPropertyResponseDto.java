package com.stanzaliving.projectplanningservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import com.stanzaliving.projectplanningservice.dto.PropertyPlanningDto;
import com.stanzaliving.projectplanningservice.dto.SectionDetailsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TaskDetailsWithPropertyResponseDto {

    private GenericTaskResponseDto genericTaskResponseDto;

    private SectionDetailsDto sectionDetailsDto;

    private PropertyPlanningDto propertyPlanningDto;

}
