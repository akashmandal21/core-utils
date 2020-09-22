/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.dtos.ReferAndEarnBaseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class KycUIResponseDto extends ReferAndEarnBaseDto {

	@Builder.Default
	private Boolean isKycUpdated = Boolean.FALSE;
	private String text;

}
