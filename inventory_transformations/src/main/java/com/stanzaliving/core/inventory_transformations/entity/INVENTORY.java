package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "INVENTORY")
@Entity
@Data
public class INVENTORY implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVENTORY_ID", insertable = false, nullable = false)
    private Integer inventoryId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NUMBER_OF_BEDS")
    private Float numberOfBeds;

    @Column(name = "OCCUPIED")
    private Boolean OCCUPIED;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "UNBLOCK_AT")
    private LocalDateTime unblockAt;

    
}