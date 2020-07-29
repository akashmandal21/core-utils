package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name = "RESIDENCE_INVENTORY_DETAIL")
@Data
@Entity
public class ResidenceInventoryDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "AVAILABLE_INVENTORY")
	@JsonProperty("AVAILABLE_INVENTORY")
    private BigDecimal availableInventory;

    @Column(name = "BLOCKED_INVENTORY", nullable = false)
	@JsonProperty("BLOCKED_INVENTORY")
    private BigDecimal blockedInventory;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "DEAD_INVENTORY", nullable = false)
	@JsonProperty("DEAD_INVENTORY")
    private BigDecimal deadInventory;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED;

    @Column(name = "OCCUPIED_INVENTORY")
	@JsonProperty("OCCUPIED_INVENTORY")
    private BigDecimal occupiedInventory = BigDecimal.ZERO;

    @Column(name = "TOTAL_INVENTORY")
	@JsonProperty("TOTAL_INVENTORY")
    private BigDecimal totalInventory = BigDecimal.ZERO;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}