/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotEmpty;

import lombok.*;

/**
 * @author nipunaggarwal
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpiDetailsDto {

	@NotEmpty
	private String vpa;

	private String userId;
	
	@NotEmpty
	private String userName;

	@Builder.Default
	private Boolean isVerified = false;
	
	@Builder.Default
	private Boolean isPreferred = Boolean.FALSE;

	private String razorpayId;

	private String vpaId;

	private String razorpayIdV2;

	private String vpaIdV2;

	private Boolean isActive = false;
}
