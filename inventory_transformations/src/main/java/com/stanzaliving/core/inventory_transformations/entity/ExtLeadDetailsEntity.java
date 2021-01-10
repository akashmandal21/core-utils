package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "EXT_LEAD_DETAILS")
@Entity
public class ExtLeadDetailsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "FIRST_NAME")
	@JsonProperty("FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
	@JsonProperty("LAST_NAME")
    private String lastName;

    @Column(name = "PHONE")
	@JsonProperty("PHONE")
    private String PHONE;

    @Column(name = "CITY_NAME")
	@JsonProperty("CITY_NAME")
    private String cityName;

    @Column(name = "LEAD_SOURCE")
	@JsonProperty("LEAD_SOURCE")
    private String leadSource;

    @Column(name = "HASH")
	@JsonProperty("HASH")
    private String HASH;

    @Column(name = "LEADATTRIBUTES", columnDefinition = "json")
	@JsonProperty("LEADATTRIBUTES")
    private String LEADATTRIBUTES;

    @Column(name = "CALLED_NUMBER")
	@JsonProperty("CALLED_NUMBER")
    private String calledNumber;

    
}