package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "RESIDENCE_FIXTURES")
@Entity
@IdClass(ResidenceFixturesEntity.class)
public class ResidenceFixturesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "RESIDENCE_ID", insertable = false, nullable = false)
	@JsonProperty("RESIDENCE_ID")
    private Integer residenceId;

    @Id
    @Column(name = "FIXTURES_ID", insertable = false, nullable = false)
	@JsonProperty("FIXTURES_ID")
    private Integer fixturesId;

    
}