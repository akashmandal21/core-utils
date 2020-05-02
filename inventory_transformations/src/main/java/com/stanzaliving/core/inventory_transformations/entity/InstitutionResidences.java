package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "INSTITUTION_RESIDENCES")
public class InstitutionResidences implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "RSIDENCE_ID", nullable = false)
    private Integer rsidenceId;

    @Column(name = "RESIDENCES")
    private String RESIDENCES;

    
}