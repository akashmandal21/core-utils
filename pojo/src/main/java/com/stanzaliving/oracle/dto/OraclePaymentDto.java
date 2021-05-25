/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.oracle.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OraclePaymentDto {

	private String invoiceUuid;
	private String paymentRef;
	private Date paymentDate;
	private String paymentProofDocUrl;
	private String paymentMode;
	private BigDecimal amtPaid;
	private BigDecimal tdsAmt;
	private BigDecimal otherDeductionAmt;
	private String otherDeductionReason;

}
