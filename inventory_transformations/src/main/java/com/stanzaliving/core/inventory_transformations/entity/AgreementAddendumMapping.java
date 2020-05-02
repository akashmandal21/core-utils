package com.stanzaliving.core.inventory_transformations.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "AGREEMENT_ADDENDUM_MAPPING")
public class AgreementAddendumMapping implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "AGREEMENT_DOCUMENT_ID")
    private String agreementDocumentId;

    @Column(name = "ADDENDUM_DOCUMENT_ID")
    private String addendumDocumentId;

    @Column(name = "ADDENDUM_URL")
    private String addendumUrl;

    @Column(name = "ADDENDUM_DOCUMENT_IS_SIGNED")
    private String addendumDocumentIsSigned;

    
}