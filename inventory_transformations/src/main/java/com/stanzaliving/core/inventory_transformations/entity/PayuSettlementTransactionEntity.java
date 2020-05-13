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
	@JsonProperty("settlement_id")
    private String settlementId;

    @Column(name = "TRANS_ACTION")
	@JsonProperty("trans_action")
    private String transAction;

    @Id
    @Column(name = "PAYU_ID", insertable = false, nullable = false)
	@JsonProperty("payu_id")
    private String payuId;

    @Column(name = "TRANS_AMOUNT")
	@JsonProperty("trans_amount")
    private Double transAmount = 0D;

    @Column(name = "MERCHANT_SERVICE_FEE")
	@JsonProperty("merchant_service_fee")
    private Double merchantServiceFee = 0D;

    @Column(name = "MERCHANT_SERVICE_TAX")
	@JsonProperty("merchant_service_tax")
    private Double merchantServiceTax = 0D;

    @Column(name = "MERCHANT_TRANS_ID")
	@JsonProperty("merchant_trans_id")
    private String merchantTransId;

    @Column(name = "PAYMENT_ID")
	@JsonProperty("payment_id")
    private String paymentId;

    @Column(name = "PAYMENT_MODE")
	@JsonProperty("payment_mode")
    private String paymentMode;

    @Column(name = "PAYMENT_STATUS")
	@JsonProperty("payment_status")
    private String paymentStatus;

    @Column(name = "PAYMENT_ADDED_ON")
	@JsonProperty("payment_added_on")
    private String paymentAddedOn;

    @Column(name = "PAYMENT_AMOUNT")
	@JsonProperty("payment_amount")
    private String paymentAmount;

    
}