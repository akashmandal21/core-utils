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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "BROKER_ID")
	@JsonProperty("broker_id")
    private Integer brokerId;

    @Column(name = "LEAD_ID")
	@JsonProperty("lead_id")
    private Integer leadId;

    @Column(name = "SLAB_ID")
	@JsonProperty("slab_id")
    private Integer slabId;

    @Column(name = "COMMISSION", nullable = false)
	@JsonProperty("commission")
    private Integer COMMISSION;

    @Column(name = "COMMISSION_PROCESSED")
	@JsonProperty("commission_processed")
    private Boolean commissionProcessed = Boolean.FALSE;

    
}