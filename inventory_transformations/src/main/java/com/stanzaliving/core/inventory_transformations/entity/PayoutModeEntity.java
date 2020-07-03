package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Table(name = "PAYOUT_MODE")
@Entity
public class PayoutModeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYOUT_MODE_ID", insertable = false, nullable = false)
	@JsonProperty("PAYOUT_MODE_ID")
    private Integer payoutModeId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}