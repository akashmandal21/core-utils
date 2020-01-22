package com.stanzaliving.core.operations.dto.serviceset;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceMetadata {

	private String serviceId;

	private String serviceName;

	private boolean available;

}