package com.stanzaliving.banner.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.banner.enumeration.SectionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionTypeAndPromotions {

	private SectionType sectionType;
	
	@Default
	private List<PromotionResponseDto> promotions = new ArrayList<>();
}
