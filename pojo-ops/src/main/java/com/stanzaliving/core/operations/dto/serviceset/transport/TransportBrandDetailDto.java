package com.stanzaliving.core.operations.dto.serviceset.transport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TransportBrandDetailDto {

	private String componentId;

	private boolean availableAsVas;

	private int freeDistance;

}