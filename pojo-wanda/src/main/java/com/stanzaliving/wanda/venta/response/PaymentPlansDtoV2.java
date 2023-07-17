/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlansDtoV2 {

	private List<PaymentPlanDetailsResponseDtoV2> paymentPlanDetailsResponseDtos;
	private String view;
	@Builder.Default
    private Double upsell=0d;
}
