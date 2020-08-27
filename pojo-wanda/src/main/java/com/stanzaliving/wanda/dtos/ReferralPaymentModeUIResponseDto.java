/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class ReferralPaymentModeUIResponseDto extends ReferAndEarnBaseDto {

	@Builder.Default
	private Boolean present = false;

	private Object data;

}
