package com.stanzaliving.banner.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreativeResponseDto implements Comparable<CreativeResponseDto> {

	private Long id;

	private String uuid;

	private Long promotionId;

	private String sectionType;

	private Integer displayOrder;

	private String redirectLink;
	
	@Builder.Default
	private Boolean isDeeplink = false;

	private String ctaText;

	private String image;

	@Override
	public int compareTo(CreativeResponseDto secondDto) {

		Integer firstDtoDisplayOrder = Math.abs(getDisplayOrder());

		Integer secondDtoDisplayOrder = Math.abs(secondDto.getDisplayOrder());

		return firstDtoDisplayOrder.compareTo(secondDtoDisplayOrder);
	}
}
