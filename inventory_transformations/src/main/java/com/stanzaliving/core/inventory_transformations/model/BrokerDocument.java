package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "BROKER_DOCUMENT")
public class BrokerDocument {

	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="BROKER_ID")
	private Broker brokerId;
	
	@Column(name="IMG_URL",nullable=false)
	private String imgURL;
	
	@Column(name="TYPE",nullable=false)
	private String type;

	@Column(name="NAME_ON_DOCUMENT",nullable=true)
	private String nameOnDocument;

	@Column(name="DOCUMENT_ID",nullable=true)
	private String documentId;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Broker getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(Broker brokerId) {
		this.brokerId = brokerId;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameOnDocument() {
		return nameOnDocument;
	}

	public void setNameOnDocument(String nameOnDocument) {
		this.nameOnDocument = nameOnDocument;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brokerId == null) ? 0 : brokerId.hashCode());
		result = prime * result + id;
		result = prime * result + ((imgURL == null) ? 0 : imgURL.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BrokerDocument))
			return false;
		BrokerDocument other = (BrokerDocument) obj;
		if (brokerId == null) {
			if (other.brokerId != null)
				return false;
		} else if (!brokerId.equals(other.brokerId))
			return false;
		if (id != other.id)
			return false;
		if (imgURL == null) {
			if (other.imgURL != null)
				return false;
		} else if (!imgURL.equals(other.imgURL))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
