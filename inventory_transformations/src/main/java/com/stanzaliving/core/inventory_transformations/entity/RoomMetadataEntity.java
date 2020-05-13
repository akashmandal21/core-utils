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
	@JsonProperty("room_metadata_id")
    private Integer roomMetadataId;

    @Column(name = "START_DATE")
	@JsonProperty("start_date")
    private Date startDate;

    @Column(name = "END_DATE")
	@JsonProperty("end_date")
    private Date endDate;

    @Column(name = "ROOM_ID")
	@JsonProperty("room_id")
    private Integer roomId;

    @Column(name = "BLOCKED")
	@JsonProperty("blocked")
    private Boolean BLOCKED;

    @Column(name = "DEAD")
	@JsonProperty("dead")
    private Boolean DEAD;

    @Column(name = "OCCUPANCY")
	@JsonProperty("occupancy")
    private Integer OCCUPANCY;

    @Column(name = "UPDATED")
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "BED_COUNT")
	@JsonProperty("bed_count")
    private Integer bedCount;

    @Column(name = "SELF_CONVERTED")
	@JsonProperty("self_converted")
    private Boolean selfConverted = Boolean.FALSE;

    @Column(name = "CONVERSION_CHARGE")
	@JsonProperty("conversion_charge")
    private Integer conversionCharge = 0;

    
}