package com.stanzaliving.core.operations.dto.serviceset.gym;


import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.ServiceMetadata;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GymServiceDto extends ServiceMetadata {

    private List<GymResidenceDto> gymResidenceDtos;

}