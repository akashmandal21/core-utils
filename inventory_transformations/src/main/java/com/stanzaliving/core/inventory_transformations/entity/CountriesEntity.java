package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "countries")
public class CountriesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
	@JsonProperty("id")
    private Long id;

    @Column(name = "created_at")
	@JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "created_by", columnDefinition = "char")
	@JsonProperty("created_by")
    private String createdBy;

    @Column(name = "status")
	@JsonProperty("status")
    private Boolean status = Boolean.FALSE;

    @Column(name = "updated_at")
	@JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(name = "updated_by", columnDefinition = "char")
	@JsonProperty("updated_by")
    private String updatedBy;

    @Column(name = "uuid", nullable = false, columnDefinition = "char")
	@JsonProperty("uuid")
    private String uuid;

    @Column(name = "country_name")
	@JsonProperty("country_name")
    private String countryName;

    @Column(name = "currency")
	@JsonProperty("currency")
    private String currency;

    @Column(name = "localization")
	@JsonProperty("localization")
    private String localization;

    
}