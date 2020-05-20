package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "BROKER_SLAB_DETAILS")
public class BrokerSlabDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "AMOUNT_PER_LEADS", nullable = false)
	@JsonProperty("AMOUNT_PER_LEADS")
    private Integer amountPerLeads;

    @Column(name = "MAX_LEADS", nullable = false)
	@JsonProperty("MAX_LEADS")
    private Integer maxLeads;

    @Column(name = "MIN_LEADS", nullable = false)
	@JsonProperty("MIN_LEADS")
    private Integer minLeads;

    @Column(name = "BROKER_SLAB_ID")
	@JsonProperty("BROKER_SLAB_ID")
    private Integer brokerSlabId;

    
}