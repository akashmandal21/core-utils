package com.stanzaliving.core.inventory_transformations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "AGREEMENT_ADDENDUM_MAPPING")
public class AgreementAddendumMapping {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "AGREEMENT_DOCUMENT_ID")
	private String agreementDocumentId;

	@Column(name = "ADDENDUM_DOCUMENT_ID")
	private String addendumDocumentId;

	@Column(name = "ADDENDUM_URL")
	private String addendumUrl;

	@Column(name = "ADDENDUM_DOCUMENT_IS_SIGNED")
	private boolean signed;

}
