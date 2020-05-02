package com.stanzaliving.core.inventory_transformations.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "PAYU_SETTLEMENT_TRANSACTION")
@Entity
public class PayuSettlementTransaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "SETTLEMENT_ID", nullable = false)
    private String settlementId;

    @Column(name = "TRANS_ACTION")
    private String transAction;

    @Id
    @Column(name = "PAYU_ID", insertable = false, nullable = false)
    private String payuId;

    @Column(name = "TRANS_AMOUNT")
    private Double transAmount = 0D;

    @Column(name = "MERCHANT_SERVICE_FEE")
    private Double merchantServiceFee = 0D;

    @Column(name = "MERCHANT_SERVICE_TAX")
    private Double merchantServiceTax = 0D;

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
    private String paymentAmount;

    
}