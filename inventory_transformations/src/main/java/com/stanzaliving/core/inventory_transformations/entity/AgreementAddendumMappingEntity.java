package com.stanzaliving.core.inventory_transformations.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "AGREEMENT_ADDENDUM_MAPPING")
public class AgreementAddendumMappingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
	@JsonProperty("id")
    private Integer ID;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
	@JsonProperty("agreement_document_id")
    private String agreementDocumentId;

    @Column(name = "ADDENDUM_DOCUMENT_ID")
	@JsonProperty("addendum_document_id")
    private String addendumDocumentId;

    @Column(name = "ADDENDUM_URL")
	@JsonProperty("addendum_url")
    private String addendumUrl;

    @Column(name = "ADDENDUM_DOCUMENT_IS_SIGNED")
	@JsonProperty("addendum_document_is_signed")
    private String addendumDocumentIsSigned;

    
}