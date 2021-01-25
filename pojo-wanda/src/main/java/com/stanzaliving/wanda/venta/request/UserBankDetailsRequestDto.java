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
public class UserBankDetailsRequestDto {

	private String accountNumber;
	private String accountName;
	private String ifscCode;
	private String mobileNumber;
	private Double amount;

}
