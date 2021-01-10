package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "BROKER_LEAD_TRANSACTION")
@Data
@Entity
public class BrokerLeadTransactionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "BROKER_ID")
	@JsonProperty("BROKER_ID")
    private Integer brokerId;

    @Column(name = "LEAD_ID")
	@JsonProperty("LEAD_ID")
    private Integer leadId;

    @Column(name = "SLAB_ID")
	@JsonProperty("SLAB_ID")
    private Integer slabId;

    @Column(name = "COMMISSION", nullable = false)
	@JsonProperty("COMMISSION")
    private Integer COMMISSION;

    @Column(name = "COMMISSION_PROCESSED")
	@JsonProperty("COMMISSION_PROCESSED")
    private Boolean commissionProcessed = Boolean.FALSE;

    
}