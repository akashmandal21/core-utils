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
	@JsonProperty("ID")
    private Integer ID;

    @Column(name = "IMG_URL", nullable = false)
	@JsonProperty("IMG_URL")
    private String imgUrl;

    @Column(name = "TYPE", nullable = false)
	@JsonProperty("TYPE")
    private String TYPE;

    @Column(name = "BROKER_ID")
	@JsonProperty("BROKER_ID")
    private Integer brokerId;

    @Column(name = "NAME_ON_DOCUMENT")
	@JsonProperty("NAME_ON_DOCUMENT")
    private String nameOnDocument = "";

    @Column(name = "DOCUMENT_ID")
	@JsonProperty("DOCUMENT_ID")
    private String documentId = "";

    
}