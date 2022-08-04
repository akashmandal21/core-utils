package com.stanzaliving.booking.dto.response;

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

<<<<<<< HEAD
    private Date date;
=======
	private String remarks;

	private Date date;
>>>>>>> 0c938447ff9f95aeb18f9c4446f18cead9373ef3

    private String formattedDate;

    private Date toDate;

    private Date fromDate;

    private String title;

    private String subTitle;

    private String transactionType;

    private String type;

    private Double invoiceAmount;

<<<<<<< HEAD
    private Double balanceAmount;
=======
	public Double getBalanceAmount() {
		double scale = Math.pow(10, 2);
		return Math.round(balanceAmount * scale) / scale;
	}

	public void setBalanceAmount(Double balanceAmount) {
		double scale = Math.pow(10, 2);
		balanceAmount = Math.round(balanceAmount * scale) / scale;
		this.balanceAmount = balanceAmount;
	}

	private Double balanceAmount;
>>>>>>> 0c938447ff9f95aeb18f9c4446f18cead9373ef3

    private String paymentMode;

    private String gatewayTransactionId;

    private String transactionColorCode;

    private List<String> invoiceIds;

<<<<<<< HEAD
    private List<String> transactionIds;
    
    private List<String> merchantTransactionIds;

    private List<NewLedgerLineItemResponseSummaryDto> summaryData;

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
        String DISCOUNT = "Discount";
        String ROOM_CHANGE_INVOICE = "Room Change Invoice";
        String INSTALMENT = "Instalment ";
        String SECURITY_DEPOSIT_REVERSAL = "Security deposit reversal";
        String AMOUNT_REFUNDED = "Amount Refunded";
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
=======
	private List<String> transactionIds;

	private List<CreditNoteInfoDto> creditNoteInfo;

    private List<String> merchantTransactionIds;

	private List<NewLedgerLineItemResponseSummaryDto> summaryData;

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
		String DISCOUNT = "Discount";
		String ROOM_CHANGE_INVOICE = "Room Change Invoice";
		String INSTALMENT = "Instalment ";
		String SECURITY_DEPOSIT_REVERSAL = "Security deposit reversal";
		String AMOUNT_REFUNDED = "Amount Refunded";
		String AMOUNT_CARRYFORWARDED="Amount Carry-forwarded";
		String WRITE_OFF="Write Off";
		String PAYMENT_REFUNDED = "Payment Refunded";
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
>>>>>>> 0c938447ff9f95aeb18f9c4446f18cead9373ef3

}