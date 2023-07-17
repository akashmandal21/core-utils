package com.stanzaliving.wanda.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInterestSelectionDto {
	
	private String userCode;
	private List<Long> selectedCategoryIds;
	private List<Long> selectedInterestIds;
}
