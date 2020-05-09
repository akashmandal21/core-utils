package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "INVENTORY")
public class INVENTORYEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVENTORY_ID", insertable = false, nullable = false)
	@JsonProperty("INVENTORY_ID")
    private Integer inventoryId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NUMBER_OF_BEDS")
	@JsonProperty("NUMBER_OF_BEDS")
    private Float numberOfBeds;

    @Column(name = "OCCUPIED")
	@JsonProperty("OCCUPIED")
    private Boolean OCCUPIED;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "RESIDENCE_ID")
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Column(name = "ROOM_ID")
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "UNBLOCK_AT")
	@JsonProperty("UNBLOCK_AT")
    private Timestamp unblockAt;

    
}