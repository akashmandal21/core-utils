package com.stanzaliving.banner.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreativeResponseDto {

	private Long id;

	private String uuid;
	
	private Long promotionId;

	private String sectionType;

	private int displayOrder;

	private String redirectLink;

	private String ctaText;

	private String image;
}
