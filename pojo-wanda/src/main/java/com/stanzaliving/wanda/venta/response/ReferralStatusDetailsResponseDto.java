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
	private String submittedOn;
	private Double amountPaid;
	private String paidOn;

}
