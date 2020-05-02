package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Table(name = "ROOM_METADATA")
@Entity
public class RoomMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_METADATA_ID", insertable = false, nullable = false)
    private Integer roomMetadataId;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "BLOCKED")
    private Boolean BLOCKED;

    @Column(name = "DEAD")
    private Boolean DEAD;

    @Column(name = "OCCUPANCY")
    private Integer OCCUPANCY;

    @Column(name = "UPDATED")
    private LocalDateTime UPDATED;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "BED_COUNT")
    private Integer bedCount;

    @Column(name = "SELF_CONVERTED")
    private Boolean selfConverted = Boolean.FALSE;

    @Column(name = "CONVERSION_CHARGE")
    private Integer conversionCharge = 0;

    
}