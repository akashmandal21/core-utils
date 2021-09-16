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
	private Long currentOutstanding;
	private String dueDate;
	private String monthlyFee;
	private String duesOfCurrentMonth;
	private String paidThisMonth;
	private String previousArrears;

}
