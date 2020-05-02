package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "RESIDENCE_INVENTORY_DETAIL")
@Data
public class ResidenceInventoryDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
    private Integer residenceId;

    @Column(name = "AVAILABLE_INVENTORY")
    private BigDecimal availableInventory;

    @Column(name = "BLOCKED_INVENTORY", nullable = false)
    private BigDecimal blockedInventory;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "DEAD_INVENTORY", nullable = false)
    private BigDecimal deadInventory;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "OCCUPIED_INVENTORY")
    private BigDecimal occupiedInventory = BigDecimal.ZERO;

    @Column(name = "TOTAL_INVENTORY")
    private BigDecimal totalInventory = BigDecimal.ZERO;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}