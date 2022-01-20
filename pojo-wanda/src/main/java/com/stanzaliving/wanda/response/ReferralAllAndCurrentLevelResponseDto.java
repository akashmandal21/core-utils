package com.stanzaliving.wanda.response;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ReferralAllAndCurrentLevelResponseDto {

	@Default
	List<ReferralLevelResponseDto> allReferralLevels = new ArrayList<>();
	
//	@Default
//	List<ReferralLevelResponseDto> currentReferralLevel = new ArrayList<>();
	
	@Default
	double earnReferralAmountUpTo = 10000;
}
