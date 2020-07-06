package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COUNTRY")
@Data
public class CountryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID", insertable = false, nullable = false)
	@JsonProperty("COUNTRY_ID")
    private Integer countryId;

    @Column(name = "NAME")
	@JsonProperty("NAME")
    private String NAME;

    @Column(name = "CODE")
	@JsonProperty("CODE")
    private String CODE;

    
}