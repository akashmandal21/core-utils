/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import java.util.List;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;

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
public class PaymentPlanDetailsResponseDto {

	private List<InstallmentDetailsResponseDto> paymentPlan;
	private String installmentType;
    private Boolean isSelected;
    private InstallmentTypeEnum installmentTypeEnum;
    private String couponCode;
    private double totalDiscount;
    private String discountDescription;
    private String couponText;

}
