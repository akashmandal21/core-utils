/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class ReferAndEarnPaymentDetailDto {

	private String configureText;
	private List<ReferralPaymentModeUIResponseDto> paymentDetails;
	private List<ReferralPaymentModeUIResponseDto> idDetails;
	private String keyForPaymentEmpty;

}
