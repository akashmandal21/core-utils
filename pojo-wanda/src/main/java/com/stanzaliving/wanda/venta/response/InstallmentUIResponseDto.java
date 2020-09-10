/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
@JsonInclude(Include. NON_NULL)
public class InstallmentUIResponseDto {

	private Set<String> ids;	
	private String installmentNo;
	private String fromDate;
	private String amount;
	private String paid;
	private String balance;
	private String fromToDateStr;
	private String dueDateStr;
	private List<InstallmentLineItemUIResponseDto> installmentLineItems;

}
