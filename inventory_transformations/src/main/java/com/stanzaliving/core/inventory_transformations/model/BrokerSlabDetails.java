package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "BROKER_SLAB_DETAILS")
public class BrokerSlabDetails {

	@Id()
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="BROKER_SLAB_ID")
	private BrokerSlab brokerSlabId;
	
	@Column(name="MIN_LEADS",nullable=false)
	private int minLeads;
	
	@Column(name="MAX_LEADS",nullable=false)
	private int maxLeads;

	@Column(name="AMOUNT_PER_LEADS",nullable=false)
	private int amountPerLeads;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BrokerSlab getBrokerSlabId() {
		return brokerSlabId;
	}

	public void setBrokerSlabId(BrokerSlab brokerSlabId) {
		this.brokerSlabId = brokerSlabId;
	}

	public int getMinLeads() {
		return minLeads;
	}

	public void setMinLeads(int minLeads) {
		this.minLeads = minLeads;
	}

	public int getMaxLeads() {
		return maxLeads;
	}

	public void setMaxLeads(int maxLeads) {
		this.maxLeads = maxLeads;
	}

	public int getAmountPerLeads() {
		return amountPerLeads;
	}

	public void setAmountPerLeads(int amountPerLeads) {
		this.amountPerLeads = amountPerLeads;
	}

	
}
