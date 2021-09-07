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
public class PendingDuesDetailsResponseDtoV2 {

	private Double totalAmountToBePaid;
	private Double duesPaid;
	private Double duesTillDate;
	private Double currentOutstanding;
	private String dueDate;
	private Double monthlyFee;
	private Double duesOfCurrentMonth;
	private Double paidThisMonth;
	private Double previousArrears;

	
	
}
