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
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "USERNAME", insertable = false, nullable = false)
	@JsonProperty("username")
    private String USERNAME;

    @Column(name = "CREATED", nullable = false)
	@JsonProperty("created")
    private Timestamp CREATED;

    @Column(name = "EMAIL")
	@JsonProperty("email")
    private String EMAIL;

    @Column(name = "ENABLED", nullable = false)
	@JsonProperty("enabled")
    private Boolean ENABLED = Boolean.FALSE;

    @Column(name = "LEVEL")
	@JsonProperty("level")
    private String LEVEL;

    @Column(name = "NAME")
	@JsonProperty("name")
    private String NAME;

    @Column(name = "PASSWORD", nullable = false)
	@JsonProperty("password")
    private String PASSWORD;

    @Column(name = "PHONE")
	@JsonProperty("phone")
    private Long PHONE;

    @Column(name = "TEAM")
	@JsonProperty("team")
    private String TEAM;

    @Column(name = "UPDATED", nullable = false)
	@JsonProperty("updated")
    private Timestamp UPDATED;

    @Column(name = "CITY_ID")
	@JsonProperty("city_id")
    private Integer cityId;

    @Column(name = "MICROMARKET_ID")
	@JsonProperty("micromarket_id")
    private Integer micromarketId;

    
}