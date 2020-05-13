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
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "AVAILABLE_INVENTORY")
	@JsonProperty("available_inventory")
    private BigDecimal availableInventory;

    @Column(name = "BLOCKED_INVENTORY", nullable = false)
	@JsonProperty("blocked_inventory")
    private BigDecimal blockedInventory;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "DEAD_INVENTORY", nullable = false)
	@JsonProperty("dead_inventory")
    private BigDecimal deadInventory;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED;

    @Column(name = "OCCUPIED_INVENTORY")
	@JsonProperty("occupied_inventory")
    private BigDecimal occupiedInventory = BigDecimal.ZERO;

    @Column(name = "TOTAL_INVENTORY")
	@JsonProperty("total_inventory")
    private BigDecimal totalInventory = BigDecimal.ZERO;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}