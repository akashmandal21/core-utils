package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BROKER_SLAB")
public class BrokerSlab {

	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="SLAB_NAME",nullable=false)
	private String slabName;
	
	@OneToMany(mappedBy="brokerSlabId", cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private Set<BrokerSlabDetails> slabDetails = new HashSet<>(0);
	
	@Column(name="RESTRICTED_VISIBILITY",nullable=false)
	private boolean restrictedVisibility;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSlabName() {
		return slabName;
	}

	public void setSlabName(String slabName) {
		this.slabName = slabName;
	}

	public Set<BrokerSlabDetails> getSlabDetails() {
		return slabDetails;
	}

	public void setSlabDetails(Set<BrokerSlabDetails> slabDetails) {
		this.slabDetails = slabDetails;
	}

	public boolean isRestrictedVisibility() {
		return restrictedVisibility;
	}

	public void setRestrictedVisibility(boolean restrictedVisibility) {
		this.restrictedVisibility = restrictedVisibility;
	}
	
}
