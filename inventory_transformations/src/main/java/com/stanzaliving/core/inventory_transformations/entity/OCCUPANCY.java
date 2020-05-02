package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "OCCUPANCY")
public class OCCUPANCY implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "OCCUPANCY_ID", nullable = false)
    private Integer occupancyId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "OCCUPANCY", nullable = false)
    private Integer OCCUPANCY;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    
}