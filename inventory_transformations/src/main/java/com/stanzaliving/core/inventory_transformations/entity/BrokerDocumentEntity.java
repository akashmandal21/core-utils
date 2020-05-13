package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "BROKER_DOCUMENT")
public class BrokerDocumentEntity implements Serializable {
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

    @Column(name = "BROKER_ID")
	@JsonProperty("broker_id")
    private Integer brokerId;

    @Column(name = "NAME_ON_DOCUMENT")
	@JsonProperty("name_on_document")
    private String nameOnDocument = "";

    @Column(name = "DOCUMENT_ID")
	@JsonProperty("document_id")
    private String documentId = "";

    
}