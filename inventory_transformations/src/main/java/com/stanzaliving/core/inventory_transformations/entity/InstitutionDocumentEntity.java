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
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "IMG_URL", nullable = false)
	@JsonProperty("img_url")
    private String imgUrl;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("type")
    private String TYPE;

    @Column(name = "INSTITUTION_ID")
	@JsonProperty("institution_id")
    private Integer institutionId;

    
}