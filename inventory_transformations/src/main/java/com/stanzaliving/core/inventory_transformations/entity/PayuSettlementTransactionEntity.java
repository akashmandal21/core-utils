package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PAYU_SETTLEMENT_TRANSACTION")
@Data
public class PayuSettlementTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "SETTLEMENT_ID", nullable = false)
	@JsonProperty("SETTLEMENT_ID")
    private String settlementId;

    @Column(name = "TRANS_ACTION")
	@JsonProperty("TRANS_ACTION")
    private String transAction;

    @Id
    @Column(name = "PAYU_ID", insertable = false, nullable = false)
	@JsonProperty("PAYU_ID")
    private String payuId;

    @Column(name = "TRANS_AMOUNT")
	@JsonProperty("TRANS_AMOUNT")
    private Double transAmount = 0D;

    @Column(name = "MERCHANT_SERVICE_FEE")
	@JsonProperty("MERCHANT_SERVICE_FEE")
    private Double merchantServiceFee = 0D;

    @Column(name = "MERCHANT_SERVICE_TAX")
	@JsonProperty("MERCHANT_SERVICE_TAX")
    private Double merchantServiceTax = 0D;

    @Column(name = "MERCHANT_TRANS_ID")
	@JsonProperty("MERCHANT_TRANS_ID")
    private String merchantTransId;

    @Column(name = "PAYMENT_ID")
	@JsonProperty("PAYMENT_ID")
    private String paymentId;

    @Column(name = "PAYMENT_MODE")
	@JsonProperty("PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "PAYMENT_STATUS")
	@JsonProperty("PAYMENT_STATUS")
    private String paymentStatus;

    @Column(name = "PAYMENT_ADDED_ON")
	@JsonProperty("PAYMENT_ADDED_ON")
    private String paymentAddedOn;

    @Column(name = "PAYMENT_AMOUNT")
	@JsonProperty("PAYMENT_AMOUNT")
    private String paymentAmount;

    
}