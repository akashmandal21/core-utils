/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaytmDetailsDto {

	@NotEmpty
	private String paytmNumber;

	private String userId;
	
	@NotEmpty
	private String userName;

	@Builder.Default
	private Boolean isVerified = Boolean.TRUE;
	
	@Builder.Default
	private Boolean isPreferred = Boolean.FALSE;
}
