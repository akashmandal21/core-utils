package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "states")
@Data
public class States implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "status")
    private Boolean status = Boolean.FALSE;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "uuid", nullable = false)
    private String uuid;

    @Column(name = "country_id", nullable = false)
    private Long countryId;

    @Column(name = "state_name", nullable = false)
    private String stateName;

    @Column(name = "time_zone")
    private String timeZone;

    
}