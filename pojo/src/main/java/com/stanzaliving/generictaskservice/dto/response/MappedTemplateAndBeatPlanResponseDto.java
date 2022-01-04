package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;

import java.util.List;


/**
 * @author Vikas S T
 * @date 24-Oct-21
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MappedTemplateAndBeatPlanResponseDto {

    private List<MappedBeatPlanResponseDto> mappedBeatPlanResponse;

    private List<MappedTemplateResponseDto> mappedTemplateResponse;
}
