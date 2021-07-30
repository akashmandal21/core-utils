package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentTerm {

	MONTHLY("MONTHLY","Monthly"),
	ONE_INSTALMENT("ONE INSTALMENT","1 Instalment"),
	TWO_INSTALMENT("TWO INSTALMENT","2 Instalments"),
	THREE_INSTALMENT("THREE INSTALMENT","3 Instalments"),
	FOUR_INSTALMENT("FOUR INSTALMENT","4 Instalments"),
	FIVE_INSTALMENT("FIVE INSTALMENT","5 Instalment");
	 
	private String name;
	private String view;

	public String getName() {
		return name;
	}

	public static String getEnumByString(String code){
        for(PaymentTerm e : PaymentTerm.values()){
            if(e.name.equals(code)) return e.name();
        }
        return null;
    }
}
