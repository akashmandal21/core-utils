package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "FIXTURES")
@Data
@Entity
public class FixturesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FIXTURES_ID", insertable = false, nullable = false)
	@JsonProperty("fixtures_id")
    private Integer fixturesId;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "NAME", nullable = false)
	@JsonProperty("name")
    private String NAME;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    
}