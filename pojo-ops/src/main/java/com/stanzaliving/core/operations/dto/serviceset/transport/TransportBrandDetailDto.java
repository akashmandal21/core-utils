package com.stanzaliving.core.operations.dto.serviceset.transport;

import com.stanzaliving.core.operations.dto.serviceset.BrandComponentDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TransportBrandDetailDto extends BrandComponentDto {

	private boolean availableAsVas;

	private int freeDistance;

}