package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ROOM_METADATA")
public class RoomMetadataEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_METADATA_ID", insertable = false, nullable = false)
	@JsonProperty("ROOM_METADATA_ID")
    private Integer roomMetadataId;

    @Column(name = "START_DATE")
	@JsonProperty("START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
	@JsonProperty("END_DATE")
    private Date endDate;

    @Column(name = "ROOM_ID")
	@JsonProperty("ROOM_ID")
    private Integer roomId;

    @Column(name = "BLOCKED")
	@JsonProperty("BLOCKED")
    private Boolean BLOCKED;

    @Column(name = "DEAD")
	@JsonProperty("DEAD")
    private Boolean DEAD;

    @Column(name = "OCCUPANCY")
	@JsonProperty("OCCUPANCY")
    private Integer OCCUPANCY;

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "BED_COUNT")
	@JsonProperty("BED_COUNT")
    private Integer bedCount;

    @Column(name = "SELF_CONVERTED")
	@JsonProperty("SELF_CONVERTED")
    private Boolean selfConverted = Boolean.FALSE;

    @Column(name = "CONVERSION_CHARGE")
	@JsonProperty("CONVERSION_CHARGE")
    private Integer conversionCharge = 0;

    
}