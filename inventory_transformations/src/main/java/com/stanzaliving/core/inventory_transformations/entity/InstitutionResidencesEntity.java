package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

//@Entity
@Table(name = "INSTITUTION_RESIDENCES")
@Data
public class InstitutionResidencesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "RSIDENCE_ID", nullable = false)
	@JsonProperty("RSIDENCE_ID")
    private Integer rsidenceId;

    @Column(name = "RESIDENCES")
	@JsonProperty("RESIDENCES")
    private String RESIDENCES;

    
}