package com.stanzaliving.wanda.venta.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewLedgerLineItemResponseDto implements Comparable {
	@JsonIgnore
	private Integer position = 0;
	private Date date;
	private String formattedDate;
	private Date toDate;
	private Date fromDate;
	private String title;
	private String subTitle;
	private String transactionType;
	private String type;
	private Double invoiceAmount;
	private Double balanceAmount;
	private String paymentMode;
	private String gatewayTransactionId;
	private String transactionColorCode;
	private List<String> invoiceIds;
	private List<String> transactionIds;
	private String amountString;
	private String balanceString;
	private Boolean isLastTransaction;

	@Override
	public int compareTo(Object o) {
		int value1 = ((NewLedgerLineItemResponseDto) o).getDate().compareTo(this.date);
		if (value1 == 0) {
			int value2 = this.position.compareTo(((NewLedgerLineItemResponseDto) o).getPosition());
			if (value2 == 0) {
				int value3 = ((NewLedgerLineItemResponseDto) o).getFromDate().compareTo(this.fromDate);
				if (value3 == 0) {
					return value2;
				} else {
					return value3;
				}
			} else {
				return value2;
			}
		}
		return value1;
	}

	public interface TITLE_CONSTANT {
		String PAYMENT_RECEIVED = "Payment Received";
		String ADJUSTED_CARRY_FORWARD = "Security deposit carry-forward";
		String MAINTENANCE_DEPOSIT_TEXT = "Maintenance Fee";
		String SECURITY_DEPOSIT = "Security Deposit";
		String ADVANCE_FEES = "Advance Fees";
		String VAS_INSTALMENT = "VAS Instalment";
		String CREDIT_NOTE = "Credit Note";
		String ROOM_CHANGE_INVOICE = "Room Change Invoice";
		String INSTALMENT = "Instalment ";
	}

	public interface TRANSACTION_TYPE {
		String CREDIT = "CREDIT";
		String DEBIT = "DEBIT";
	}

	public interface TYPE {
		String CREDIT_NOTE = "CREDITNOTE";
		String INVOICE = "INVOICE";
		String TRANSACTION = "TRANSACTION";
	}

	public interface TRANSACTION_TYPE_COLOR {
		String CREDIT_COLOR = "#F55F71";
		String DEBIT_COLOR = "#60C3AD";
	}
}
