/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.wanda.response.ReferralLevelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "imgUrl" })
public class UnlockLevelsAndEarnMoreDto extends ReferAndEarnBaseDto{

	private List<ReferralLevelResponseDto> levels;

}
