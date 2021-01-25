/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashMap;

/**
 * @author nipunaggarwal
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ReferralStatusDetailsUIResponseDto {

	private String name;
	private String status;
	private String email;
	private String contactNumber;
	private String localityCity;
	private String submittedOn;
	private String bookedOn;
	private String amountEarned;
	private String paidOn;
	private String paymentMode;
	private LinkedHashMap<String, String> amountBreakup;

}
