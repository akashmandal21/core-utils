package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "OCCUPANCY")
public class Occupancy {
	
	@Id
	@GeneratedValue
	@Column(name="OCCUPANCY_ID")
	private int occupancyId;
	
	@Column(name="NAME",nullable=false)
	private String name;

	@Column(name="OCCUPANCY",nullable=false)
	private int occupancy;
	
	@OneToMany(mappedBy="occupancy", fetch = FetchType.LAZY)
	private Set<ResidenceOccupancy> residenceOccupancies;
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getOccupancyId() {
		return occupancyId;
	}

	public void setOccupancyId(int occupancyId) {
		this.occupancyId = occupancyId;
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public Set<ResidenceOccupancy> getResidenceOccupancies() {
		return residenceOccupancies;
	}

	public void setResidenceOccupancies(Set<ResidenceOccupancy> residenceOccupancies) {
		this.residenceOccupancies = residenceOccupancies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + occupancy;
		result = prime * result + occupancyId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Occupancy))
			return false;
		Occupancy other = (Occupancy) obj;
		if (enabled != other.enabled)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occupancy != other.occupancy)
			return false;
		if (occupancyId != other.occupancyId)
			return false;
		return true;
	}
	
}
