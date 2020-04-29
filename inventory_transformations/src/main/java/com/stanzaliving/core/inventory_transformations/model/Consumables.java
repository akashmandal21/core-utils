package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CONSUMABLES")
public class Consumables {
	
	@Id
	@GeneratedValue
	@Column(name="CONSUMABLES_ID")
	private int consumablesId;
	
	@Column(name="NAME",nullable=false)
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "consumables")
	private Set<Residence> residences = new HashSet<>(0);
		
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public int getConsumablesId() {
		return consumablesId;
	}

	public void setConsumablesId(int consumablesId) {
		this.consumablesId = consumablesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Residence> getResidences() {
		return residences;
	}

	public void setResidences(Set<Residence> residences) {
		this.residences = residences;
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
	
}
