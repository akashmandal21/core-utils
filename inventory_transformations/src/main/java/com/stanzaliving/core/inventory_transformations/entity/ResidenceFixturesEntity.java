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
	@JsonProperty("residence_id")
    private Integer residenceId;

    @Id
    @Column(name = "FIXTURES_ID", insertable = false, nullable = false)
	@JsonProperty("fixtures_id")
    private Integer fixturesId;

    
}