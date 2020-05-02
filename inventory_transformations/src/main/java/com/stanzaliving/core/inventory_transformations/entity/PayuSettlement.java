package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "PAYU_SETTLEMENT")
@Entity
public class PayuSettlement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "SETTLEMENT_ID", insertable = false, nullable = false)
    private String settlementId;

    @Column(name = "SETTLEMENT_COMPLETED_DATE")
    private String settlementCompletedDate;

    @Column(name = "SETTLEMENT_AMOUNT")
    private Double settlementAmount = 0D;

    @Column(name = "UTR_NUMBER")
    private String utrNumber;

    
}