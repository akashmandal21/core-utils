package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PAYU_SETTLEMENT_TRANSACTION")
public class PayuSettlementTransaction {

	@Id
	@Column(name  = "PAYU_ID")
	private String payuId;
	
	@Column(name = "TRANS_ACTION")
	private String transAction;
	
	@Column(name = "TRANS_AMOUNT")
	private BigDecimal transAmt;
	
	@Column(name = "MERCHANT_SERVICE_FEE")
	private BigDecimal merchantServiceFee;
	
	@Column(name = "MERCHANT_SERVICE_TAX")
	private BigDecimal merchantServiceTax;
	
	@Column(name = "MERCHANT_TRANS_ID")
	private String merchantTransId;
	
	@Column(name = "PAYMENT_ID")
	private String paymentId;
	
	@Column(name = "PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name = "PAYMENT_STATUS")
	private String paymentStatus;
	
	@Column(name = "PAYMENT_ADDED_ON")
	private String paymentAddedOn;
	
	@Column(name = "PAYMENT_AMOUNT")
	private BigDecimal paymentAmt;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="SETTLEMENT_ID")
	private PayuSettlement payuSettlement;

	public String getPayuId() {
		return payuId;
	}

	public void setPayuId(String payuId) {
		this.payuId = payuId;
	}

	public String getTransAction() {
		return transAction;
	}

	public void setTransAction(String transAction) {
		this.transAction = transAction;
	}

	public BigDecimal getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt = transAmt;
	}

	public BigDecimal getMerchantServiceFee() {
		return merchantServiceFee;
	}

	public void setMerchantServiceFee(BigDecimal merchantServiceFee) {
		this.merchantServiceFee = merchantServiceFee;
	}

	public BigDecimal getMerchantServiceTax() {
		return merchantServiceTax;
	}

	public void setMerchantServiceTax(BigDecimal merchantServiceTax) {
		this.merchantServiceTax = merchantServiceTax;
	}

	public String getMerchantTransId() {
		return merchantTransId;
	}

	public void setMerchantTransId(String merchantTransId) {
		this.merchantTransId = merchantTransId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentAddedOn() {
		return paymentAddedOn;
	}

	public void setPaymentAddedOn(String paymentAddedOn) {
		this.paymentAddedOn = paymentAddedOn;
	}

	public BigDecimal getPaymentAmt() {
		return paymentAmt;
	}

	public void setPaymentAmt(BigDecimal paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public PayuSettlement getPayuSettlement() {
		return payuSettlement;
	}

	public void setPayuSettlement(PayuSettlement payuSettlement) {
		this.payuSettlement = payuSettlement;
	}	
}
