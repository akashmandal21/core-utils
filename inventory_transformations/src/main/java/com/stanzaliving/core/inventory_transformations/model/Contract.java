package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTRACT")
public class Contract {
	
	@Id
	@GeneratedValue
	@Column(name="CONTRACT_ID")
	private int contractId;
	
	@Column(name="NAME",nullable=false)
	private String name;
	
//	@Column(name="MONTHS",nullable=false)
//	private int months;

	@Column(name="MONTHS",nullable=false)
	private double months;
	
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "contracts")
//	private Set<Residence> residences = new HashSet<>(0);
		
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonths() {
		return months;
	}

	public void setMonths(double months) {
		this.months = months;
	}

//	public Set<Residence> getResidences() {
//		return residences;
//	}
//
//	public void setResidences(Set<Residence> residences) {
//		this.residences = residences;
//	}

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
		result = prime * result + contractId;
		result = prime * result + (enabled ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(months);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contract other = (Contract) obj;
		if (contractId != other.contractId)
			return false;
		if (enabled != other.enabled)
			return false;
		if (Double.doubleToLongBits(months) != Double.doubleToLongBits(other.months))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		return true;
	}


	
}
