package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "PAYU_SETTLEMENT")
@Entity
@Data
public class PayuSettlementEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "SETTLEMENT_ID", insertable = false, nullable = false)
	@JsonProperty("SETTLEMENT_ID")
    private String settlementId;

    @Column(name = "SETTLEMENT_COMPLETED_DATE")
	@JsonProperty("SETTLEMENT_COMPLETED_DATE")
    private String settlementCompletedDate;

    @Column(name = "SETTLEMENT_AMOUNT")
	@JsonProperty("SETTLEMENT_AMOUNT")
    private Double settlementAmount = 0D;

    @Column(name = "UTR_NUMBER")
	@JsonProperty("UTR_NUMBER")
    private String utrNumber;

    
}