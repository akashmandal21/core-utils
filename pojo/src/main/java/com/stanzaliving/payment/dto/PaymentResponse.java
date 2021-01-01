package com.stanzaliving.payment.dto;

import java.util.Date;

import com.stanzaliving.core.payment.enums.PaymentStatus;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PaymentResponse {

	private long stanzaTransactionId;
	private PaymentStatus paymentStatus;
	private Date createdAt;
	private String studentId;
	private String merchantTransactionId;
	private String bookingId;
	private String paymentModeDesc;
	private int paymentModeId;
	private double amount;

	public PaymentResponse(long stanzaTransactionId, PaymentStatus paymentStatus, Date createdAt, String studentId, String merchantTransactionId) {
		this.stanzaTransactionId = stanzaTransactionId;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
		this.studentId = studentId;
		this.merchantTransactionId = merchantTransactionId;
	}

	public PaymentResponse(long stanzaTransactionId, PaymentStatus paymentStatus, Date createdAt, String studentId, String merchantTransactionId,
			String bookingId) {

		this.stanzaTransactionId = stanzaTransactionId;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
		this.studentId = studentId;
		this.merchantTransactionId = merchantTransactionId;
		this.bookingId = bookingId;
	}

	public PaymentResponse(long stanzaTransactionId, PaymentStatus paymentStatus, Date createdAt, String studentId, String merchantTransactionId,
			String bookingId, String paymentModeDesc) {

		this.stanzaTransactionId = stanzaTransactionId;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
		this.studentId = studentId;
		this.merchantTransactionId = merchantTransactionId;
		this.bookingId = bookingId;
		this.paymentModeDesc = paymentModeDesc;
	}

	public PaymentResponse(long stanzaTransactionId, PaymentStatus paymentStatus, Date createdAt, String studentId, String merchantTransactionId,
			String bookingId, String paymentModeDesc, int paymentModeId) {

		this.stanzaTransactionId = stanzaTransactionId;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
		this.studentId = studentId;
		this.merchantTransactionId = merchantTransactionId;
		this.bookingId = bookingId;
		this.paymentModeDesc = paymentModeDesc;
		this.paymentModeId = paymentModeId;
	}

	public PaymentResponse(long stanzaTransactionId, PaymentStatus paymentStatus, Date createdAt, String studentId, String merchantTransactionId,
			String bookingId, String paymentModeDesc, int paymentModeId, double amount) {

		this.stanzaTransactionId = stanzaTransactionId;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
		this.studentId = studentId;
		this.merchantTransactionId = merchantTransactionId;
		this.bookingId = bookingId;
		this.paymentModeDesc = paymentModeDesc;
		this.paymentModeId = paymentModeId;
		this.amount = amount;
	}
}