package com.stanzaliving.core.operations.dto.serviceset.security;

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
public class SecurityServiceDto extends ServiceMetadata {

	private List<SecurityResidenceDto> securityResidenceDtos;

}