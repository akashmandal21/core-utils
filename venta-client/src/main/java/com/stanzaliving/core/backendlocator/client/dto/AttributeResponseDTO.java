package com.stanzaliving.core.backendlocator.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AttributeResponseDTO {

	private int attributeId;

	private String name;

	private boolean enabled;

	private String iconImage;
}
