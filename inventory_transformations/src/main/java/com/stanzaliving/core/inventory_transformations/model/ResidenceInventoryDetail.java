package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESIDENCE_INVENTORY_DETAIL")
public class ResidenceInventoryDetail {
	
	@Id
    private int residenceId;
 
	@JoinColumn(name="RESIDENCE_ID")
    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.PERSIST)
    @MapsId
    private Residence residence;
	
	@Column(name="TOTAL_INVENTORY",nullable=false)
	private float totalInventory;
	
	@Column(name="BLOCKED_INVENTORY",nullable=false)
	private float blockedInventory;
	
	@Column(name="DEAD_INVENTORY",nullable=false)
	private float deadInventory;
	
	@Column(name="OCCUPIED_INVENTORY",nullable=false)
	private float occupiedInventory;
	
	@Column(name="AVAILABLE_INVENTORY",nullable=false)
	private float availableInventory;
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public ResidenceInventoryDetail() {
		
	}
	
	public ResidenceInventoryDetail(int residenceId, Residence residence, int totalInventory, int blockedInventory,
			int deadInventory, int occupiedInventory, int availableInventory, Date created, Date updated,
			boolean enabled) {
		super();
		this.residenceId = residenceId;
		this.residence = residence;
		this.totalInventory = totalInventory;
		this.blockedInventory = blockedInventory;
		this.deadInventory = deadInventory;
		this.occupiedInventory = occupiedInventory;
		this.availableInventory = availableInventory;
		this.created = created;
		this.updated = updated;
		this.enabled = enabled;
	}
	
	public int getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(int id) {
		this.residenceId = id;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public float getTotalInventory() {
		return totalInventory;
	}

	public void setTotalInventory(float totalInventory) {
		this.totalInventory = totalInventory;
	}

	public float getBlockedInventory() {
		return blockedInventory;
	}

	public void setBlockedInventory(float blockedInventory) {
		this.blockedInventory = blockedInventory;
	}

	public float getDeadInventory() {
		return deadInventory;
	}

	public void setDeadInventory(float deadInventory) {
		this.deadInventory = deadInventory;
	}

	public float getOccupiedInventory() {
		return occupiedInventory;
	}

	public void setOccupiedInventory(float occupiedInventory) {
		this.occupiedInventory = occupiedInventory;
	}

	public float getAvailableInventory() {
		return availableInventory;
	}

	public void setAvailableInventory(float availableInventory) {
		this.availableInventory = availableInventory;
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
