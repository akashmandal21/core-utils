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
@Data
@Table(name = "CITY_POLICE_VERIFICATION")
public class CityPoliceVerificationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "CITY_ID", nullable = false)
	@JsonProperty("CITY_ID")
    private Integer cityId;

    @Column(name = "CREATED")
	@JsonProperty("CREATED")
    private Timestamp CREATED;

    @Column(name = "FORM_URL")
	@JsonProperty("FORM_URL")
    private String formUrl;

    @Column(name = "UPDATED")
	@JsonProperty("UPDATED")
    private Timestamp UPDATED;

    
}