package com.stanzaliving.projectplanningservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import com.stanzaliving.projectplanningservice.dto.SectionDetailsDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionDetailsByInputDto {

    private List<GenericTaskResponseDto> propertyTaskDetails;

    private String inputType;


}
