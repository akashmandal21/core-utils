package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RESIDENCE_OCCUPANCY")
public class ResidenceOccupancy {
	
	@Id
	@GeneratedValue
	@Column(name="RESIDENCE_OCCUPANCY_ID")
	private int residenceOccupancyId;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "RESIDENCE_ID")
    private Residence residence;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "OCCUPANCY_ID")
    private Occupancy occupancy;
     
	@Column(name="BASE_PRICE", nullable=false)
    private int basePrice;
	
	@Column(name="MANDATORY_SERVICE_PRICE", nullable=false)
    private int mandatoryServicePrice;

	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public int getResidenceOccupancyId() {
		return residenceOccupancyId;
	}

	public void setResidenceOccupancyId(int residenceOccupancyId) {
		this.residenceOccupancyId = residenceOccupancyId;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public Occupancy getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(Occupancy occupancy) {
		this.occupancy = occupancy;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public int getMandatoryServicePrice() {
		return mandatoryServicePrice;
	}

	public void setMandatoryServicePrice(int mandatoryServicePrice) {
		this.mandatoryServicePrice = mandatoryServicePrice;
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
		result = prime * result + basePrice;
		result = prime * result + ((occupancy == null) ? 0 : occupancy.hashCode());
		result = prime * result + ((residence == null) ? 0 : residence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ResidenceOccupancy))
			return false;
		ResidenceOccupancy other = (ResidenceOccupancy) obj;
		if (basePrice != other.basePrice)
			return false;
		if (occupancy == null) {
			if (other.occupancy != null)
				return false;
		} else if (occupancy.getOccupancyId()!=(other.occupancy.getOccupancyId()))
			return false;
		if (residence == null) {
			if (other.residence != null)
				return false;
		} else if (residence.getResidenceId() != (other.residence.getResidenceId()))
			return false;
		return true;
	}
 
}