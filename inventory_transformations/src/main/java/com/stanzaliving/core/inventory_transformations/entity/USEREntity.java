package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "USER")
@Data
public class USEREntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "USERNAME", insertable = false, nullable = false)
	@JsonProperty("USERNAME")
    private String USERNAME;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "EMAIL")
	@JsonProperty("EMAIL")
    private String EMAIL;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("ENABLED")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LEVEL")
	@JsonProperty("LEVEL")
    private String LEVEL;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "PASSWORD", nullable = false)
	@JsonProperty("PASSWORD")
    private String PASSWORD;

    @Column(name = "PHONE")
	@JsonProperty("PHONE")
    private Long PHONE;

    @Column(name = "TEAM")
	@JsonProperty("TEAM")
    private String TEAM;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    @Column(name = "CITY_ID")
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("MICROMARKET_ID")
    private Integer micromarketId;

    
}