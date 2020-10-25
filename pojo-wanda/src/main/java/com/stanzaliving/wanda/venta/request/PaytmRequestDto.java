/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaytmRequestDto {

	private String payoutModeValue;
	private String payoutMode;
	private String mobileNumber;
	private String otp;
	private String createdBy;

}
