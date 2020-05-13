package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "INVENTORY")
public class InventoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVENTORY_ID", insertable = false, nullable = false)
	@JsonProperty("inventory_id")
    private Integer inventoryId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NUMBER_OF_BEDS")
	@JsonProperty("number_of_beds")
    private Float numberOfBeds;

    @Column(name = "OCCUPIED")
	@JsonProperty("occupied")
    private Boolean OCCUPIED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Column(name = "ROOM_ID")
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "UNBLOCK_AT")
	@JsonProperty("unblock_at")
    private Timestamp unblockAt;

    
}