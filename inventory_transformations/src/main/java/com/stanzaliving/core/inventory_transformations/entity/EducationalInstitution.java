package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "EDUCATIONAL_INSTITUTION")
@Data
public class EducationalInstitution implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EDUCATIONAL_INSTITUTION_ID", insertable = false, nullable = false)
    private Integer educationalInstitutionId;

    @Column(name = "CREATED", nullable = false)
    private LocalDateTime CREATED;

    @Column(name = "ENABLED", nullable = false)
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
    private LocalDateTime UPDATED;

    @Column(name = "CITY_ID")
    private Integer cityId;

    
}