package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RESIDENCE_ATTRIBUTE")
public class ResidenceAttribute {
	
	@Id
	@GeneratedValue
	@Column(name="RESIDENCE_ATTRIBUTE_ID")
	private int residenceAttributeId;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "RESIDENCE_ID")
    private Residence residence;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "ATTRIBUTE_ID")
    private Attribute attribute;
     
	@Column(name="PRICE", nullable=false)
    private int price;
	
	@Column(name="PRICE_TYPE", nullable=false)
	private PriceType priceType;

	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public int getResidenceAttributeId() {
		return residenceAttributeId;
	}

	public void setResidenceAttributeId(int residenceAttributeId) {
		this.residenceAttributeId = residenceAttributeId;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public PriceType getPriceType() {
		return priceType;
	}

	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribute == null) ? 0 : attribute.hashCode());
		result = prime * result + price;
		result = prime * result + ((priceType == null) ? 0 : priceType.hashCode());
		result = prime * result + ((residence == null) ? 0 : residence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ResidenceAttribute))
			return false;
		ResidenceAttribute other = (ResidenceAttribute) obj;
		if (attribute == null) {
			if (other.attribute != null)
				return false;
		} else if (attribute.getAttributeId() != (other.attribute.getAttributeId()))
			return false;
		if (price != other.price)
			return false;
		if (priceType != other.priceType)
			return false;
		if (residence == null) {
			if (other.residence != null)
				return false;
		} else if (residence.getResidenceId() != (other.residence.getResidenceId()))
			return false;
		return true;
	}
 
}
