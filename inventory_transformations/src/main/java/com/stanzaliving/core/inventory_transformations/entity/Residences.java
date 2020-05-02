package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "residences")
public class Residences implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private String uuid;

    @Column(name = "residence_name", nullable = false)
    private String residenceName;

    @Column(name = "micromarket_id", nullable = false)
    private String micromarketId;

    @Column(name = "residence_type", nullable = false)
    private String residenceType;

    @Column(name = "brand_name", nullable = false)
    private String brandName;

    @Column(name = "bed_count", nullable = false)
    private Integer bedCount = 0;

    @Column(name = "room_count", nullable = false)
    private Integer roomCount = 0;

    @Column(name = "estate_gender", nullable = false)
    private String estateGender;

    @Column(name = "core_residence_id")
    private Integer coreResidenceId;

    @Column(name = "core_residence_name")
    private String coreResidenceName;

    @Column(name = "status")
    private Boolean status = Boolean.FALSE;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    
}