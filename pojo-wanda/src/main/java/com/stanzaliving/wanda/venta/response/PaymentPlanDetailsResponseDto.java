/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import java.util.List;

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
public class PaymentPlanDetailsResponseDto {

	private List<InstallmentDetailsResponseDto> paymentPlan;
	private String installmentType;
    private Boolean isSelected;

}
