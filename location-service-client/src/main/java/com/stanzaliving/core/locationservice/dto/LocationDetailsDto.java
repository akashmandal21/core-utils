package com.stanzaliving.core.locationservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LocationDetailsDto {

	private String locationName;

	private String locationId;

	private String transformationUuid;
}