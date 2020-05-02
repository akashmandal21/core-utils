package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "RESIDENCE_POS_CODE")
@Entity
public class ResidencePosCode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "RESIDENCE_ID", nullable = false)
    private Integer residenceId;

    @Column(name = "PINE_LAB_POS_CODE", nullable = false)
    private String pineLabPosCode = "";

    @Column(name = "PINE_LAB_IMEI", nullable = false)
    private String pineLabImei = "";

    
}