package com.stanzaliving.booking.enums;

public enum PaymentTerm {

	MONTHLY("MONTHLY"),
	ONE_INSTALLMENT("ONE INSTALLMENT"),
	TWO_INSTALLMENT("TWO INSTALLMENT"),
	THREE_INSTALLMENT("THREE INSTALLMENT"),
	FOUR_INSTALLMENT("FOUR INSTALLMENT");

	private String name;

	/*PaymentTerm(String name) {
		this.name = name;
	}*/

	public String getName() {
		return name;
	}

}
