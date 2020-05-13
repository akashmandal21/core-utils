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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "FIRST_NAME")
	@JsonProperty("first_name")
    private String firstName;

    @Column(name = "LAST_NAME")
	@JsonProperty("last_name")
    private String lastName;

    @Column(name = "PHONE")
	@JsonProperty("phone")
    private String PHONE;

    @Column(name = "CITY_NAME")
	@JsonProperty("city_name")
    private String cityName;

    @Column(name = "LEAD_SOURCE")
	@JsonProperty("lead_source")
    private String leadSource;

    @Column(name = "HASH")
	@JsonProperty("hash")
    private String HASH;

    @Column(name = "LEADATTRIBUTES", columnDefinition = "json")
	@JsonProperty("leadattributes")
    private String LEADATTRIBUTES;

    @Column(name = "CALLED_NUMBER")
	@JsonProperty("called_number")
    private String calledNumber;

    
}