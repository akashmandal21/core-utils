/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

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
@NoArgsConstructor
@AllArgsConstructor
public class ReferralStatusDetailsResponseDto {

	private Integer referralId;
	private String status;
	private String name;
	private String contactNumber;
	private String email;
	private String payoutMode;
	private String source;
	private String submittedOn;
	private String bookedOn;
	private Double amountPaid;
	private String paidOn;
	private String mmName;
	private String cityName;

}
