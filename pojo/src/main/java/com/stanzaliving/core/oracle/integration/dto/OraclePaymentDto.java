/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.oracle.integration.dto;

import java.util.Date;
import java.util.List;

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
@NoArgsConstructor
@AllArgsConstructor
public class OraclePaymentDto {

	private String paymentRef;
	private String paymentProofDocUrl;
	private String paymentMode;
	private Date paymentDate;
	private List<OracleInvoiceDto> invoicePayments;

}
