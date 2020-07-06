package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INSTITUTION_DOCUMENT")
@Data
public class InstitutionDocumentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "IMG_URL", nullable = false)
	@JsonProperty("IMG_URL")
    private String imgUrl;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "INSTITUTION_ID")
	@JsonProperty("INSTITUTION_ID")
    private Integer institutionId;

    
}