package com.stanzaliving.core.operations.dto.serviceset.transport;

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
public class TransportServiceDto extends ServiceMetadata {

	private List<TransportResidenceDto> transportResidenceDtos;

}