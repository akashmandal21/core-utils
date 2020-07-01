package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "EDUCATIONAL_INSTITUTION")
@Entity
@Data
public class EducationalInstitutionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EDUCATIONAL_INSTITUTION_ID", insertable = false, nullable = false)
	@JsonProperty("EDUCATIONAL_INSTITUTION_ID")
    private Integer educationalInstitutionId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    
}