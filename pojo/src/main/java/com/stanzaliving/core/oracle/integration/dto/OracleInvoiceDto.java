/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.oracle.integration.dto;

import java.math.BigDecimal;

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
public class OracleInvoiceDto {

	private String invoiceUuid;
	private BigDecimal amtPaid;
	private BigDecimal tdsAmt;
	private BigDecimal discount;
	
}
