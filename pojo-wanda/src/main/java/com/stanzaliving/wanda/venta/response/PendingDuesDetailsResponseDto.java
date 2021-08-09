package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PendingDuesDetailsResponseDto {

	private Long totalAmountToBePaid;
	private Long duesPaid;
	private Long duesTillDate;
	@Builder.Default
	private Long currentOutstanding=0l;
	private String dueDate;
	private Double monthlyFee;
	private Double duesOfCurrentMonth;
	private Double paidThisMonth;
	private Double previousArrears;

	
	
}
