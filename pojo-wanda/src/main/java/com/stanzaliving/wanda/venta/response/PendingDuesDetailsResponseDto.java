package com.stanzaliving.wanda.venta.response;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
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
