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
	@JsonProperty("ID")
    private Long id;

    @Column(name = "created_at")
	@JsonProperty("CREATED_AT")
    private Timestamp createdAt;

    @Column(name = "created_by", columnDefinition = "char")
	@JsonProperty("CREATED_BY")
    private String createdBy;

    @Column(name = "status")
	@JsonProperty("STATUS")
    private Boolean status = Boolean.FALSE;

    @Column(name = "updated_at")
	@JsonProperty("UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "updated_by", columnDefinition = "char")
	@JsonProperty("UPDATED_BY")
    private String updatedBy;

    @Column(name = "uuid", nullable = false, columnDefinition = "char")
	@JsonProperty("UUID")
    private String uuid;

    @Column(name = "country_name")
	@JsonProperty("COUNTRY_NAME")
    private String countryName;

    @Column(name = "currency")
	@JsonProperty("CURRENCY")
    private String currency;

    @Column(name = "localization")
	@JsonProperty("LOCALIZATION")
    private String localization;

    
}